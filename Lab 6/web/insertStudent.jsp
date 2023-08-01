<%-- 
    Document   : insertStudent
    Created on : 30 May 2023, 12:08:26 PM
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
        <form id="records" action="processStudent.jsp" method="POST">
            <fieldset>
                <legend>Student Registration</legend>
                <table>
                    <tr>
                        <td><label for="stuno">Student No</label></td>
                        <td><input type="text" name="stuno" size="20" placeholder="E.g: UKXXXXX"></td>
                    </tr>
                    <tr>
                        <td><label for="stuname">Name</label></td>
                        <td><input type="text" name="stuname" size="20" placeholder="Enter your name"></td>
                    </tr>
                    <tr>
                        <td><label for="stuprogram">Program</label></td>
                        <td><select name="stuprogram">
                                <option value="BSc. Soft. Eng.">BSc. Soft. Eng.</option>
                                <option value="BSc. with IM">BSc. with IM</option>
                                <option value="BSc. in Networking">BSc. in Networking</option>
                                <option value="BSc. in Robotics">BSc. in Robotics</option>
                            </select></td>
                    </tr>
                </table>
                <p> 
                    <button type="submit" value="Submit">Submit
                    <button type="btncancel" value="Reset">Cancel              
            </fieldset>
        </form>
    </body>
</html>
