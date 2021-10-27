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
@Alias("ProductPo")
public class ProductsPo {
    private Integer id;
    private Integer goodsId;
    private Integer productSn;
    private String skuSn;
    private String name;
    private Integer originalPrice;
    private Integer price;
    private Integer weight;
    private String imageUrl;
    private Integer inventory;
    private Integer state;
    private String detail;
    private Date gmtCreate;
    private Date gmtModified;
    private Boolean disable;
    private Boolean shareable;
    private List<GoodsPo> goods_list;
}
