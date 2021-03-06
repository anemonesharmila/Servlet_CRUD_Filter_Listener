/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharmila.filterListener.dao;

import com.sharmila.filterListener.entity.User;
import java.util.List;

/**
 *
 * @author sharmila
 */
public interface UserDao {

    void insert(User user);

    void delete(int id);

    void update(User user);

    User login(String email, String password);

    List<User> getAll();

    User getById(int id);

    User getByName(String firstName);
}
