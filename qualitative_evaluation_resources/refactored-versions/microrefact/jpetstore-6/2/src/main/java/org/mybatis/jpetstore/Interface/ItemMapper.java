package org.mybatis.jpetstore.Interface;
public interface ItemMapper {

   public void updateInventoryQuantity(Map<String,Object> param);
   public Item getItem(String itemId);
   public int getInventoryQuantity(String itemId);
}