<%-- 
    Document   : fmt_parseDate
    Created on : 26 May 2023, 2:18:26 PM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>fmt:parseDate feature</title>
    </head>
    <body>
        <h2>fmt:parseDate example</h2>
        <!-- a Date time string -->

        <c:set var="dateTimeString" value="17-11-2015 11:49"/>
        <h4>
            dateTimeString:
            <c:out value="${dateTimeString}" />
        </h4>

        <!-- Parsing a date time string, and store in a variable type of java -->
        <fmt:parseDate value="${dateTimeString}" 
                       type="both" var="parsedDatetime" pattern="dd-MM-yyyy HH:mm" />
        <p>
            The date time after parsing:
            <c:out value="${parsedDatetime}" />
        </p>
        <br/>
        <p>
            Date only (dd/MM/yyyy):
            <fmt:formatDate value="${parsedDatetime}" pattern="dd/MM/yyyy" />
        </p>
    </body>
</html>
