package com.coveros.training.persistence;
 import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.logging.Logger;
public class EmptyDataSource implements DataSource{


@Override
public Connection getConnection(String username,String password){
    throw new NotImplementedException();
}


@Override
public void setLogWriter(PrintWriter out){
    throw new NotImplementedException();
}


@Override
public void setLoginTimeout(int seconds){
    throw new NotImplementedException();
}


@Override
public boolean isWrapperFor(Class<?> iface){
    throw new NotImplementedException();
}


@Override
public Logger getParentLogger(){
    throw new NotImplementedException();
}


@Override
public int getLoginTimeout(){
    throw new NotImplementedException();
}


@Override
public T unwrap(Class<T> iface){
    throw new NotImplementedException();
}


@Override
public PrintWriter getLogWriter(){
    throw new NotImplementedException();
}


}