package com.online.bank.digital.repository;

import com.online.bank.digital.model.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITransaction {
    Transaction saveOrUpdateTransaction(int accountId, Transaction transaction);

    List<Transaction> getAllTransactionsForAccountHolder(int accountId);

    Transaction getTransaction(int transactionId);
}
