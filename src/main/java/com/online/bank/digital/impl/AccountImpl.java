package com.online.bank.digital.impl;

import org.hibernate.Session;
import com.online.bank.digital.model.Account;
import com.online.bank.digital.repository.IAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class AccountImpl implements IAccount {

    private static final Logger LOG = LoggerFactory.getLogger(AccountImpl.class);

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public Account getAccount(int accountId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        try{
            entityManager.getTransaction().begin();
            return entityManager.find(Account.class, accountId);
        } catch (Exception ex){
            entityManager.getTransaction().rollback();
            throw ex;
        } finally {
            session.close();
            entityManager.close();
        }
    }
}
