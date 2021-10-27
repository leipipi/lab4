package cn.edu.xmu.restfuldemo.dao;

import cn.edu.xmu.restfuldemo.mapper.ProductMapper;
import cn.edu.xmu.restfuldemo.bean.*;
//import cn.edu.xmu.restfuldemo.util.Common;
import cn.edu.xmu.restfuldemo.util.ReturnObject;
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
        List<ProductsPo> productsPos =productMapper.findProduct(productsPo);
        List<Products> retProducts=new ArrayList<>(productsPos.size());
        for(ProductsPo productsPo1 : productsPos)
        {
            Products products =new Products((productsPo1));
        }
        return new ReturnObject<>(retProducts);

    }
}
