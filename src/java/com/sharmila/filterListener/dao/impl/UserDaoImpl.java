/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharmila.filterListener.dao.impl;

import com.sharmila.filterListener.dao.UserDao;
import com.sharmila.filterListener.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author sharmila
 */
public class UserDaoImpl implements UserDao{
     private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction transaction;

    public UserDaoImpl() {
        emf = Persistence.createEntityManagerFactory("FilterListnerProjectPU");
        em = emf.createEntityManager();
    }
    @Override
    public void insert(User user) {
         transaction = em.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
        em.persist(user);
        em.flush();
        transaction.commit();
    }

    @Override
    public void delete(int id) {
        transaction = em.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
        User user=getById(id);
        if(user!=null){
        em.remove(user);
        }
        em.flush();
        transaction.commit();
    }

    @Override
    public void update(User user) {
         transaction = em.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
        em.merge(user);
        em.flush();
        transaction.commit();
    }

    @Override
    public User login(String email,String password) {
        
     //  return em.createQuery("SELECT u FROM User u where u.email=:email AND u.password=:password").;
        
        return null;
    }

    @Override
    public List<User> getAll() {
        return em.createQuery("SELECT e FROM User e").getResultList();
    }

    @Override
    public User getById(int id) {
         return em.find(User.class, id);
    }

    @Override
    public User getByName(String firstName) {
       return em.find(User.class, firstName);
    }
    
}
