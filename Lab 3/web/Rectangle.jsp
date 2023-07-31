<%-- 
    Document   : Rectangle
    Created on : 27 Apr 2023, 10:22:17 AM
    Author     : azimm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rectangle Area Comparison</title>
    </head>
    <body>

        <form action="calculateRectangle.jsp" method="post" onsubmit="">
            <fieldset>
                <legend><h1>Rectangle Area Comparison</h1></legend>
                <h2>Rectangle1</h2>
                <label for="width1">Width1: </label>&nbsp;&nbsp;&nbsp;
                <input type="text" id="width1" name="width1">
                <br>
                <br>
                <label for="height1">Height1: </label>&nbsp;&nbsp;&nbsp;
                <input type="text" id="height1" name="height1">
                <br><br>
                <hr>
                <h2>Rectangle2</h2>
                <label for="width2">Width2: </label>&nbsp;&nbsp;&nbsp;
                <input type="text" id="width2" name="width2">
                <br><br>
                <label for="height2">Height2: </label>&nbsp;&nbsp;&nbsp;
                <input type="text" id="height2" name="height2">
                <br><br>
            </fieldset>
            <p><input type="submit" id="btnSubmit" value="Submit"/>
                <input type="reset" id="btnCancel" value="Cancel"/>
            </p>
        </form>
    </body>