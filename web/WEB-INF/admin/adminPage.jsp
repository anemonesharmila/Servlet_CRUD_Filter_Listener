<%-- 
    Document   : adminPage
    Created on : May 10, 2016, 2:31:21 PM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="../views/header.jsp" %>
<div class="container">
<div class="pull-right">
    <p>
        <a href="${url}/forms/add" class=" btn btn-primary">
            <span class="glyphicon glyphicon-plus"/>
        </a>
    </p>
</div>
<div class="pull-left">
    <p>
        <a href="${url}/user/userlogPage" class=" btn btn-primary">
            <span class="glyphicon glyphicon-plus"/>
        </a>
    </p>
</div>
<body>
    <h1>User Information</h1>
    <table class="table table-bordered table-striped">
        <tr>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Password</th>
            <th>Address</th>
            <th>Phone Number</th>
            <th>Added Date</th>
            <th>Modified Date</th>
            <th>Status</th>
        </tr>
        <c:forEach var="u" items="${requestScope.users}">
            <tr>
                <td>${u.id}</td>
                <td>${u.firstName}</td>
                <td>${u.lastName}</td>
                <td>${u.email}</td>
                <td>${u.password}</td>
                <td>${u.address}</td>
                <td>${u.phoneNumber}</td>
                <td>${u.addedDate}</td>
                <td>${u.modifiedDate}</td>
                <td>${u.status}</td>
            </tr>
        </c:forEach>
    </table>


</body>
</div>
<%@include file="../views/footer.jsp" %>
