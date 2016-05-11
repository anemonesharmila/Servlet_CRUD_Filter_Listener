<%-- 
    Document   : login
    Created on : May 10, 2016, 2:31:00 PM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>
<%@include file="../views/header.jsp" %>
    <title>User Login Page</title>

    <!-- Bootstrap core CSS -->
    <!--<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet" />-->
    <link href="{SITE_URL}/bootstrap/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Custom styles for this template -->
    <!--<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/extraCss/login.css" />-->
    <link href="<c:out value="{SITE_URL}/bootstrap/extraCss/login.css"/>" rel="stylesheet" />

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="container">

     <center><h1>Login page</h1></center>
     <form method="POST" action="${pageContext.request.contextPath}/LoginController" name="form-login">
            <div class="form-group form-group-sm" >
                <label>Email</label>
                <input type="text" name="email" required="required" class="form-control"/>
            </div>
            <div class="form-group">
                <label>Password</label>
                <input type="password" name="password" required="required" class="form-control" />
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-success">submit</button>
                <a href="" class="btn btn-danger" >Cancel</a>
            </div>
        </form>

    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
