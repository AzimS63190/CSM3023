<%-- 
    Document   : Message1
    Created on : 26 May 2023, 8:47:40 AM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%@page info="Using JSP Scriptlet to call JavaBeans"%>
<%@page import="java.util.Date, lab5.com.Message"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Using JSP Scriptlet</title>
    </head>
    <body>
        <h1>Using JSP Scriptlet to call JavaBeans</h1>

        <style>
            div {
                font-family: Comic Sans MS, Comic Sans, cursive;
                color: #6A4C88;
                font-size: 24px;
            }
        </style>

        <div>
            <%
                //Create an object...
                Message objMsg = new Message();

                //Assign value...
                objMsg.setMsg("Welcome to CSF3170 course...!");

                //Display value...
                out.println("<p>" + objMsg.getMsg() + "</p>");

                //Add date...
                out.println("<p>Current date is " + new java.util.Date() + "</p>");
            %>
        </div>
    </body>
</html>
