package cn.edu.xmu.restfuldemo.mapper;
import cn.edu.xmu.restfuldemo.bean.OrderItemPo;
import cn.edu.xmu.restfuldemo.bean.OrdersPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List <OrdersPo> findOrders(OrdersPo ordersPo);

    List<OrderItemPo> findOrderItem(OrderItemPo orderItemPo);

    List<OrdersPo> findOrdersWithOrderItem(OrdersPo ordersPo);

    int createOrders(OrdersPo ordersPo);

    int createOrderItem(OrderItemPo orderItemPo);


}
