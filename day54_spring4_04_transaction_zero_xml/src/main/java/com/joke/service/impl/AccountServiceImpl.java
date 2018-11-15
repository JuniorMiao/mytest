package com.joke.service.impl;

import com.joke.dao.IAccountDao;
import com.joke.entity.Account;
import com.joke.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional(
        readOnly = false,
        propagation = Propagation.REQUIRED,
        timeout = -1,
        isolation = Isolation.DEFAULT
)
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public void save(Account account) {
        accountDao.save(account);
        //int a = 1/0;
        accountDao.save(account);
    }
}
