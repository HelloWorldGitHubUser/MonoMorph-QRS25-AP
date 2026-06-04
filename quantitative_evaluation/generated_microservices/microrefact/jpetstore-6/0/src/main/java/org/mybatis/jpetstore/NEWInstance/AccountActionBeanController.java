package org.mybatis.jpetstore.NEWInstance;
 import org.springframework.web.bind.annotation.*;
import org.mybatis.jpetstore.web.actions.AccountActionBean;
@RestController
@CrossOrigin
public class AccountActionBeanController {

 private AccountActionBean accountactionbean;




@GetMapping
("/isAuthenticated")
public boolean isAuthenticated(){
  return accountactionbean.isAuthenticated();
}


}
