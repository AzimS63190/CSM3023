<%-- 
    Document   : processAuthor
    Created on : 30 May 2023, 11:48:10 AM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%@page import="java.sql.*" %>
<jsp:useBean id="myAuthor" class="lab6.com.Author" scope="request"/>
<jsp:setProperty name="myAuthor" property="*"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <h1>Lab 6 - Task 1 - Perform creating and retrieving records via JSP page</h1>
    <%
        int result;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String myURL = "jdbc:mysql://localhost/csf3107";
            Connection myConnection = DriverManager.getConnection(myURL, "root", "admin");

            String sInsertQry = "INSERT INTO Author(authno, name, address, city, state, zip) VALUES(?, ?, ?, ?, ?, ?)";

            PreparedStatement myPS = myConnection.prepareStatement(sInsertQry);

            myPS.setString(1, myAuthor.getAuthno());
            myPS.setString(2, myAuthor.getName());
            myPS.setString(3, myAuthor.getAddress());
            myPS.setString(4, myAuthor.getCity());
            myPS.setString(5, myAuthor.getState());
            myPS.setString(6, myAuthor.getZip());

            result = myPS.executeUpdate();
            if (result > 0) {
                out.println("\tRecord successfully added into Auhthor table...!");
                out.print("<p>" + "Record with author no " + myAuthor.getAuthno() + " succesfully created..!" + "</p>");
                out.print("<p>" + "Details of record are;" + "</p>");
                out.print("<p>Name : " + myAuthor.getName() + "</p>");
                out.print("Address : " + myAuthor.getAddress() + "</p>");
                out.print("<p>City : " + myAuthor.getCity() + "</p>");
                out.print("<p>State : " + myAuthor.getState() + "</p>");
                out.print("<p>Zip: " + myAuthor.getZip() + "</p>");
            }

            myConnection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    %>
</body>
</html>