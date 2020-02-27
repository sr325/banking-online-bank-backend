package com.online.bank.digital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT_HOLDER")
public class AccountHolder {
    @Id
    @Column(name = "accountHolderUid")
    private int accountHolderUid;

    @Column(name = "accounts")
    private Accounts accounts;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "emailAddress")
    private String emailAddress;


    public int getAccountHolderUid() {
        return accountHolderUid;
    }

    public void setAccountHolderUid(int accountHolderUid) {
        this.accountHolderUid = accountHolderUid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
