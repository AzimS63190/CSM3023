<%-- 
    Document   : AttributeIsSet
    Created on : 9 Apr 2023, 10:25:38 PM
    Author     : Wan Abdul Azim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Implicit JSP</title>
    </head>
    <body>
        <% session.setAttribute("user","Fouad Abdulameer"); %>
        <a href="GetAttribute.jsp">Click here to get user name</a>
        
        <p><a href="MathematicsOperations.jsp">Results of mathematics operations</a></p>
    </body>
</html>
