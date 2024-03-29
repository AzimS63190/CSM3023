package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.DataInputStream;
import java.io.FileInputStream;

public final class Sales_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sales</title>\n");
      out.write("        <style>\n");
      out.write("            table{\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                border-width: 2px;\n");
      out.write("                border-color: #696969;\n");
      out.write("                border-style: solid;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                border-width: 2px;\n");
      out.write("                text-align: center;\n");
      out.write("                border-color: #000000;\n");
      out.write("                border-style: solid;\n");
      out.write("                padding: 3px;\n");
      out.write("            }\n");
      out.write("            th{\n");
      out.write("                background-color: grey;\n");
      out.write("                border-width: 2px;\n");
      out.write("                text-align: center;\n");
      out.write("                border-color: #000000;\n");
      out.write("                border-style: solid;\n");
      out.write("                padding: 3px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String fName = "C:\\S63190\\Lab 1\\Sales.csv";
            String thisLine;
            FileInputStream fis = new FileInputStream(fName);
            DataInputStream myInput = new DataInputStream(fis);
            int i = 1;
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Customer</th>\n");
      out.write("                <th>Cust.Type</th>\n");
      out.write("                <th>Purchase</th>\n");
      out.write("                <th>Discount</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

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

            
      out.write("\n");
      out.write("        </table>\n");
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
