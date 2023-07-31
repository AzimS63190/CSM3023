<%-- 
    Document   : convertTemperature
    Created on : 27 Apr 2023, 9:49:26 AM
    Author     : azimm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Temperature Converter</title>
        <style>
            body {
                background-color:darkgrey
            }
        </style>
    </head>
    <body>
        <%
            String temperature = "";
            double C = 0;
            double F = 0;
            String result = "0.0";
            if (request.getParameter("temperature") != null) {
                temperature = request.getParameter("temperature");
                C = Double.parseDouble(temperature);
                F = ((9.0 / 5.0) * C) + 32;
                result = String.format("%.1f", F);
            }
        %>
        <h1>Temperature Converter</h1>
        <hr>
        <br>
        <form method="get">
            <input type="text" name="temperature" value="<%=C%>">
            <br>
            <br>
            <input type="submit" value="Calculate"/> 
        </form>
        <br>
        Fahrenheit = <%= result + ""%>

    </body>

