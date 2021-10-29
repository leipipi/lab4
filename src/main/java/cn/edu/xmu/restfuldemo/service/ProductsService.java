package cn.edu.xmu.restfuldemo.service;

import cn.edu.xmu.restfuldemo.bean.Products;
import cn.edu.xmu.restfuldemo.bean.ProductsPo;
import cn.edu.xmu.restfuldemo.bean.VoObject;
import cn.edu.xmu.restfuldemo.util.RedisUtil;
import cn.edu.xmu.restfuldemo.util.ResponseCode;
import cn.edu.xmu.restfuldemo.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.edu.xmu.restfuldemo.util.ReturnObject;

import java.util.List;

@Service
public class ProductsService {



    @Autowired
    private ProductDao productDao;

    public ReturnObject<VoObject> findById(Integer id){
        ProductsPo queryObj = new ProductsPo();
        queryObj.setId(id);
        ReturnObject<List<Products>> returnObject=productDao.findProducts(queryObj);
       ReturnObject<VoObject> retProducts=null;
       retProducts=new ReturnObject<>(returnObject.getData().get(0));
       return retProducts;
    }
    public ReturnObject<VoObject> findByIdWithoutRedis(Integer id){
        ProductsPo queryObj = new ProductsPo();
        queryObj.setId(id);
        ReturnObject<List<Products>> returnObject=productDao.findProductsWithoutRedis(queryObj);
        ReturnObject<VoObject> retProducts=null;
        retProducts=new ReturnObject<>(returnObject.getData().get(0));
        return retProducts;
    }
}

