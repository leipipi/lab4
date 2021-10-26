package cn.edu.xmu.restfuldemo.bean;

import java.util.Date;

public class GoodsVo {
    private Integer id;
    private String name;
    private String detail;
    private String imageUrl;
    private Integer originalPrice;
    private Integer inventory;
    private Integer state;
    private String configuration;
    private Integer weight;
    private Date gmtCreate;
    private Date gmtModified;
    private Integer disabled;
    public GoodsVo()
    {
        Goods goods=new Goods();
        this.id=goods.getId();
        this.name=goods.getName();
        this.detail=goods.getDetail();
        this.imageUrl=goods.getImageUrl();
        this.originalPrice=goods.getOriginalPrice();
        this.inventory=goods.getInventory();
        this.state=goods.getState();
        this.configuration=goods.getConfiguration();
        this.weight=goods.getWeight();
        this.gmtModified=goods.getGmtCreate();
        this.gmtCreate=goods.getGmtCreate();
        this.disabled=goods.getDisabled();
    }
}
