/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharmila.filterListener.listener;

import com.sharmila.filterListener.dao.UserLogDao;
import com.sharmila.filterListener.dao.impl.UserLogDaoImpl;
import com.sharmila.filterListener.entity.UserLog;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sharmila
 */
@WebListener(value = "myListener")
public class UserRequestListener implements ServletRequestListener{
    private UserLogDao ul=new UserLogDaoImpl();
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest req=(HttpServletRequest)sre.getServletRequest();
        System.out.println(req.getRemoteAddr()+ "is request to access "+req.getRequestURI());
        UserLog userlog=new UserLog();
        userlog.setRemoteAddress(req.getRemoteAddr());
        userlog.setRequestUrl(req.getRequestURI());
        
        ul.insert(userlog);
       
    }
    
}
