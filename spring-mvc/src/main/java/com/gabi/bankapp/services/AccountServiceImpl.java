package com.gabi.bankapp.services;

import com.gabi.bankapp.dao.AccountDAO;
import com.gabi.bankapp.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDAO accountDAO;

    @Override
    @Transactional
    public boolean saveAccount(Account account) {
        return accountDAO.saveAccount(account);
    }

    @Override
    @Transactional
    public List<Account> getAccounts() {
        return accountDAO.getAccounts();
    }
}
