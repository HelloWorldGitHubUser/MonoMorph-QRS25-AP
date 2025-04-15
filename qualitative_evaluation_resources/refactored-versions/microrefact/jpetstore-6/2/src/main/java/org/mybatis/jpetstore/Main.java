package org.mybatis.jpetstore;
 import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.mybatis.jpetstore.Interface.Item;
import org.mybatis.jpetstore.Interface.ItemImpl;
import org.mybatis.jpetstore.Interface.ItemMapper;
import org.mybatis.jpetstore.Interface.ItemMapperImpl;
@SpringBootApplication
public class Main {


@Bean
public RestTemplate restTemplate(){
 
 return new RestTemplate();

  }



public static void main(String[] args){

SpringApplication.run(Main.class,args);

   }



@Bean
public Item item(){

return  new ItemImpl(); 
    }



@Bean
public ItemMapper itemmapper(){

return  new ItemMapperImpl(); 
    }



}