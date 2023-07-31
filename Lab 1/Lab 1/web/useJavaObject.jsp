<%-- 
    Document   : useJavaObject
    Created on : 9 Apr 2023, 10:15:33 PM
    Author     : Wan Abdul Azim
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Use Java Object</title>
    </head>
    <body>
        <h1>Display Current Date and perform Auto Refresh Header</h1>
        
        <%
            Date todayDate = new Date();
            out.print("<p>Current date and time is " + todayDate.toString() + "</p>");
        %>
    </body>
    <% //Set refresh, autoload time as 5 seconds
        response.setIntHeader("Refresh", 5);
        %>
</html>
