package cn.edu.xmu.restfuldemo.dao;

import cn.edu.xmu.restfuldemo.mapper.ProductMapper;
import cn.edu.xmu.restfuldemo.bean.*;
//import cn.edu.xmu.restfuldemo.util.Common;
import cn.edu.xmu.restfuldemo.bean.ProductsVo;
import cn.edu.xmu.restfuldemo.util.ReturnObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductDao {
    @Autowired
    private ProductMapper productMapper;

    public ReturnObject<List<Products>> findProduct(ProductsPo productsPo)
    {
        List<ProductsPo> productPos=productMapper.findProducts(productsPo);
        List<Products> retProducts=new ArrayList<>(productPos.size());
        GoodsPo goodsPo=null;


    }
}
