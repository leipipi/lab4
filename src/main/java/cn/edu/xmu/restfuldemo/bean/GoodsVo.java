package cn.edu.xmu.restfuldemo.bean;

import java.util.Date;

public class GoodsVo {
    private Integer id;
    private String name;
    private String goodsSn;
    private String imageUrl;
    private Integer state;
    private Date gmtCreate;
    private Date gmtModified;
    private Integer disabled;
    public GoodsVo(Goods goods)
    {
        this.id=goods.getId();
        this.name=goods.getName();
        this.goodsSn=goods.getGoodsSn();
        this.imageUrl=goods.getImageUrl();
        this.state=goods.getState();
        this.gmtCreate=goods.getGmtCreate();
        this.gmtModified=goods.getGmtModified();
        this.disabled=goods.getDisabled();
    }
    public Goods createGoodsVo()
    {
        Goods goods=new Goods();
        goods.setId(this.id);
        goods.setName(this.name);
        goods.setGoodsSn(this.goodsSn);
        goods.setImageUrl(this.imageUrl);
        goods.setState(this.state);
        goods.setGmtCreate(this.gmtCreate);
        goods.setGmtModified(this.gmtModified);
        goods.setDisabled(this.disabled);
        return goods;
    }
}
