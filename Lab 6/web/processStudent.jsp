<%-- 
    Document   : processStudent
    Created on : 30 May 2023, 1:10:04 PM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%@page import="java.sql.*" %>
<jsp:useBean id="myStudent" class="lab6.com.Student" scope="request"/>
<jsp:setProperty name="myStudent" property="*"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int result;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("step 1: MySQL driver loaded....!");
                String myURL = "jdbc:mysql://localhost/csf3107";
                Connection myConnection = DriverManager.getConnection(myURL, "root", "admin");

                System.out.println("Step2: Database is connected!");
                System.out.println("Step3: Prepared Statements created..!");
                String sInsertQry = "INSERT INTO student(stuno, stuname, stuprogram) VALUES(?, ?, ?)";
                System.out.println("\tSQL Query: " + sInsertQry);

                PreparedStatement myPS = myConnection.prepareStatement(sInsertQry);
                System.out.println("Step4: Perform insertion of record...!");
                myPS.setString(1, myStudent.getStuno());
                myPS.setString(2, myStudent.getName());
                myPS.setString(3, myStudent.getProgram());

                result = myPS.executeUpdate();
                if (result > 0) {
                    System.out.println("\tRecord successfully added into Student table...!");
                    out.print("<p>" + "Record with student no " + myStudent.getStuno() + " succesfully created..!" + "</p>");
                    out.print("<p>" + "Details of record are;" + "</p>");
                    out.print("<p>Student ID : " + myStudent.getStuno() + "</p>");
                    out.print("<p>Name : " + myStudent.getName() + "</p>");
                    out.print("<p>Program : " + myStudent.getProgram() + "</p>");
                }

                myConnection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        %>
    </body>
</html>