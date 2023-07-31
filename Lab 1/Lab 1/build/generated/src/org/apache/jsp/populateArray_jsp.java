package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class populateArray_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Populate Array</title>\n");
      out.write("        <style>\n");
      out.write("            #populate {\n");
      out.write("                font-family: Arial,Helvetica, sans-serif;\n");
      out.write("                text-align: center;\n");
      out.write("                border-color: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #populate td, #populate th {\n");
      out.write("                border: 1px #ddd;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #populate tr {\n");
      out.write("                background-color: #fffde7;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #populate th {\n");
      out.write("                padding-top: 12px;\n");
      out.write("                padding-bottom: 12px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: #ffe87c;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Read Java Array and populate it into HTML's table</h1>\n");
      out.write("    \n");
      out.write("        ");

            int array[][] = new int [3][3];
            
            array[0][0] = 2500;
            array[0][1] = 2100;
            array[0][2] = 2200;
            array[1][0] = 2000;
            array[1][1] = 1900;
            array[1][2] = 2400;
            array[2][0] = 1800;
            array[2][1] = 2200;
            array[2][2] = 2450;
            
            
      out.write("\n");
      out.write("            \n");
      out.write("            <table id=\"populate\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Salesman</th>\n");
      out.write("                    <th>Jan</th>\n");
      out.write("                    <th>Feb</th>\n");
      out.write("                    <th>Mac</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Salesman1</td>\n");
      out.write("                    <td>");
      out.print( array[0][0] );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( array[0][1] );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( array[0][2] );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Salesman2</td>\n");
      out.write("                    <td>");
      out.print( array[1][0] );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( array[1][1] );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( array[1][2] );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Salesman3</td>\n");
      out.write("                    <td>");
      out.print( array[2][0] );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( array[2][1] );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( array[2][2] );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                <footer>\n");
      out.write("                    <p>&copy; 2023 - Wan Abdul Azim</p>\n");
      out.write("                </footer>\n");
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
