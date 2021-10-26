package cn.edu.xmu.restfuldemo.dao;

import cn.edu.xmu.restfuldemo.mapper.GoodsMapper;
import cn.edu.xmu.restfuldemo.mapper.ProductMapper;
import cn.edu.xmu.restfuldemo.bean.*;
//import cn.edu.xmu.restfuldemo.util.Common;
import cn.edu.xmu.restfuldemo.bean.ProductVo;
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

    public ReturnObject<List<Product>> findProduct(ProductPo productPo)
    {
        List<ProductPo> productPos=productMapper.findProduct(productPo);
        List<Product> retProducts=new ArrayList<>(productPos.size());
        for(ProductPo productPo1:productPos)
        {
            Product product=new Product((productPo1));
        }
        return new ReturnObject<>(retProducts);

    }
}
