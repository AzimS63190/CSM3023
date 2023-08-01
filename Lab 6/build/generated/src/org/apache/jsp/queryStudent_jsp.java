package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class queryStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lab 6 -Task 4</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1> Lab 6 - Task 4 : Retrieving record via JSP page</h1>\n");
      out.write("        <style>\n");
      out.write("            table {\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            td,th {\n");
      out.write("                border: 1px solide #999;\n");
      out.write("                padding: 0.5rem;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            th{\n");
      out.write("                background: gold;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        ");

            out.print("<table>");
            out.print("<thead>");
            out.print("<th>" + "ISBNNo" + "</th>");
            out.print("<th>" + "Author" + "</th>");
            out.print("<th>" + "Title" + "</th>");
            out.print("</tr>");
            out.print("</thead>");
            out.print("<tbody>");
        
      out.write("\n");
      out.write("        ");

            int result;
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("step 1: MySQL driver loaded....!");
            String myURL = "jdbc:mysql://localhost/csf3107";
            Connection myConnection = DriverManager.getConnection(myURL, "root", "");

            System.out.println("Step2: Database is connected!");
            Statement myStatement = myConnection.createStatement();
            String myQuery = "SELECT * FROM student";
            ResultSet myResultSet = myStatement.executeQuery(myQuery);

            while (myResultSet.next()) {
                out.print("<tr>");
                out.print("<td width=\"20%\">" + myResultSet.getString(1) + "</td>");
                out.print("<td width=\"40%\">" + myResultSet.getString(2) + "</td>");
                out.print("<td width=\"40%\">" + myResultSet.getString(3) + "</td>");
                out.print("</tr>");

            }

            System.out.println("Step5: Close database connection...!");
            myConnection.close();
            System.out.println(" ");
            System.out.println("Database connection is closed...!");
            out.print("</tbody>");
            out.print("</table>");

        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
