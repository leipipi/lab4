package cn.edu.xmu.restfuldemo.bean;

import lombok.*;

import java.math.BigDecimal;
import org.apache.ibatis.type.Alias;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("GoodsPo")
public class GoodsPo {
    private Integer id;
    private Integer goodsSkuId;
    private String skuSn;
    private Integer brandId;
    private Integer categoryId;
    private Integer freightId;
    private Integer shopId;
    private String goodsSn;
    private String name;
    private Integer originalPrice;
    private String configuration;
    private Integer weight;
    private String imageUrl;
    private Integer inventory;
    private String detail;
    private Integer disabled;
    private Date gmtCreate;
    private Date gmtModified;
    private Integer state;

}
