package cn.edu.xmu.restfuldemo.bean;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

@Data
public class GoodsRetVo {
    private Integer id;
    private String name;
    private String goods_sn;
    private String image_url;
    private Integer state;
    private Date gmt_create;
    private Date gmt_modified;
    private Boolean disable;
    public GoodsRetVo(Goods goods)
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

}
