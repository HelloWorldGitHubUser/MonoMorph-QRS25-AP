package org.mybatis.jpetstore.Interface;
public interface Cart {

   public boolean containsItemId(String itemId);
   public void addItem(Item item,boolean isInStock);
   public void incrementQuantityByItemId(String itemId);
   public Item removeItemById(String itemId);
}