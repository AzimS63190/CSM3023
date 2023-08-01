<%-- 
    Document   : processTraining
    Created on : 26 May 2023, 10:00:02 AM
    Author     : Azim S63190
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%@page info="Process Training"%>
<%@page import="lab5.com.Register"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Register register = new Register();
            register.setIC(request.getParameter("ic"));
            register.setName(request.getParameter("name"));
            register.setTrainingType(Integer.parseInt(request.getParameter("trainingType")));
            register.setPax(Integer.parseInt(request.getParameter("pax")));
            register.setStudent(Integer.parseInt(request.getParameter("stud")));

            String trainingType = "";
            double amount = 0.00;
            switch (register.getTrainingType()) {
                case 1:
                    trainingType = "C++ Training";
                    amount = 3000.00;
                    break;
                case 2:
                    trainingType = "Java for beginner";
                    amount = 3000.00;
                    break;
                case 3:
                    trainingType = "HTML5";
                    amount = 2800.00;
                    break;
                case 4:
                    trainingType = "Java EEE";
                    amount = 5500.00;
                    break;
                case 5:
                    trainingType = "Android Programming";
                    amount = 3200.00;
                    break;
            }

            String stud = "";
            if (register.getStudent() == 1) {
                amount = 0.9 * amount;
                stud = "Yes";
            } else {
                stud = "No";
            }

            int pax = register.getPax();
            double TotalAmount;
            TotalAmount = amount * pax;

            java.util.Formatter TotalAmount_Formatter = new java.util.Formatter();
        %>

        <style>
            div {
                font-family: Comic Sans MS, Comic Sans, cursive;
                color: #0033cc;
            }
        </style>

        <h1>Training Registration Acknowledgement</h1>
        <div>
            <p>IC No : <%=register.getIC()%></p>
            <p>Name : <%=register.getName()%></p>
            <p>Type of Training : <%=trainingType%></p>
            <p>Number of Pax : <%=register.getPax()%> person/s</p>
            <p>Student : <%=stud%></p>
            <p>Amount Due : RM <%=TotalAmount_Formatter.format("%.2f", TotalAmount)%></p>
        </div>
    </body>
</html>
