package com.online.bank.digital.impl;

import com.online.bank.digital.model.*;
import com.online.bank.digital.repository.IAccount;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class DatabaseAccountImpl implements IAccount {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public AccountHolder getAccountHolderByAccountHolderUid(int accountHolderUid) throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            AccountHolder accountHolder = entityManager.find(AccountHolder.class, accountHolderUid);
            //Hibernate.initialize(accountHolder.getAccounts());
            return accountHolder;
        } catch (Exception ex){
            entityManager.getTransaction().rollback();
            throw ex;
        }
        finally {
            entityManager.close();
        }
    }

    @Override
    public AccountHolder getAccountHolderByNameAndEmail(String firstName, String emailAddress) throws Exception {
/*        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        try {
            entityManager.getTransaction().begin();


        } catch (Exception ex){
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            session.forceClose();
            entityManager.close();
        }*/

return null;
    }

    @Override
    public AccountHolder saveOrUpdateAccountHolder(AccountHolder accountHolder) throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        try {
            entityManager.getTransaction().begin();
            session.saveOrUpdate(accountHolder);
            entityManager.flush();
            entityManager.getTransaction().commit();
        } catch (Exception ex){
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            session.close();
            entityManager.close();
        }

        return null;
    }

    @Override
    public Account getAccountByAccountUid(int accountUid) throws Exception {
        return null;
    }

    @Override
    public Account getAccountByAccountHolder(AccountHolder accountHolder) throws Exception {
        return null;
    }

    @Override
    public Account getAccountByAHUandCategory(int accountHolderUid, String category) throws Exception {
        return null;
    }

    @Override
    public Account saveOrUpdateAccount(Account account) throws Exception {
        return null;
    }

    @Override
    public Balance getBalanceByBalanceUid(int balanceUid) throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        try {
            entityManager.getTransaction().begin();
            Balance balance = entityManager.find(Balance.class, balanceUid);
            return balance;
        } catch (Exception ex){
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            session.close();
            entityManager.close();
        }
    }

    @Override
    public Balance getBalanceByAccount(Account account) throws Exception {
        return null;
    }

    @Override
    public Balance saveOrUpdateBalance(Balance balance) throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        try {
            entityManager.getTransaction().begin();
            session.saveOrUpdate(balance);
            entityManager.getTransaction().commit();
        } catch (Exception ex){
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            session.close();
            entityManager.close();
        }
        return null;
    }

    @Override
    public AccountLimit getAccountLimitByAccountLimitId(int accountLimitId) throws Exception {
        return null;
    }

    @Override
    public AccountLimit getAccountLimitByAccount(Account account) throws Exception {
        return null;
    }

    @Override
    public AccountLimit saveOrUpdateAccountLimit(AccountLimit accountLimit) throws Exception {
        return null;
    }

    @Override
    public AccountType getAccountTypeByAccountTypeId(int accountTypeId) throws Exception {
        return null;
    }

    @Override
    public AccountType getAccountTypeByAccount(Account account) throws Exception {
        return null;
    }

    @Override
    public AccountType saveOrUpdateAccountType(AccountType accountType) throws Exception {
        return null;
    }
}
