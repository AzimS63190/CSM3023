<%-- 
    Document   : listUser
    Created on : 3 Jun 2023, 12:15:47 AM
    Author     : azimm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Lists</title>
    </head>
    <body>
        <h1>List of Users..!</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>User Id</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th colspan="2">Action</th>

                </tr>
            </thead>
            <tbody>
                <c:forEach items="${users}" var="user" >
                    <tr>
                        <td><c:out value="${user.userid}"/></td>
                        <td><c:out value="${user.firstname}"/></td>
                        <td><c:out value="${user.lastname}"/></td>
                        <td><a href='UserController?action=edit&userId=<c:out value="${user.userid}"/>'>Update</a></td>
                        <td><a href="UserController?action=delete&userId=<c:out value="${user.userid}"/>">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p><a href="UserController?action=insert">Add User</a></p>
        <%=request.getContextPath()%>
    </body>
</html>
