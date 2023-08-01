<%-- 
    Document   : exercise
    Created on : 26 May 2023, 6:21:22 PM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%@page info="Process Exercise2"%>
<%@page import="lab5.com.Ex2"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Exercise 2</title>

        <style>
            div {
                font-family: Comic Sans MS, Comic Sans, cursive;
                color: #CC0066;
            }
        </style>
    </head>
    <body>
        <%
            Ex2 data = new Ex2();
            data.setStock(800);
            data.setUnitPrice(10.50);
            data.setCommission(0.05);

            double amount = data.getStock() * data.getUnitPrice();

            double sBroker = data.getCommission() * amount;

            double total = amount + sBroker;
        %>

        <h1>Exercise 2</h1>
        <p>The shares of stock : <%=data.getStock()%></p>
        <p>The price per share : 
            <fmt:formatNumber type="currency" currencyCode="MYR" value="<%=data.getUnitPrice()%>"/></p>
        <p>The stock broker commission :  
            <fmt:formatNumber type="percent" value="<%=data.getCommission()%>"/></p>
        <br/>
        <div>
            <p>The amount paid for the stock alone without the commission :
                <fmt:formatNumber type="currency" currencyCode="MYR" value="<%=amount%>"/></p>
            <p>The amount of the commission : 
                <fmt:formatNumber type="currency" currencyCode="MYR" value="<%=sBroker%>"/></p>
            <p>The total amount paid (for the stock plus the commission) : 
                <fmt:formatNumber type="currency" currencyCode="MYR" value="<%=total%>"/></p>
        </div>
    </body>
</html>
