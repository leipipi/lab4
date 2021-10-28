package cn.edu.xmu.restfuldemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("ProductsPo")
public class ProductsPo {
    private Integer id;
    private String name;
    private String sku_sn;
    private String detail;
    private String image_url;
    private Integer original_price;
    private Integer price;
    private Integer inventory;
    private Integer state;
    private Integer weight;
    private Date gmt_create;
    private Date gmt_modified;
    private Boolean disable;
    private Boolean shareable;

    private Integer goods_id;
    private Integer productSn;

    private List<GoodsPo> goods_list;
}
