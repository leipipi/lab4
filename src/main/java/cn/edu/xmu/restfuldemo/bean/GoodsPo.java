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
    private Integer goods_sku_id;
    private String sku_sn;
    private Integer brand_id;
    private Integer category_id;
    private Integer freight_id;
    private Integer shop_id;
    private String goods_sn;
    private String name;
    private Integer original_price;
    private String configuration;
    private Integer weight;
    private String image_url;
    private Integer inventory;
    private String detail;
    private Boolean disable;
    private Date gmt_create;
    private Date gmt_modified;
    private Integer state;
    private Integer product_id;

}
