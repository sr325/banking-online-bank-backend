package com.online.bank.digital.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ACCOUNT_HOLDER")
@Data
public class AccountHolder {
    @Id
    @GeneratedValue(generator = "ACCOUNT_HOLDER_PK_SEQ", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ACCOUNT_HOLDER_PK_SEQ", allocationSize = 1)
    @Column(name = "accountHolderUid")
    private int accountHolderUid;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "emailAddress", nullable = false)
    private String emailAddress;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "fkAccountHolder")
    private List<Account> accounts = new ArrayList<>();

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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
