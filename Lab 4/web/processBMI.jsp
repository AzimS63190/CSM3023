<%-- 
    Document   : processBMI
    Created on : 17 May 2023, 12:21:14 AM
    Author     : azimm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BMI is calculated!</title>
    </head>
    <body>
        <%
            double weight = Double.parseDouble(request.getParameter("weight"));
            double height = Double.parseDouble(request.getParameter("height"));
            double bmi = weight / Math.pow(height, 2);
            String remarks = "";
             if (bmi >= 18.5 && bmi <= 25) {%>
        <%remarks = "optimal";
            } else if (bmi < 18.5) { %>
        <%remarks = "underweight";
             } else if (bmi > 25) { %>
        <%remarks = "overweight";
            }
        %>
    <center>
        <h1 style="background-image: linear-gradient(greenyellow,lightblue)">Your BMI is <%=String.format("%.2f", bmi)%> <b>(<%=remarks%>)</b>.</h1>
    </body>
</html>
