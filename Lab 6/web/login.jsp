<%-- 
    Document   : login
    Created on : 1 Jun 2023, 8:07:46 PM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <fieldset>
            <legend>User Login</legend>
            <form action="doLogin.jsp" method="POST">
                <table>
                    <tr>
                        <td><label for="username">Username</label></td>
                        <td><input type="text" id="username" name="username"></td>
                    </tr>

                    <tr>
                        <td><label for="password">Password</label></td>
                        <td><input type="password" id="password" name="password"></td>
                    </tr>

                    <tr>
                        <td><input type="submit" value="Login"></td>
                    </tr>
                </table>
            </form>
        </fieldset>
    </body>
</html>
