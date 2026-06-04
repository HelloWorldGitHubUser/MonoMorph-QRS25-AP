package org.mybatis.jpetstore.web.actions;
 import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;
import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.service.CatalogService;
import org.mybatis.jpetstore.Interface.Cart;
import org.mybatis.jpetstore.DTO.CartItem;
import org.mybatis.jpetstore.Interface.CartImpl;
@SessionScope
public class CartActionBean extends AbstractActionBean{

 private  long serialVersionUID;

 private  String VIEW_CART;

 private  String CHECK_OUT;

@SpringBean
 private  CatalogService catalogService;

 private  Cart cart;

 private  String workingItemId;


public Resolution updateCartQuantities(){
    HttpServletRequest request = context.getRequest();
    Iterator<CartItem> cartItems = getCart().getAllCartItems();
    while (cartItems.hasNext()) {
        CartItem cartItem = cartItems.next();
        String itemId = cartItem.getItem().getItemId();
        try {
            int quantity = Integer.parseInt(request.getParameter(itemId));
            getCart().setQuantityByItemId(itemId, quantity);
            if (quantity < 1) {
                cartItems.remove();
            }
        } catch (Exception e) {
        // ignore parse exceptions on purpose
        }
    }
    return new ForwardResolution(VIEW_CART);
}


public void clear(){
    cart = new CartImpl();
    workingItemId = null;
}


public void setCart(Cart cart){
    this.cart = cart;
}


public void setWorkingItemId(String workingItemId){
    this.workingItemId = workingItemId;
}


public ForwardResolution viewCart(){
    return new ForwardResolution(VIEW_CART);
}


public Cart getCart(){
    return cart;
}


public Resolution addItemToCart(){
    if (cart.containsItemId(workingItemId)) {
        cart.incrementQuantityByItemId(workingItemId);
    } else {
        // isInStock is a "real-time" property that must be updated
        // every time an item is added to the cart, even if other
        // item details are cached.
        boolean isInStock = catalogService.isItemInStock(workingItemId);
        Item item = catalogService.getItem(workingItemId);
        cart.addItem(item, isInStock);
    }
    return new ForwardResolution(VIEW_CART);
}


public ForwardResolution checkOut(){
    return new ForwardResolution(CHECK_OUT);
}


public Resolution removeItemFromCart(){
    Item item = cart.removeItemById(workingItemId);
    if (item == null) {
        setMessage("Attempted to remove null CartItem from Cart.");
        return new ForwardResolution(ERROR);
    } else {
        return new ForwardResolution(VIEW_CART);
    }
}


}
