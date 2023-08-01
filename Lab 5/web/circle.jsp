<%-- 
    Document   : circle
    Created on : 26 May 2023, 3:13:51 PM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP form for circle</title>

        <style>
            div {
                font-family: Comic Sans MS, Comic Sans, cursive;
                background-color: lightblue;
            }
        </style>
    </head>
    <body>
        <h1>Calculate the area and the perimeter of a circle</h1>
        <form method="post">
            Enter the radius &nbsp; &nbsp;
            <input type="text" name="radius" value="<c:out value="${param.radius}"/>" autofocus/>
            cm
            <input type="submit" value="Calculate" />
        </form>
        <br/>
        <div>
            <c:if test="${pageContext.request.method=='POST'}">
                <c:set var="area" value="${ (param.radius* param.radius) * 3.1416}"/>
                <c:set var="perimeter" value="${ 2 * param.radius * 3.1416}"/>

                The area of the circle is <fmt:formatNumber value="${area}" maxFractionDigits="3"/>.
                <br/>
                The perimeter of the circle is <fmt:formatNumber value="${perimeter}" maxFractionDigits="3"/>.
            </c:if>
        </div>
    </body>
</html>