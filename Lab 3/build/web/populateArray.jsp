<%-- 
    Document   : populateArray
    Created on : 26 Apr 2023, 11:16:55 AM
    Author     : azimm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
                table {
                    text-align: center;
                    width: 75%;
                    border-collapse: collapse;
            }
            th {
                background-color: #FFFF00;
            }
            td {
                background-color: #FfffBf;
            }

        </style>
    </head>
    <body>
        <h1>Read Java array and populate it into HTML's table</h1>
        
        <%
            int[][] array = {{2500,2100,2200},{2000,1900,2400},{1800,2200,2450}};
    %>
    
        <table>
            <tr>
                <th> Salesman</th>
                <th> Jan</th>
                <th> Feb</th>
                <th> Mac</th>
            </tr>
            
                <% 
            for(int i = 0; i < array.length; i++) {
                out.println("<tr>");
                out.println("<td>Salesman " + (i+1) + "</td>");
                for(int j = 0; j < array[i].length; j++) {
                    out.println("<td>" + array[i][j] +"</td>");
                }
                out.println("</tr>");
            } 
       %>
        
        </table>
       <br>
       &copy;2023-Azim
    
    </body>
