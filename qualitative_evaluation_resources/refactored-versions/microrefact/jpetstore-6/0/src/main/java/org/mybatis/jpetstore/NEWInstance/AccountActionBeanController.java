package org.mybatis.jpetstore.NEWInstance;
 import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin
public class AccountActionBeanController {

 private AccountActionBean accountactionbean;

 private AccountActionBean accountactionbean;


@GetMapping
("/isAuthenticated")
public boolean isAuthenticated(){
  return accountactionbean.isAuthenticated();
}


}