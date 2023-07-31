<%-- 
    Document   : calculateRectangle
    Created on : 27 Apr 2023, 10:51:33 AM
    Author     : azimm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rectangle Area Comparison</title>
    </head>
    <body>
        <%
            String result = null;
            String width1 = request.getParameter("width1");
            String height1 = request.getParameter("height1");
            String width2 = request.getParameter("width2");
            String height2 = request.getParameter("height2");

            double a1 = Double.parseDouble(width1) * Double.parseDouble(height1);
            double a2 = Double.parseDouble(width2) * Double.parseDouble(height2);
            String area1 = String.format("%.2f", a1);
            String area2 = String.format("%.2f", a2);
            if (a1 > a2) {
                result = "The area of Rectangle 1 (" + area1 + ") is greater than Area of Rectangle 2 (" + area2 + ")";
            } else if (a1 < a2) {
                result = "The area of Rectangle 2 (" + area2 + ") is greater than Area of Rectangle 1 (" + area1 + ")";
            } else {
                result = "The area of Rectangle 1 & Rectangle2 are the same which is " + area1;
            }


        %>
        <fieldset>
            <legend><h1>Rectangle Area Comparison</h1></legend>
            <p>Area of Rectangle 1 : <%=String.format("%s", area1)%></p>
            <p>Area of Rectangle 2 : <%=String.format("%s", area2)%></p>
        </fieldset>

        <p><%=result%></p>


    </body>