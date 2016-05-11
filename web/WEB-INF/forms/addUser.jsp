<%-- 
    Document   : addUser
    Created on : May 11, 2016, 12:22:40 AM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../views/header.jsp" %>
<body>
    <h1>Add User!</h1
    <form  action="${url}/adminPage/save" method="POST">
        <div class="form-group">  
            <input type="text" name="firstName" placeholder="First Name" required="required"/>
            </br></div>
        <div class="form-group"> 
            <input type="text" name="lastName" placeholder="Last Name" required="required"/>
            </br></div>
        <div class="form-group">
            <input type="email" name="email" placeholder="Email address" required="required"/>
            </br></div>
        <div class="form-group">
            <input type="password" name="password" placeholder="Password" required="required"/>
            </br></div>
        <div class="form-group">
            <input type="number" name="phoneNumber" placeholder="Phone Number" required="required"/>
            </br></div>
        <div class="form-group">
            <input type="text" name="address" placeholder="address" required="required"/>
            </br></div>
        <div class="form-checkbox">
            <input type="checkbox" name="status" placeholder="staus" required="required"/></br>
        </div> 
        <div>
            <button type="submit" class="btn btn-success">save</button>
            &nbsp;
            <a href="${url}" class="btn-lg btn-warning">back</a>
            &nbsp;
            <button type="reset" class="btn btn-danger">cancel</button>
        </div>
    </form>
</body>
<%@include file="../views/footer.jsp" %>
