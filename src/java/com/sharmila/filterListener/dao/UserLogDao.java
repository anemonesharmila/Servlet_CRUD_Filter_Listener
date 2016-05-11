/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharmila.filterListener.dao;

import com.sharmila.filterListener.entity.UserLog;
import java.util.List;

/**
 *
 * @author sharmila
 */
public interface UserLogDao {
    void insert(UserLog userlog);

    void delete(int id);

    void update(UserLog userlog);

    List<UserLog> getAll();

    UserLog getById(int id);

    UserLog getByName(String address);
}
