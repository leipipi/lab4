package cn.edu.xmu.restfuldemo.bean;

import java.util.Date;

public class ProductVo {
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
    private Goods goods;
    public ProductVo(Product product)
    {
        this.id=product.getId();
        this.name=product.getName();
        this.skuSn=product.getSkuSn();
        this.detail=product.getDetail();
        this.imageUrl=product.getImageUrl();
        this.originalPrice=product.getOriginalPrice();
        this.price=product.getPrice();
        this.inventory=product.getInventory();
        this.state=product.getState();
        this.weight=product.getWeight();
        this.gmtCreate=product.getGmtCreate();
        this.gmtModified=product.getGmtModified();
        this.goods=product.getGoods();
    }
}
