<%-- 
    Document   : index
    Created on : 3 Jun 2023, 12:04:04 AM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sample Perform CRUD Using Java Servlet</title>
    </head>
    <body>
        <h1>Sample Perform CRUD Using Java Servlet!</h1>
        <jsp:forward page= "/UserController?action=listUser" />
    </body>
</html>
