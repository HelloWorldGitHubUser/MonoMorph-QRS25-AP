package com.coveros.training.tomcat;
 import com.coveros.training.persistence.IPersistenceLayer;
import com.coveros.training.persistence.PersistenceLayer;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class WebAppListener implements ServletContextListener{

 private  IPersistenceLayer pl;

public WebAppListener() {
    pl = new PersistenceLayer();
}public WebAppListener(IPersistenceLayer pl) {
    this.pl = pl;
}
@Override
public void contextInitialized(ServletContextEvent sce){
    // clean the database and configure the schema
    pl.cleanAndMigrateDatabase();
}


@Override
public void contextDestroyed(ServletContextEvent sce){
    // do nothing.
}


}