<%-- 
    Document   : errorStudent
    Created on : 30 May 2023, 1:40:27 PM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form id="errorFrm" action="insertStudent.jsp" method="post">
            <h1>Lab 6 - Task 3- Perform creating and retrieving records via JSP page</h1>
            !when inserting record...!</p>

        <p><jsp:expression> exception.getMessage()</jsp:expression></p>\
        <br>
    </form>
</body>
</html>