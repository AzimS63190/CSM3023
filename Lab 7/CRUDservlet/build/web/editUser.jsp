<%-- 
    Document   : editUser
    Created on : 3 Jun 2023, 10:06:51 AM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit User</title>
    </head>
    <body>
        <div class="container">
            <div>
                <h3>Updating User Profile:</h3>
                <hr>
                <form name="frmEditUser" action="UserController" method="POST">
                    <table border="0">
                        <tbody>
                            <tr>
                                <td>User ID :</td>
                                <td><input type="text" name="userid" readonly="readonly" 
                                           value="<c:out value="${user.userid}" />" size="25"></td>
                            </tr>
                            <tr>
                                <td>First Name :</td>
                                <td><input type="text" name="firstName"  
                                           value="<c:out value="${user.firstname}" />" size="40"></td>
                            </tr>
                            <tr>
                                <td>Last Name :</td>
                                <td><input type="text" name="lastName"  
                                           value="<c:out value="${user.lastname}" />" size="40"></td>
                            </tr>
                            <tr>
                                <td><input type="hidden" name="action" value="edit" ></td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="submit" name="submit" value="Submit" >
                                </td>
                            </tr>
                        </tbody>
                    </table>

                </form>
            </div></div>
    </body>
</html>
