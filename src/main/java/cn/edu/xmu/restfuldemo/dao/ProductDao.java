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

    public ReturnObject<List<Products>> findProducts(ProductsPo productsPo)
    {
        System.out.println("daozhong---------------");
        List<ProductsPo> productsPos =productMapper.findProducts(productsPo);
        List<Products> retProducts=new ArrayList<>(productsPos.size());
        GoodsPo goodsPo=new GoodsPo();
        for(ProductsPo goods:productsPos)
        {
            Products item=new Products(goods);
            goodsPo.setId(goods.getGoodsId());
            List<GoodsPo> goodsPos=productMapper.findGoods(goodsPo);
            List<Goods> goodsList=new ArrayList<>(goodsPos.size());
            for(GoodsPo Good:goodsPos){
                Goods good=new Goods(Good);
                goodsList.add(good);
            }
            item.setGoods_list(goodsList);
        }
        return new ReturnObject<>(retProducts);
    }
}
