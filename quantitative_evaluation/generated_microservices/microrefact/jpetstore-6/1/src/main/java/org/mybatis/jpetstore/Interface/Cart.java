package org.mybatis.jpetstore.Interface;
import org.mybatis.jpetstore.domain.Item;
import java.util.Iterator;
import org.mybatis.jpetstore.DTO.CartItem;
public interface Cart {

   public boolean containsItemId(String itemId);
   public void addItem(Item item,boolean isInStock);
   public void incrementQuantityByItemId(String itemId);
   public Item removeItemById(String itemId);
   public Iterator<CartItem> getAllCartItems();
   public void setQuantityByItemId(String itemId, int q);
}
