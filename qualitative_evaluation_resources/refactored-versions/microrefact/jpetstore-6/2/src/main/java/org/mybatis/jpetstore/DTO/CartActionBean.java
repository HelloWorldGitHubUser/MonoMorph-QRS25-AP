package org.mybatis.jpetstore.DTO;
 import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;
import org.mybatis.jpetstore.domain.Cart;
import org.mybatis.jpetstore.domain.CartItem;
import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.service.CatalogService;
import org.mybatis.jpetstore.Interface.Cart;
import org.mybatis.jpetstore.DTO.CartItem;
public class CartActionBean extends AbstractActionBean{

 private  long serialVersionUID;

 private  String VIEW_CART;

 private  String CHECK_OUT;

 private  CatalogService catalogService;

 private  Cart cart;

 private  String workingItemId;

 private RestTemplate restTemplate = new RestTemplate();

  String url = "http://1";


public Cart getCart(){
    return cart;
}


public void clear(){
    cart = new Cart();
    workingItemId = null;
 

  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/clear"))

;
restTemplate.put(builder.toUriString(),null);
}


}