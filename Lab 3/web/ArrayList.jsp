<%-- 
    Document   : ArrayList
    Created on : 26 Apr 2023, 12:27:22 PM
    Author     : azimm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Use Java ArrayList</title>
        <style>
            p {
                color: blue;
            }
        </style>
    </head>
    <body>
        <h1>Use JSP Page Directive</h1>
        <%
            //Create ArrayList Object ...
            ArrayList<String> studentList = new ArrayList<String>();
            studentList.add(0, "Mohamad Azam");
            studentList.add(1, "Peter Chong");
            studentList.add(2, "Rahimah Mansor");
            studentList.add(3, "Sri Devi");
            studentList.add(4, "Ng Hue Ween");
            studentList.add(5, "S. Nagarajan");

            //Display the number if records..
            out.println("<p>The number of records in ArrayList are " + studentList.size() + "</p>");

            //Populate a list of students...
            for (int i = 0; i < studentList.size(); i++) {
                out.println("<p>Record " + (i + 1) + " is " + studentList.get(i) + "</p>");

            }


        %>
    </body>
    <br/>
    <footer>&copy;2023-Azim</footer>