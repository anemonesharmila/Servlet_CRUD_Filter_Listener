package com.sharmila.filterListener.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-11T11:51:52")
@StaticMetamodel(UserLog.class)
public class UserLog_ { 

    public static volatile SingularAttribute<UserLog, String> requestUrl;
    public static volatile SingularAttribute<UserLog, Date> loginDate;
    public static volatile SingularAttribute<UserLog, Integer> id;
    public static volatile SingularAttribute<UserLog, String> remoteAddress;

}