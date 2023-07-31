<%-- 
    Document   : AreaOfCircle
    Created on : 10 Apr 2023, 12:45:52 AM
    Author     : Wan Abdul Azim
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area of Circle Calculator</title>
    </head>
    <body>
        <%
            String r;
            int rad;
            double area;
            r = JOptionPane.showInputDialog("Please enter the radius...!");
            rad = Integer.parseInt(r);
            area = Math.PI*(rad*rad);
            JOptionPane.showMessageDialog(null,"The area of circle = " + area);
         %>
    </body>
</html>
