package cn.edu.xmu.restfuldemo.dao;

import cn.edu.xmu.restfuldemo.mapper.ProductMapper;
import cn.edu.xmu.restfuldemo.bean.*;
//import cn.edu.xmu.restfuldemo.util.Common;
import cn.edu.xmu.restfuldemo.util.RedisUtil;
import cn.edu.xmu.restfuldemo.util.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
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

        String key="p_"+productsPo.getId();//redis所需的key
        if(redisUtil.hasKey(key))//缓存中有查询的数据
        {
            //System.out.println("use redis,key:"+key);
            Products products=(Products)redisUtil.get(key);
            GoodsPo goodsPo=new GoodsPo();
                goodsPo.setId(products.getGoodsId());
                //System.out.println(products.getGoodsId()+"-------111111111");
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
            goodsPo.setId(productsPos.get(0).getGoods_id());
            //System.out.println(productsPos.get(0).getGoods_id()+"-----------00000");
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
        if(retProducts.size()!=0)
        {
            //System.out.println("add into redis");
            redisUtil.set(key, retProducts.get(0), 600);
        }
        return new ReturnObject<>(retProducts);
    }
}
