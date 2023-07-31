<%-- 
    Document   : bmiCalculator
    Created on : 17 May 2023, 12:20:06 AM
    Author     : azimm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BMI Calculator</title>
    </head>
    <body>

        <h1>Welcome to BMI Calculator</h1>
        <form method="get" name="bmiForm" action="processBMI.jsp">
            <label for="weight">Weight (kg): </label>
            <input name="weight" type="text" placeholder="Enter your weight in kg"/><br><br>
            <label for="height">Height (m):</label>
            <input name="height" type="text" placeholder="Enter height in metres"/><br><br>
            <input type="submit" value="Calculate"/><br><br>
        </form>

    </body>
</html>
