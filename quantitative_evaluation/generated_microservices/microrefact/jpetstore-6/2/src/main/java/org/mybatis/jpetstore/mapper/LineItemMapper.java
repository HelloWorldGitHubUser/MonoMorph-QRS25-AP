package org.mybatis.jpetstore.mapper;
 import java.util.List;
import org.mybatis.jpetstore.domain.LineItem;
public interface LineItemMapper {


public List<LineItem> getLineItemsByOrderId(int orderId)
;

public void insertLineItem(LineItem lineItem)
;

}