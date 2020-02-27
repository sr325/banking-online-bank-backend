package com.online.bank.digital.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ACCOUNTS")
public class Accounts {
    @Id
    @Column(name = "accountsUid")
    private int accountsUid;

    //fk of accountHolder
    @Column(name = "accountHolderUid")
    private int accountHolderUid;

    @Column(name = "accounts")
    private List<Account> accounts;

    public int getAccountsUid() {
        return accountsUid;
    }

    public void setAccountsUid(int accountsUid) {
        this.accountsUid = accountsUid;
    }

    public int getAccountHolderUid() {
        return accountHolderUid;
    }

    public void setAccountHolderUid(int accountHolderUid) {
        this.accountHolderUid = accountHolderUid;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
