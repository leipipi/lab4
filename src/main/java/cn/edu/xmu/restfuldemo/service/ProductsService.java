package cn.edu.xmu.restfuldemo.service;

import cn.edu.xmu.restfuldemo.bean.*;
import cn.edu.xmu.restfuldemo.util.RedisUtil;
import cn.edu.xmu.restfuldemo.util.ResponseCode;
import org.slf4j.Logger;
import cn.edu.xmu.restfuldemo.dao.ProductDao;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.edu.xmu.restfuldemo.util.ReturnObject;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private ProductDao productDao;

    public ReturnObject<VoObject> findById(Integer id){
        ProductPo queryObj = new ProductPo();

        String key="product"+id;//redis所需的key


        queryObj.setId(id);
        ReturnObject<List<Products>> returnObject;
        if(redisUtil.hasKey(key))//缓存中有查询的数据
        {
            returnObject=(Product)redisUtil.get(key);
            ReturnObject<VoObject> retProducts = null;
            if (returnObject.getCode().equals(ResponseCode.OK)) {
                if (returnObject.getData().size() == 1) {
                    retProducts = new ReturnObject<>(returnObject.getData().get(0));
                }else{
                    retProducts  = new ReturnObject<>(ResponseCode.RESOURCE_ID_NOTEXIST);
                }
            }else{
                retProducts  = new ReturnObject<>(returnObject.getCode(), returnObject.getErrmsg());
            }
            System.out.println("此次查询使用了redis缓存");
            return retProducts;
        }
        else{
            returnObject=productDao.findProducts(queryObj);
            ReturnObject<VoObject> retProducts = null;
            if (returnObject.getCode().equals(ResponseCode.OK)) {
                if (returnObject.getData().size() == 1) {
                    retProducts = new ReturnObject<>(returnObject.getData().get(0));
                }else{
                    retProducts  = new ReturnObject<>(ResponseCode.RESOURCE_ID_NOTEXIST);
                }
            }else{
                retProducts  = new ReturnObject<>(returnObject.getCode(), returnObject.getErrmsg());
            }
            System.out.println("此次查询在数据库中进行");
            System.out.println(redisUtil.set(key,retProducts) ? "该信息不在缓存中,插入缓存,插入成功" : "插入失败");
            return retProducts ;
        }
    }
}

