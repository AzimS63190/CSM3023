<%-- 
    Document   : processUser
    Created on : 26 May 2023, 12:12:09 PM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Retrieve from HTML</title>
    </head>
    <body>
        <style>
            div {
                font-family: Arial, Helvetica, sans-serif;
                color: #cc00cc;
                font-size: 25px;
            }
        </style>

        <h1>Retrieve info using c:param & display it using c:out</h1>
        <br/>
        <div>
            <p>First name: <c:out value="${param.fname}" /></p>
            <p>Surname: <c:out value="${param.sname}" /></p>
            <p>Gender : <c:out value="${param.gender}" /></p>
            <p>Type of User : <c:out value="${param.userType}" /></p>
            <p>Prefer Language : <c:out value="${param.lang}" /></p>
        </div>
    </body>
</html>

