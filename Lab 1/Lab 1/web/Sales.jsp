<%-- 
    Document   : Sales
    Created on : 10 Apr 2023, 6:23:34 AM
    Author     : Wan Abdul Azim
--%>
<%@page import="java.io.DataInputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sales</title>
        <style>
            table{
                width: 100%;
                border-collapse: collapse;
                border-width: 2px;
                border-color: #696969;
                border-style: solid;
            }
            td{
                border-width: 2px;
                text-align: center;
                border-color: #000000;
                border-style: solid;
                padding: 3px;
            }
            th{
                background-color: grey;
                border-width: 2px;
                text-align: center;
                border-color: #000000;
                border-style: solid;
                padding: 3px;
            }
        </style>
    </head>
    <body>
        <%
            String fName = "C:\\S63190\\Lab 1\\Sales.csv";
            String thisLine;
            FileInputStream fis = new FileInputStream(fName);
            DataInputStream myInput = new DataInputStream(fis);
            int i = 1;
        %>
        <table>
            <tr>
                <th>Customer</th>
                <th>Cust.Type</th>
                <th>Purchase</th>
                <th>Discount</th>
            </tr>
            <%
                while ((thisLine = myInput.readLine()) != null) {
                    String strar[] = thisLine.split(";");
                    out.print("<tr>");

                    if (strar[1] == "Cash") {
                        out.print("success");
                    }
                    for (int j = 0; j < strar.length; j++) {
                        out.print("<td>" + strar[j] + "</td>");
                    }
                    out.print("<td>");
                    if (thisLine.contains("Cash")) {
                        java.util.Formatter myFormat = new java.util.Formatter();
                        double calc = Double.parseDouble(strar[2]) * 10 / 100;
                        out.print(myFormat.format("%.2f", calc));
                    } else {
                        out.print("0.00");
                    }
                    out.print("</td>");
                    out.print("</tr>");
                    i++;
                }

            %>
        </table>
    </body>
</html>
