package cn.edu.xmu.restfuldemo.dao;

import cn.edu.xmu.restfuldemo.mapper.ProductMapper;
import cn.edu.xmu.restfuldemo.bean.*;
//import cn.edu.xmu.restfuldemo.util.Common;
import cn.edu.xmu.restfuldemo.util.RedisUtil;
import cn.edu.xmu.restfuldemo.util.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductDao {
    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private RedisUtil redisUtil;

    public ReturnObject<List<Products>> findProducts(ProductsPo productsPo)
    {

        List<Products> retProducts=new ArrayList<>(1);

        String key="product"+productsPo.getId();//redis所需的key
        if(redisUtil.hasKey(key))//缓存中有查询的数据
        {
            Products products=(Products)redisUtil.get(key);
            GoodsPo goodsPo=new GoodsPo();
                goodsPo.setId(products.getGoodsId());
                List<GoodsPo> goodsPos=productMapper.findGoods(goodsPo);
                List<Goods> goodsList=new ArrayList<>(goodsPos.size());
                for(GoodsPo Good:goodsPos){
                    Goods good=new Goods(Good);
                    goodsList.add(good);
            }
            products.setGoods_list(goodsList);
            retProducts.add(products);
        }
        else
        {
            List<ProductsPo> productsPos =productMapper.findProducts(productsPo);
            GoodsPo goodsPo=new GoodsPo();
            goodsPo.setId(productsPos.get(0).getGoodsId());
            List<GoodsPo> goodsPos=productMapper.findGoods(goodsPo);
            List<Goods> goodsList=new ArrayList<>(goodsPos.size());
            Products products=new Products(productsPos.get(0));
            for(GoodsPo Good:goodsPos){
                Goods good=new Goods(Good);
                goodsList.add(good);
            }
            products.setGoods_list(goodsList);
            retProducts.add(products);
        }
        return new ReturnObject<>(retProducts);
    }
}
