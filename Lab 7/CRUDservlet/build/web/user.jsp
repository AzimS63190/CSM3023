<%-- 
    Document   : user
    Created on : 3 Jun 2023, 12:47:12 AM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Record</title>
    </head>
    <body>
        <div class="container">
            <div>
                <h3><b>New Record</b></h3>
                <hr>
                <form name="frmAddUser" action="UserController" method="POST">
                    <table border="0">
                        <tbody>
                            <tr>
                                <td>User ID :</td>
                                <td><input name="userid" type="text" value="" size="25" required></td>
                            </tr>
                            <tr>
                                <td>First Name :</td>
                                <td><input name="firstName" type="text" value="" size="40" ></td>
                            </tr>
                            <tr>
                                <td>Last Name :</td>
                                <td><input name="lastName" type="text" value="" size="40" ></td>
                            </tr>
                            <tr>
                                <td><input type="hidden" name="action" value="insert" ></td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="submit" name="submit" value="Submit" >
                                    <input type="reset" name="cancel" value="Cancel" >
                                </td>
                            </tr>
                        </tbody>
                    </table>

                </form>
            </div></div>
    </body>
</html>
