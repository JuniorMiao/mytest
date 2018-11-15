package com.joke.dao.impl;

import com.joke.dao.IAccountDao;
import com.joke.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements IAccountDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(Account account) {
        jdbcTemplate.update("insert into account values (null,?,?)", account.getUid(),account.getMoney());
    }
}
