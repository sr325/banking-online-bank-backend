package com.online.bank.digital.repository;

import com.online.bank.digital.model.AccountHolder;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountHolder {

    AccountHolder saveOrUpdateAccountHolder(AccountHolder accountHolder) throws Exception;

    AccountHolder getAccountHolderByAccountHolderUid(final int accountHolderUid) throws Exception;

    AccountHolder updateAccountHolder(AccountHolder accountHolder) throws Exception;

    void deleteAccountHolder(int accountId) throws Exception;
}
