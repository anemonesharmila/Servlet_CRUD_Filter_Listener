/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharmila.filterListener.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sharmila
 */
@Entity
@Table(name = "tbl_userlogs")

public class UserLog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "request_url")
    private String requestUrl;
   
    @Column(name = "remote_address")
    private String remoteAddress;
    
    @Column(name = "login_date", insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginDate;
//    @JoinColumn(name = "user_id", referencedColumnName = "user", nullable = true)
//    @ManyToOne(optional = true)
//    private User user;
   

    public UserLog() {
    }

    

    public UserLog(Integer id, String requestUrl, String remoteAddress, Date loginDate) {
        this.id = id;
        this.requestUrl = requestUrl;
        this.remoteAddress = remoteAddress;
        this.loginDate = loginDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

//    public User getUserId() {
//        return user;
//    }
//
//    public void setUserId(User user) {
//        this.user = user;
//    }

   
    
}
