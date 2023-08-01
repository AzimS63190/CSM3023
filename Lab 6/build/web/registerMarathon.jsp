<%-- 
    Document   : registerMarathon
    Created on : 1 Jun 2023, 3:36:58 PM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register Marathon</h1>
        <form id="registerFrm" action="processMarathon.jsp" method="post">
            <fieldset width="60%">
                <legend>Marathon Registration</legend>
                <table>
                    <tr>
                        <td><label>IC No </label></td>
                        <td><input type="text" name="icno" size="15" placeholder="E.g.: 921110-10-2514"><br/></td>
                    </tr>

                    <tr>
                        <td><label>Name </label></td>
                        <td><input type="text" name="name" size="50" placeholder="Enter your name"><br/></td>
                    </tr>

                    <tr>
                        <td><label for="category">Category</label></td>
                        <td><select size="1" name="category">
                                <option value="1" >5 KM</option>
                                <option value="2" >7 KM</option>
                                <option value="3" >10 KM</option>
                            </select></td>
                    </tr>

                    <tr>
                        <td>
                            <input type="submit" id="btnSubmit" value="Submit"/>
                            <input type="reset" id="btnCancel" value="Cancel"/> 
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>