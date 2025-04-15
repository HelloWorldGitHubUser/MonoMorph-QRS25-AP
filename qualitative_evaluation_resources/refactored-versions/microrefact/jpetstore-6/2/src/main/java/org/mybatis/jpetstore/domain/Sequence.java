package org.mybatis.jpetstore.domain;
 import java.io.Serializable;
public class Sequence implements Serializable{

 private  long serialVersionUID;

 private  String name;

 private  int nextId;

public Sequence() {
}public Sequence(String name, int nextId) {
    this.name = name;
    this.nextId = nextId;
}
public void setName(String name){
    this.name = name;
}


public String getName(){
    return name;
}


public int getNextId(){
    return nextId;
}


public void setNextId(int nextId){
    this.nextId = nextId;
}


}