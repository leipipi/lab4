package cn.edu.xmu.restfuldemo.bean;

import lombok.Data;

import java.util.Date;

@Data
public class GoodsVo {
    private Integer id;
    private String name;
    private String goods_sn;
    private String image_url;
    private Integer state;
    private Date gmt_create;
    private Date gmt_modified;
    private Boolean disable;
    public GoodsVo(Goods goods)
    {
        this.id=goods.getId();
        this.name=goods.getName();
        this.goods_sn=goods.getGoodsSn();
        this.image_url=goods.getImageUrl();
        this.state=goods.getState();
        this.gmt_create=goods.getGmtCreate();
        this.gmt_modified=goods.getGmtModified();
        this.disable=goods.getDisabled();
    }
    public Goods createGoodsVo()
    {
        Goods goods=new Goods();
        goods.setId(this.id);
        goods.setName(this.name);
        goods.setGoodsSn(this.goods_sn);
        goods.setImageUrl(this.image_url);
        goods.setState(this.state);
        goods.setGmtCreate(this.gmt_create);
        goods.setGmtModified(this.gmt_modified);
        goods.setDisabled(this.disable);
        return goods;
    }
}
