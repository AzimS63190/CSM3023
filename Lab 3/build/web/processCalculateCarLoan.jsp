<%-- 
    Document   : processCalculateCarLoan
    Created on : 26 Apr 2023, 11:36:20 AM
    Author     : azimm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Car Loan Calculation</title>
    </head>
    <body>
        <h1>Perform Car Loan Calculation</h1>

        <fieldset>
            <%
                //Define variables...
                String loanamount = null;
                String str_period = null;
                double result = 0;

                //Use request.getParameter() method to retrieve data from main's form...
                loanamount = request.getParameter("loan_amount");
                str_period = request.getParameter("period");
                int period = Integer.parseInt(str_period);

                switch (period) {
                    case 3:
                        result = Integer.parseInt(loanamount) + (Integer.parseInt(loanamount) * 0.028 * period);
                        break;
                    case 4:
                        result = Integer.parseInt(loanamount) + (Integer.parseInt(loanamount) * 0.028 * period);
                        break;
                    case 5:
                        result = Integer.parseInt(loanamount) + (Integer.parseInt(loanamount) * 0.028 * period);
                        break;
                    case 7:
                        result = Integer.parseInt(loanamount) + (Integer.parseInt(loanamount) * 0.045 * period);
                        break;
                }
                String total = String.format("%.2f", result);
            %>

            <!-- Display the output... -->
            <h1 style="color:blue">Details of car loan:</h1>
            <p>Loan Request : <%=loanamount%></p>
            <p>Period of payment : <%=period%></p>
            <p>Total Loan (+ interest) : <%=total%></p>
        </fieldset>

    </body>
</html>
