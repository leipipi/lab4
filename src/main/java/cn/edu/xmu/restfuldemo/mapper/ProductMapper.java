package cn.edu.xmu.restfuldemo.mapper;

import cn.edu.xmu.restfuldemo.bean.Goods;
import cn.edu.xmu.restfuldemo.bean.GoodsPo;
import cn.edu.xmu.restfuldemo.bean.Products;
import cn.edu.xmu.restfuldemo.bean.ProductsPo;

import java.util.List;

public interface ProductMapper {
    List<ProductsPo> findProducts(ProductsPo productPo);

    List<GoodsPo> findGoods(GoodsPo goodsPo);
}
