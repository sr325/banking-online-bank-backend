package com.online.bank.digital.impl;

import com.online.bank.digital.model.AccountHolder;
import com.online.bank.digital.repository.IAccount;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class DatabaseAccountHolderImpl implements IAccount {

    private static Logger LOG = LoggerFactory.getLogger(DatabaseAccountHolderImpl.class);

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public AccountHolder saveOrUpdateAccountHolder(final AccountHolder accountHolder) throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        try {
            entityManager.getTransaction().begin();
            session.saveOrUpdate(accountHolder);
            entityManager.flush();
            entityManager.getTransaction().commit();
            return accountHolder;
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            session.close();
            entityManager.close();
        }
    }

    @Override
    public AccountHolder getAccountHolderByAccountHolderUid(final int accountHolderUid) throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            AccountHolder accountHolder = entityManager.find(AccountHolder.class, accountHolderUid);
            Hibernate.initialize(accountHolder.getAccounts()); //Hibernate.initialize because of list
            return accountHolder;
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public AccountHolder updateAccountHolder(final AccountHolder newAccountHolder) throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        try {
            AccountHolder databaseAccountHolder = entityManager.find(AccountHolder.class, newAccountHolder.getAccountHolderUid());

            if (databaseAccountHolder != null){
                databaseAccountHolder.setAccounts(newAccountHolder.getAccounts());
                databaseAccountHolder.setEmailAddress(newAccountHolder.getEmailAddress());
                databaseAccountHolder.setFirstName(newAccountHolder.getFirstName());
                databaseAccountHolder.setLastName(newAccountHolder.getLastName());
                databaseAccountHolder.setAccounts(newAccountHolder.getAccounts());
                entityManager.getTransaction().begin();
                session.merge(databaseAccountHolder);
                entityManager.flush();
                entityManager.getTransaction().commit();
            }

            return databaseAccountHolder;
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            session.close();
            entityManager.close();
        }
    }
}
