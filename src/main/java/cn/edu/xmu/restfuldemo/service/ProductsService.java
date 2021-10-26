package cn.edu.xmu.restfuldemo.service;

import cn.edu.xmu.restfuldemo.bean.*;
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
    private Logger logger = LoggerFactory.getLogger(ProductsService.class);

    @Autowired
    private ProductDao productDao;

    public ReturnObject<VoObject> findById(Integer id){
        ProductPo queryObj = new ProductPo();
        queryObj.setId(id);
        ReturnObject<List<Products>> returnObject=productDao.findProductsWithGood(queryObj);
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
        return retProducts ;
    }
}

