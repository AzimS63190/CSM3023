<%-- 
    Document   : main
    Created on : 1 Jun 2023, 9:06:36 PM
    Author     : Azim S63190
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User</title>
    </head>
    <body>
        <h1>Details of Users</h1>
        <%

            String username = (String) session.getAttribute("username");
            //Step 1: Load JDBC driver...
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Step 1: MySQL driver loaded..!");

            //Step 2: Establish the connection...
            String myURL = "jdbc:mysql://localhost:3306/csf3107";
            Connection myConnection = DriverManager.getConnection(myURL, "root", "admin");
            System.out.println("Step 2: Database is connected...!");

            //Step 3: Create statement object....
            Statement myStatement = myConnection.createStatement();

            //Step 4: Perform retrieve record from Student's table....(Retrieve)
            String myQuery = "SELECT username, firstname, lastname FROM userprofile where username='" + username + "'";
            ResultSet myResultSet = myStatement.executeQuery(myQuery);

            while (myResultSet.next()) {

                out.print("Username  : " + myResultSet.getString(1) + "<br>");
                out.print("First Name: " + myResultSet.getString(2) + "<br>");
                out.print("Last Name : " + myResultSet.getString(3) + "<br>");
            }

            //Step 5: Close database connection...!
            System.out.println("Step 5: Close database connection..!");
            myConnection.close();
            System.out.println(" ");
            System.out.println("Database connection is closed..!");

            out.print("</tbody>");
            out.print("</table>");
        %>
    </body>
</html>
