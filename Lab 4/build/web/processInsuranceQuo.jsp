<%-- 
    Document   : processInsuranceQuo
    Created on : 16 May 2023, 12:49:36 PM
    Author     : azimm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Final Insurance Quotation</title>
        <style>
            p{
                color: #7F00FF;
                font-size: 1.25em;
            }
        </style>
    </head>
    <body>
        <fieldset>
            <legend><b>Details of Insurance Quotation</b></legend>
            <%
                String ic = request.getParameter("icNo");
                String cName = request.getParameter("name");
                int mPrice = Integer.parseInt(request.getParameter("marketPrice"));
                String coverage = request.getParameter("covType");
                String ncd = request.getParameter("ncd");
                double insuranceAmt = 0.0;
                String covDesc = "";
                if (coverage.equals("1")) {%>
            <%
                       covDesc = "Third Party";
                       if (ncd.equals("10%")) {%>
            <%insuranceAmt = 0.033 * mPrice;
                    } else if (ncd.equals("25%")) {%>
            <%insuranceAmt = 0.025 * mPrice;
                    } else if (ncd.equals("35%")) {%>
            <%insuranceAmt = 0.018 * mPrice;
                    } else if (ncd.equals("55%")) {%>
            <%insuranceAmt = 0.012 * mPrice;
                        }
                    } else if (coverage.equals("2")) {%>
            <%
                covDesc = "Comprehensive";
                if (ncd.equals("10%")) {%>
            <%insuranceAmt = 0.038 * mPrice;
                    } else if (ncd.equals("25%")) {%>
            <%insuranceAmt = 0.030 * mPrice;
                    } else if (ncd.equals("35%")) {%>
            <%insuranceAmt = 0.024 * mPrice;
                    } else if (ncd.equals("55%")) {%>
            <%insuranceAmt = 0.018 * mPrice;
                            }
                        }%>  
            <p>IC No: <%=ic%></p><br>
            <p>Customer Name: <%=cName%></p><br>
            <p>Market Price: <%=mPrice%></p><br>
            <p>Coverage type: <%=covDesc%></p><br>
            <p>No claim discount (NCD) = <%=ncd%></p><br>
            <p>Insurance amount: <%=String.format("%.2f", insuranceAmt)%></p><br>
            <p>6% GST : <%=String.format("%.2f", insuranceAmt * 0.06)%></p><br>
            <p>Final amount (with 6% GST): <%=String.format("%.2f", insuranceAmt * 1.06)%></p><br>
        </fieldset>

    </body>
</html>

