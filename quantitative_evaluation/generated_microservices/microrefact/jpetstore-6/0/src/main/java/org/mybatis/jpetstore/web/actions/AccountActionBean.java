package org.mybatis.jpetstore.web.actions;
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
import org.mybatis.jpetstore.DTO.Product;
import org.mybatis.jpetstore.service.AccountService;
import org.mybatis.jpetstore.Interface.CatalogService;
@SessionScope
public class AccountActionBean extends AbstractActionBean{

 private  long serialVersionUID;

 private  String NEW_ACCOUNT;

 private  String EDIT_ACCOUNT;

 private  String SIGNON;

 private  List<String> LANGUAGE_LIST;

 private  List<String> CATEGORY_LIST;

@SpringBean
 private  AccountService accountService;

@SpringBean
 private  CatalogService catalogService;

 private  Account account;

 private  List<Product> myList;

 private  boolean authenticated;


@Validate(required = true, on = { "signon", "newAccount", "editAccount" })
public void setPassword(String password){
    account.setPassword(password);
}


@Validate(required = true, on = { "signon", "newAccount", "editAccount" })
public void setUsername(String username){
    account.setUsername(username);
}


public List<Product> getMyList(){
    return myList;
}


public Resolution newAccountForm(){
    return new ForwardResolution(NEW_ACCOUNT);
}


public List<String> getLanguages(){
    return LANGUAGE_LIST;
}


public void clear(){
    account = new Account();
    myList = null;
    authenticated = false;
}


public Resolution signon(){
    account = accountService.getAccount(getUsername(), getPassword());
    if (account == null) {
        String value = "Invalid username or password.  Signon failed.";
        setMessage(value);
        clear();
        return new ForwardResolution(SIGNON);
    } else {
        account.setPassword(null);
        myList = catalogService.getProductListByCategory(account.getFavouriteCategoryId());
        authenticated = true;
        HttpSession s = context.getRequest().getSession();
        // this bean is already registered as /actions/Account.action
        s.setAttribute("accountBean", this);
        return new RedirectResolution("http://1/getProductListByCategory").addParameter("categoryId", account.getFavouriteCategoryId());
    }
}


public Resolution signoff(){
    context.getRequest().getSession().invalidate();
    clear();
    return new RedirectResolution("http://1/getProductListByCategory").addParameter("categoryId", account.getFavouriteCategoryId());
}


public Resolution newAccount(){
    accountService.insertAccount(account);
    account = accountService.getAccount(account.getUsername(), account.getPassword());
    myList = catalogService.getProductListByCategory(account.getFavouriteCategoryId());
    authenticated = true;
    return new RedirectResolution("http://1/getProductListByCategory").addParameter("categoryId", account.getFavouriteCategoryId());
}


public boolean isAuthenticated(){
    return authenticated && account != null && account.getUsername() != null;
}


public String getUsername(){
    return account.getUsername();
}


@DefaultHandler
public Resolution signonForm(){
    return new ForwardResolution(SIGNON);
}


public String getPassword(){
    return account.getPassword();
}


public Resolution editAccountForm(){
    return new ForwardResolution(EDIT_ACCOUNT);
}


public Resolution editAccount(){
    accountService.updateAccount(account);
    account = accountService.getAccount(account.getUsername(),account.getPassword());
    myList = catalogService.getProductListByCategory(account.getFavouriteCategoryId());
    return new RedirectResolution("http://1/getProductListByCategory").addParameter("categoryId", account.getFavouriteCategoryId());
}


public void setMyList(List<Product> myList){
    this.myList = myList;
}


public List<String> getCategories(){
    return CATEGORY_LIST;
}


public Account getAccount(){
    return this.account;
}


}
