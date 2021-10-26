package cn.edu.xmu.restfuldemo.mapper;

import cn.edu.xmu.restfuldemo.bean.Products;
import cn.edu.xmu.restfuldemo.bean.ProductsPo;

import java.util.List;

public interface ProductMapper {
    List<ProductsPo> findProductsWithGood(ProductsPo productPo);
}
