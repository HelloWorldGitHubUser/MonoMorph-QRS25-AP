package org.mybatis.jpetstore.service;
 import java.util.Optional;
import org.mybatis.jpetstore.domain.Account;
import org.mybatis.jpetstore.mapper.AccountMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class AccountService {

 private  AccountMapper accountMapper;

public AccountService(AccountMapper accountMapper) {
    this.accountMapper = accountMapper;
}
@Transactional
public void insertAccount(Account account){
    accountMapper.insertAccount(account);
    accountMapper.insertProfile(account);
    accountMapper.insertSignon(account);
}


public Account getAccount(String username,String password){
    return accountMapper.getAccountByUsernameAndPassword(username, password);
}
public Account getAccount(String username){
    return accountMapper.getAccountByUsername(username);
}



@Transactional
public void updateAccount(Account account){
    accountMapper.updateAccount(account);
    accountMapper.updateProfile(account);
    Optional.ofNullable(account.getPassword()).filter(password -> password.length() > 0).ifPresent(password -> accountMapper.updateSignon(account));
}


}
