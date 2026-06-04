package org.mybatis.jpetstore.Interface;
import org.mybatis.jpetstore.DTO.Item;
import java.util.Map;
public interface ItemMapper {

   public void updateInventoryQuantity(Map<String,Object> param);
   public org.mybatis.jpetstore.DTO.Item getItem(String itemId);
   public int getInventoryQuantity(String itemId);
}
