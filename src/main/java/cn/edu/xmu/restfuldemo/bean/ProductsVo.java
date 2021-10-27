package cn.edu.xmu.restfuldemo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductsVo {
    private Integer id;
    private String name;
    private String skuSn;
    private String detail;
    private String imageUrl;
    private Integer originalPrice;
    private Integer price;
    private Integer inventory;
    private Integer state;
    private Integer weight;
    private Date gmtCreate;
    private Date gmtModified;
    private Boolean disable;
    private Boolean shareable;
    private List<GoodsVo> goods_list;
    public ProductsVo(Products products)
    {
        this.id= products.getId();
        this.name= products.getName();
        this.skuSn= products.getSkuSn();
        this.detail= products.getDetail();
        this.imageUrl= products.getImageUrl();
        this.originalPrice= products.getOriginalPrice();
        this.price= products.getPrice();
        this.inventory= products.getInventory();
        this.state= products.getState();
        this.weight= products.getWeight();
        this.gmtCreate= products.getGmtCreate();
        this.gmtModified= products.getGmtModified();
        this.disable=products.getDisable();
        this.shareable=products.getShareable();
        if(null!=this.goods_list)
        {
            List<Goods> newGoodsList = new ArrayList<>(this.goods_list.size());

            for(GoodsVo goodsVo:this.goods_list){
                Goods goods=goodsVo.createGoodsVo();
                newGoodsList.add(goods);
            }
            products.setGoods_list(newGoodsList);
        }
    }
}
