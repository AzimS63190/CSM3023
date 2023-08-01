<%-- 
    Document   : jstlFormat1
    Created on : 26 May 2023, 12:45:50 PM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL core and JSTL formatting</title>

        <style>
            p {
                font-family: Arial, Helvetica, sans-serif;
                color: #cc0099;
                font-size: 21px;
            }
        </style>
    </head>
    <body>
        <h1>Using JSTL formatting tag for formatting</h1>

        <!-- Assign specific number to variable -->
        <c:set var="total" value="2880.4638" />
        <p>Number to be formatted is <c:out value="${total}"/></p>
        <p>Formatting number as currency with currency code : <fmt:formatNumber type="currency" currencyCode="MYR" value="${total}"/></p>
        <p>Formatting number to the nearest 2 integer digit : <fmt:formatNumber type="number" maxIntegerDigits="2" value="${total}"/></p>
        <p>Formatting number by grouping : <fmt:formatNumber type="number" groupingUsed="true" value="${total}"/></p>
        <p>Formatting number by 3 decimal places : <fmt:formatNumber type="number" maxFractionDigits="3" value="${total}"/></p>
        <p>Formatting number by % : <fmt:formatNumber type="percent" value="${total}"/></p>
    </body>
</html>
