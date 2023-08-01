<%-- 
    Document   : jstlCore1
    Created on : 26 May 2023, 11:08:46 AM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Using JSTL tag library</title>

        <style>
            p {
                font-family: Consolas, monaco, monospace;
                color: #CC0066;
                font-size: 23px;
            }
        </style>
    </head>
    <body>
        <h1>Use JSTL’s features</h1>
        <c:set var="message" value="Welcome to CSF3107 - Web Programming   courses..!" />
        <p> <c:out value="${message}"/> </p>
    </body>
</html>
