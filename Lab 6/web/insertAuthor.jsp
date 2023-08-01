<%-- 
    Document   : insertAuthor
    Created on : 30 May 2023, 11:33:42 AM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP page</title>
    </head>
    <body>
        <h1>LAB6 6 - Task 2 - Perform creating and retrieving records via JSP page</h1>
        <form name="author" action="processAuthor.jsp" >
            <fieldset>
                <legend>
                    Author Registration
                </legend>
                <table>
                    <tr>
                        <td><label> Author No</label></td>
                        <td><input type="text" id="authno" name="authno" placeholder="E.g:UKXXXXX"></td>
                    </tr>
                    <tr>
                        <td><label>Name</label></td>
                        <td><input type="text" id="name" name="name" placeholder="Enter your name"></td> 
                    </tr>
                    <tr>
                        <td><label>Address</label></td>
                        <td><input type="text" id="address" name="address" placeholder="Enter your address"></td> 
                    </tr>
                    <tr>
                        <td><label>City</label></td>
                        <td><input type="text" id="city" name="city" placeholder="Enter your city"></td> 
                    </tr>
                    <tr>
                        <td><label>State</label></td>
                        <td><input type="text" id="state" name="state" placeholder="Enter your state"</td> 
                    </tr>
                    <tr>
                        <td><label>Zip</label></td>
                        <td><input type="text" id="zip" name="zip" placeholder="Enter your zip"</td> 
                    </tr>
                </table>
                <tr>
                <input type="submit" id="btnsubmit" name="submit" value="Submit">
                <input type="reset" id="btncancel" name="reset" value="Cancel"> 
                </tr>
            </fieldset>
        </form>
        <footer>
            &COPY;2023 - Azim S63190
        </footer>
    </body>
</html>

