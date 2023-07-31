<%-- 
    Document   : insuranceQuotation
    Created on : 16 May 2023, 12:19:20 PM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insurance Quotation</title>
    </head>
    <body>
        <h1>Insurance Quotation</h1>
        <fieldset>
            <legend>Insurance Calculation</legend><br>
            <form name="insuranceForm" method="post" action="processInsuranceQuo.jsp">
                <label name="icNo">ICNo<span style="color:red">*</span></label>
                <input name="icNo" type="text" placeholder="E.g. 821210-05-3478" required/><br><br>
                <label name="name">Name<span style="color:red">*</span></label>
                <input name="name" type="text" placeholder="Enter name" required/><br><br>
                <label name="marketPrice">Market Price<span style="color:red">*</span></label>
                <input name="marketPrice" type="text" placeholder="Price" required/><br><br>
                <label name="covType">Coverage Type</label>
                <select name="covType">
                    <option value="1">Third Party</option>
                    <option value="2">Comprehensive</option>
                </select><br><br>
                <label name="ncd">No claims discount<br>(NCD)</label>
                <select name="ncd">
                    <option value="10%">10%</option>
                    <option value = "25%">25%</option>
                    <option value="35%">35%</option>
                    <option value="55%">55%</option>
                </select><br><br>
                <input type="submit"/>
                <input type="reset" value="Cancel"><br><br>
            </form>
        </fieldset><br> 
        &copy;2023-Azim S63190
    </body>
</html>
