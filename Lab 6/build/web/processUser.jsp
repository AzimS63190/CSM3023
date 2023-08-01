<%-- 
    Document   : processUser
    Created on : 2 Jun 2023, 12:50:39 AM
    Author     : Azim S63190
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="lab6.com.User" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="objUser" class="lab6.com.User" scope="request"/>

        <jsp:setProperty name="objUser" property="*"/>

        <%
            int result = 0;

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");

            Class.forName("com.mysql.cj.jdbc.Driver");

            String myURL = "jdbc:mysql://localhost:3306/csf3107";
            Connection myConnection = DriverManager.getConnection(myURL, "root", "admin");

            Statement st = myConnection.createStatement();

            result = st.executeUpdate("INSERT INTO userprofile(username, password, firstname, lastname) "
                    + "VALUES('" + username + "','" + password + "','" + firstname + "','" + lastname + "')");

            if (result > 0) {
                out.println("User successfully registered...!");
        %><a href="login.jsp">Login</a><%
                    }

                    //Step 5 : Close database connection..!
                    System.out.println("Step 5: Close database connection..!");
                    myConnection.close();
                    System.out.println(" ");
                    System.out.println("Database connection is closed...!");
        %>
    </body>
</html>
