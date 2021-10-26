package cn.edu.xmu.restfuldemo.mapper;

import cn.edu.xmu.restfuldemo.bean.Goods;
import cn.edu.xmu.restfuldemo.bean.GoodsPo;

import java.util.List;

public interface GoodsMapper {

    List<GoodsPo> findGoods(GoodsPo goodsPo);

    int createGoods(GoodsPo goodsPo);
}
