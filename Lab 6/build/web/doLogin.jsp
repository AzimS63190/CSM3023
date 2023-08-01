<%-- 
    Document   : doLogin
    Created on : 1 Jun 2023, 10:51:52 PM
    Author     : Azim S63190
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            session.setAttribute("username", username);

            Class.forName("com.mysql.cj.jdbc.Driver");

            String myURL = "jdbc:mysql://localhost:3306/csf3107";
            Connection myConnection = DriverManager.getConnection(myURL, "root", "admin");
            Statement st = myConnection.createStatement();
            ResultSet rs = st.executeQuery("SELECT username, password FROM userprofile WHERE username='" 
                    + username + "' and password='" + password + "'");

            try {
                if (rs.next()) {
                    String dbusername = rs.getString("username");
                    String dbpassword = rs.getString("password");

                    if (username.equals(dbusername) && password.equals(dbpassword)) {
                        response.sendRedirect("main.jsp");
                    }
                } else {
                    out.println("Invalid username or password..!");
        %><jsp:include page="login.jsp"/><%
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
        %>

    </body>
</html>

