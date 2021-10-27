package cn.edu.xmu.restfuldemo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductsRetVo {
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
    private List<GoodsRetVo> goodsRetVos;
    public ProductsRetVo(Products products)
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
        if(null!=products.getGoods_list())
        {
            List<GoodsRetVo> GoodsRetVoList=new ArrayList<>(products.getGoods_list().size());
            for(Goods goods:products.getGoods_list())
            {
                GoodsRetVo GoodsRetVo=new GoodsRetVo(goods);
                GoodsRetVoList.add(GoodsRetVo);
            }
            this.goodsRetVos=GoodsRetVoList;
        }
    }
}
