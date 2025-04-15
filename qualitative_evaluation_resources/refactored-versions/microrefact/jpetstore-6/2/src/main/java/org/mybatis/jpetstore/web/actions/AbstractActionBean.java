package org.mybatis.jpetstore.web.actions;
 import java.io.Serializable;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.SimpleMessage;
public class AbstractActionBean implements Serializable,ActionBean{

 private  long serialVersionUID;

 protected  String ERROR;

 protected  ActionBeanContext context;


@Override
public void setContext(ActionBeanContext context){
    this.context = context;
}


public void setMessage(String value){
    context.getMessages().add(new SimpleMessage(value));
}


@Override
public ActionBeanContext getContext(){
    return context;
}


}