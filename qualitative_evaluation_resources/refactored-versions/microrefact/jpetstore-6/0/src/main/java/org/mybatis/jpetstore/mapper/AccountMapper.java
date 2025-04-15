package org.mybatis.jpetstore.mapper;
 import org.mybatis.jpetstore.domain.Account;
public interface AccountMapper {


public void updateSignon(Account account)
;

public void insertProfile(Account account)
;

public void insertAccount(Account account)
;

public void updateProfile(Account account)
;

public Account getAccountByUsername(String username)
;

public void insertSignon(Account account)
;

public Account getAccountByUsernameAndPassword(String username,String password)
;

public void updateAccount(Account account)
;

}