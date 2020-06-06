package com.online.bank.digital.repository;

import com.online.bank.digital.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccount {
    Account getAccount(int accountId);
}
