<%-- 
    Document   : userlogPage
    Created on : May 11, 2016, 10:09:27 AM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../views/header.jsp" %>
<body>
    <h1>User Log</h1>

    <table class="table  table-bordered">
        <tr>
            <th>id</th>
            <th>remote address</th>
            <th>remote url</th>
            <th>login date</th>
<!--            <th>user</th>-->
        </tr>
        
        <c:forEach var="ul" items="${requestScope.userlog}">
            <tr>
                <td>${ul.id}</td>
                <td>${ul.remoteAddress}</td>
                <td>${ul.requestUrl}</td>
                <td>${ul.loginDate}</td>
<!--                <td>${ul.user}</td>-->
            </tr>
        </c:forEach>
    </table>
</body>
</html>
