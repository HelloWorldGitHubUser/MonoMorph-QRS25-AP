package org.mybatis.jpetstore.web.actions;
 import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpSession;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;
import org.mybatis.jpetstore.domain.Order;
import org.mybatis.jpetstore.service.OrderService;
import org.mybatis.jpetstore.DTO.AccountActionBean;
import org.mybatis.jpetstore.DTO.CartActionBean;
@SessionScope
public class OrderActionBean extends AbstractActionBean{

 private  long serialVersionUID;

 private  String CONFIRM_ORDER;

 private  String LIST_ORDERS;

 private  String NEW_ORDER;

 private  String SHIPPING;

 private  String VIEW_ORDER;

 private  List<String> CARD_TYPE_LIST;

@SpringBean
 private  OrderService orderService;

 private  Order order;

 private  boolean shippingAddressRequired;

 private  boolean confirmed;

 private  List<Order> orderList;


public List<Order> getOrderList(){
    return orderList;
}


public Resolution listOrders(){
    HttpSession session = context.getRequest().getSession();
    AccountActionBean accountBean = (AccountActionBean) session.getAttribute("/actions/Account.action");
    orderList = orderService.getOrdersByUsername(accountBean.getAccount().getUsername());
    return new ForwardResolution(LIST_ORDERS);
}


public void clear(){
    order = new Order();
    shippingAddressRequired = false;
    confirmed = false;
    orderList = null;
}


public int getOrderId(){
    return order.getOrderId();
}


public void setShippingAddressRequired(boolean shippingAddressRequired){
    this.shippingAddressRequired = shippingAddressRequired;
}


public void setOrderId(int orderId){
    order.setOrderId(orderId);
}


public void setConfirmed(boolean confirmed){
    this.confirmed = confirmed;
}


public void setOrder(Order order){
    this.order = order;
}


public List<String> getCreditCardTypes(){
    return CARD_TYPE_LIST;
}


public Resolution viewOrder(){
    HttpSession session = context.getRequest().getSession();
    AccountActionBean accountBean = (AccountActionBean) session.getAttribute("accountBean");
    order = orderService.getOrder(order.getOrderId());
    if (accountBean.getAccount().getUsername().equals(order.getUsername())) {
        return new ForwardResolution(VIEW_ORDER);
    } else {
        order = null;
        setMessage("You may only view your own orders.");
        return new ForwardResolution(ERROR);
    }
}


public boolean isShippingAddressRequired(){
    return shippingAddressRequired;
}


public Resolution newOrderForm(){
    HttpSession session = context.getRequest().getSession();
    AccountActionBean accountBean = (AccountActionBean) session.getAttribute("/actions/Account.action");
    CartActionBean cartBean = (CartActionBean) session.getAttribute("/actions/Cart.action");
    clear();
    if (accountBean == null || !accountBean.isAuthenticated()) {
        setMessage("You must sign on before attempting to check out.  Please sign on and try checking out again.");
        return new ForwardResolution(AccountActionBean.class);
    } else if (cartBean != null) {
        order.initOrder(accountBean.getAccount(), cartBean.getCart());
        return new ForwardResolution(NEW_ORDER);
    } else {
        setMessage("An order could not be created because a cart could not be found.");
        return new ForwardResolution(ERROR);
    }
}


public Order getOrder(){
    return order;
}


public boolean isConfirmed(){
    return confirmed;
}


public Resolution newOrder(){
    HttpSession session = context.getRequest().getSession();
    if (shippingAddressRequired) {
        shippingAddressRequired = false;
        return new ForwardResolution(SHIPPING);
    } else if (!isConfirmed()) {
        return new ForwardResolution(CONFIRM_ORDER);
    } else if (getOrder() != null) {
        orderService.insertOrder(order);
        CartActionBean cartBean = (CartActionBean) session.getAttribute("/actions/Cart.action");
        cartBean.clear();
        setMessage("Thank you, your order has been submitted.");
        return new ForwardResolution(VIEW_ORDER);
    } else {
        setMessage("An error occurred processing your order (order was null).");
        return new ForwardResolution(ERROR);
    }
}


}