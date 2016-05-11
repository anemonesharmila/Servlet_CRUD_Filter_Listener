/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharmila.filterListener.dao.impl;

import com.sharmila.filterListener.dao.UserLogDao;
import com.sharmila.filterListener.entity.UserLog;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author sharmila
 */
public class UserLogDaoImpl implements UserLogDao{
private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction transaction;

    public UserLogDaoImpl() {
        emf = Persistence.createEntityManagerFactory("FilterListnerProjectPU");
        em = emf.createEntityManager();
    }
    @Override
    public void insert(UserLog userlog) {
         transaction = em.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
        em.persist(userlog);
        em.flush();
        transaction.commit();
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(UserLog userlog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserLog> getAll() {
       return em.createQuery("select u from UserLog u").getResultList();
    }

    @Override
    public UserLog getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserLog getByName(String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
