<%-- 
    Document   : memberRegister
    Created on : 25 Apr 2023, 10:48:28 PM
    Author     : azimm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 3 - Task 1</title>
    </head>
    <body>
        <h1>Passing data from main JSP's page to other JSP's page</h1>
        <form id="memberFrm" action="memberProcessing.jsp" method="post" onsubmit="return checkICNo()">
            <fieldset>
                <legend>Member Registration</legend>
                <label for="invoiceNo">Ic No*   </label><!-- comment -->
                <input type="text" id="icno" name="my_icno" size="15" placeholder="E.g 921012101245"><br/>

                <label for="name">Name  </label><!-- comment -->
                <input type="text" id="name" name="my_name" size="45" placeholder="Key-in your name"><br/>

                <p><input type="submit" id="btnSubmit" value="Submit"><!-- comment -->
                    <input type="reset" id="btnCancel" value="Cancel">
            </fieldset>
    </body>
</html>
