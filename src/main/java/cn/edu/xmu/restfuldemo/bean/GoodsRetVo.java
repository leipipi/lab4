package cn.edu.xmu.restfuldemo.bean;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

@Data
public class GoodsRetVo {
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
    public GoodsRetVo(Goods goods)
    {
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
