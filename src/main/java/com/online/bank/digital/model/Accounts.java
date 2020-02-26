/*
package com.online.bank.digital.model;

import javax.persistence.*;
import java.util.List;
*/
/*
The list of accounts of an account holder
 *//*

@Entity
@Table(name = "ACCOUNTS")
public class Accounts {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int accountUid;

    @Column(name = "accounts")
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="accountUid")
    private List<Account> accounts;

    public int getAccountUid() {
        return accountUid;
    }

    public void setAccountUid(int accountUid) {
        this.accountUid = accountUid;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
*/
