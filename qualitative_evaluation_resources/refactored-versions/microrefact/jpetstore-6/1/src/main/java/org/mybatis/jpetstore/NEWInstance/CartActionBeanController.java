package org.mybatis.jpetstore.NEWInstance;
 import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin
public class CartActionBeanController {

 private CartActionBean cartactionbean;

 private CartActionBean cartactionbean;


@PutMapping
("/clear")
public void clear(){
cartactionbean.clear();
}


}