package org.mybatis.jpetstore.mapper;
 import java.util.List;
import org.mybatis.jpetstore.domain.Order;
public interface OrderMapper {


public void insertOrder(Order order)
;

public void insertOrderStatus(Order order)
;

public Order getOrder(int orderId)
;

public List<Order> getOrdersByUsername(String username)
;

}