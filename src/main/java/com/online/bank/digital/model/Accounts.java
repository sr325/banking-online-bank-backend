package com.online.bank.digital.model;

import java.util.List;
/*
The list of accounts of an account holder
 */
public class Accounts {
    private String accountUid;
    private List<Account> accounts;

    public String getAccountUid() {
        return accountUid;
    }

    public void setAccountUid(String accountUid) {
        this.accountUid = accountUid;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
