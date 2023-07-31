<%-- 
    Document   : processCurrency
    Created on : 16 May 2023, 10:45:59 AM
    Author     : Azim S63190
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Process Currency Conversion</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Dongle">
        <style>
            p{
                color: #7F00FF;
                font-family: "Dongle", sans-serif;
                font-size: 2.5em;
            }
        </style>
    </head>
    <body>
        <h1>Use JSP Declaration tag, JSP Scriplet and JSP Expression in application</h1><br>

        <%
            String code = request.getParameter("currency");
            int amt = Integer.parseInt(request.getParameter("amount"));

            String currName = " ";
            if (code.equals("1")) {
                currName = "Amount in USD is " + String.format("%.2f", calculateRate(code, amt)) + " USD";
            }
            if (code.equals("2")) {
                currName = "Amount in STG is " + String.format("%.2f", calculateRate(code, amt)) + " Sterling";
            }
            if (code.equals("3")) {
                currName = "Amount in EURO is " + String.format("%.2f", calculateRate(code, amt)) + " Euro";
            }

        %>
        <%!
            final double USD = 3.92;
            final double STG = 5.96;
            final double EURO = 4.47;
            //Define method to perform currency exchange....

            private double calculateRate(String currency, int amount) {
                double currencyChange = 0.00f;

                if (currency.equals("1")) {
                    currencyChange = (double) (amount / USD);
                }
                if (currency.equals("2")) {
                    currencyChange = (double) (amount / STG);
                }
                if (currency.equals("3")) {
                    currencyChange = (double) (amount / EURO);
                }

                return currencyChange; //return the result...
            }
        %>
        <p>Amount in Ringgit Malaysia is RM<%=amt%></p>
        <p><%=currName%></p>
    </body>
</html>

