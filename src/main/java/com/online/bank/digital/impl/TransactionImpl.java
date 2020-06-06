package com.online.bank.digital.impl;

import com.online.bank.digital.model.Account;
import com.online.bank.digital.model.Transaction;
import com.online.bank.digital.repository.ITransaction;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class TransactionImpl implements ITransaction {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public Transaction saveOrUpdateTransaction(int accountId, Transaction transaction) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        try {
            entityManager.getTransaction().begin();
            Account account = entityManager.find(Account.class, accountId);
            account.getCard().getTransactions().add(transaction);
            session.saveOrUpdate(account);
            entityManager.flush();
            session.saveOrUpdate(transaction);
            entityManager.flush();
            entityManager.getTransaction().commit();
            return transaction;
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            session.close();
            entityManager.close();
        }
    }

    @Override
    public List<Transaction> getAllTransactionsForAccountHolder(int accountId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        try {
            entityManager.getTransaction().begin();
            Account account = entityManager.find(Account.class, accountId);
            return account.getCard().getTransactions();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            session.close();
            entityManager.close();
        }
    }

    @Override
    public Transaction getTransaction(int transactionId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        try {
            entityManager.getTransaction().begin();
            return entityManager.find(Transaction.class, transactionId);
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            session.close();
            entityManager.close();
        }
    }
}
