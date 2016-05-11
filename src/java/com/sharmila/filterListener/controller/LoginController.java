/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharmila.filterListener.controller;

import com.sharmila.filterListener.dao.UserDao;
import com.sharmila.filterListener.dao.UserLogDao;
import com.sharmila.filterListener.dao.impl.UserDaoImpl;
import com.sharmila.filterListener.dao.impl.UserLogDaoImpl;
import com.sharmila.filterListener.entity.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sharmila
 */
@WebServlet(name = "loginController", urlPatterns = {"/", "/adminPage/*","/userlog","/add"})
public class LoginController extends HttpServlet {

    private UserDao userDao = new UserDaoImpl();
    private UserLogDao userlogDao = new UserLogDaoImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//
//        userDao.login(email, password);
//        RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/user/userPage.jsp");
//
//        // request.setAttribute("users", userDao.getAll());
//        dis.forward(request, response);
        
        
        User user=new User();
        user.setFirstName(request.getParameter("firstName"));
        user.setLastName(request.getParameter("lastName"));
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));
        user.setPhoneNumber(Integer.parseInt(request.getParameter("phoneNumber")));
        user.setAddress(request.getParameter("address"));
        user.setStatus((request.getParameter("status")!=null?true:false));
        userDao.insert(user);
        response.sendRedirect(request.getContextPath()+"/adminPage");
                
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPage = "/WEB-INF/views/index.jsp";
       
        if (request.getRequestURI().contains("adminPage")) {
            viewPage = "/WEB-INF/admin/adminPage.jsp";
            request.setAttribute("users", userDao.getAll());
           

        }
     else if(request.getRequestURI().contains("userlog")){
           viewPage = "/WEB-INF/user/userlogPage.jsp";
           request.setAttribute("userlog", userlogDao.getAll());
            
        }
     else if(request.getRequestURI().contains("add")){
          viewPage = "/WEB-INF/forms/addUser.jsp";
           
     }
        RequestDispatcher dis = request.getRequestDispatcher(viewPage);
        dis.forward(request, response);
    }

}
