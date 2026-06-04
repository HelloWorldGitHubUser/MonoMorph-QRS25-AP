package org.mybatis.jpetstore.mapper;
 import java.util.List;
import java.util.Map;
import org.mybatis.jpetstore.domain.Item;
public interface ItemMapper {


public int getInventoryQuantity(String itemId)
;

public void updateInventoryQuantity(Map<String,Object> param)
;

public List<Item> getItemListByProduct(String productId)
;

public Item getItem(String itemId)
;

}