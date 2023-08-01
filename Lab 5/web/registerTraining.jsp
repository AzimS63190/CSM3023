<%-- 
    Document   : registerTraining
    Created on : 26 May 2023, 9:28:56 AM
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
        <h3><i>Register IT Training</i></h3>
        <form id="RegisterTraining" action="processTraining.jsp" method="POST">
            <fieldset>
                <legend>Training Registration</legend>
                <table>
                    <tr>
                        <td>IC No</td>
                        <td><input type="text" name="ic" size="14" placeholder="E.g.: 911210-05-1234" required="required" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="name" size="50" placeholder="Enter your name" required="required" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td>Type of Training</td>
                        <td>
                            <select name="trainingType">
                                <option value="1">C++ training</option>
                                <option value="2">Java for beginner</option>
                                <option value="3">HTML5</option>
                                <option value="4">Java EEE</option>
                                <option value="5">Android Programming</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>No of Pax</td>
                        <td><input type="number" name="pax" placeholder="No of pax" required="required" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td>Student</td>
                        <td><input name="stud" value="1" type="radio">
                            Yes
                            &nbsp;
                            <input name="stud" value="2" type="radio" checked>
                            No
                        </td>
                    </tr>
                    <tr>
                        <td><br/>
                            <input type="submit" name="Submit" value="Submit" />
                            <input type="reset" name="Cancel" value="Cancel" />
                        </td> 
                    </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>