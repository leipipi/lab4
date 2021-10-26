package cn.edu.xmu.restfuldemo.bean;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

@Data
public class GoodsRetVo {
    private Integer id;
    private String name;
    private String goodsSn;
    private String imageUrl;
    private Integer state;
    private Date gmtCreate;
    private Date gmtModified;
    private Integer disabled;
    public GoodsRetVo(Goods goods)
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

}
