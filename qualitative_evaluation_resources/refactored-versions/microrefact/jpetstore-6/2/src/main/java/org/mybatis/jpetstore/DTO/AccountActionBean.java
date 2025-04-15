package org.mybatis.jpetstore.DTO;
 import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpSession;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;
import net.sourceforge.stripes.validation.Validate;
import org.mybatis.jpetstore.domain.Account;
import org.mybatis.jpetstore.domain.Product;
import org.mybatis.jpetstore.service.AccountService;
import org.mybatis.jpetstore.service.CatalogService;
import org.mybatis.jpetstore.Interface.CatalogService;
public class AccountActionBean extends AbstractActionBean{

 private  long serialVersionUID;

 private  String NEW_ACCOUNT;

 private  String EDIT_ACCOUNT;

 private  String SIGNON;

 private  List<String> LANGUAGE_LIST;

 private  List<String> CATEGORY_LIST;

 private  AccountService accountService;

 private  CatalogService catalogService;

 private  Account account;

 private  List<Product> myList;

 private  boolean authenticated;

 private RestTemplate restTemplate = new RestTemplate();

  String url = "http://0";


public List<Product> getMyList(){
    return myList;
}


public List<String> getLanguages(){
    return LANGUAGE_LIST;
}


public String getUsername(){
    return account.getUsername();
}


public String getPassword(){
    return account.getPassword();
}


public List<String> getCategories(){
    return CATEGORY_LIST;
}


public Account getAccount(){
    return this.account;
}


public boolean isAuthenticated(){
    return authenticated && account != null && account.getUsername() != null;
 

  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/isAuthenticated"))

;
boolean aux = restTemplate.getForObject(builder.toUriString(),boolean.class);
return aux;
}


}