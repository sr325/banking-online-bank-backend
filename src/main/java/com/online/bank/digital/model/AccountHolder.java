package com.online.bank.digital.model;

import lombok.Data;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ACCOUNT_HOLDER")
@Data
public class AccountHolder {
    @Id @GeneratedValue
    @Column(name = "accountHolderUid")
    private int accountHolderUid;

    @OneToMany
    @JoinColumn(name = "accountUid")
    @OrderBy("createdAt DESC")
    @BatchSize(size = 1000)
    private List<Account> accounts;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "emailAddress")
    private String emailAddress;

    //e.g. personal or business
    @Column(name = "category")
    private String category;

    public AccountHolder() {
    }

    public AccountHolder(int accountHolderUid, List<Account> accounts, String firstName, String lastName, String emailAddress, String category) {
        this.accountHolderUid = accountHolderUid;
        this.accounts = accounts;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
