package com.online.bank.digital.repository;

import com.online.bank.digital.model.*;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccount {

    AccountHolder getAccountHolderByAccountHolderUid(final int accountHolderUid) throws Exception;
    AccountHolder getAccountHolderByNameAndEmail(final String firstName, final String emailAddress) throws Exception;
    AccountHolder saveOrUpdateAccountHolder(AccountHolder accountHolder) throws Exception;

    Account getAccountByAccountUid(final int accountUid) throws Exception;
    Account getAccountByAccountHolder(final AccountHolder accountHolder) throws Exception;
    Account getAccountByAHUandCategory(final int accountHolderUid, final String category) throws Exception;
    Account saveOrUpdateAccount(Account account) throws Exception;

    Balance getBalanceByBalanceUid(final int balanceUid) throws Exception;
    Balance getBalanceByAccount(final Account account) throws Exception;
    Balance saveOrUpdateBalance(Balance balance) throws Exception;

    AccountLimit getAccountLimitByAccountLimitId(final int accountLimitId) throws Exception;
    AccountLimit getAccountLimitByAccount(final Account account) throws Exception;
    AccountLimit saveOrUpdateAccountLimit(AccountLimit accountLimit) throws Exception;

    AccountType getAccountTypeByAccountTypeId(final int accountTypeId) throws Exception;
    AccountType getAccountTypeByAccount(final Account account) throws Exception;
    AccountType saveOrUpdateAccountType(AccountType accountType) throws Exception;
}
