package org.mybatis.jpetstore.NEWInstance;
 import org.springframework.web.bind.annotation.*;
import org.mybatis.jpetstore.web.actions.CartActionBean;
@RestController
@CrossOrigin
public class CartActionBeanController {

 private CartActionBean cartactionbean;




@PutMapping
("/clear")
public void clear(){
cartactionbean.clear();
}


}
