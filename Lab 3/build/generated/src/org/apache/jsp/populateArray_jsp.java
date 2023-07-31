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
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("                table {\n");
      out.write("                    text-align: center;\n");
      out.write("                    width: 75%;\n");
      out.write("                    border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            th {\n");
      out.write("                background-color: #FFFF00;\n");
      out.write("            }\n");
      out.write("            td {\n");
      out.write("                background-color: #FfffBf;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Read Java array and populate it into HTML's table</h1>\n");
      out.write("        \n");
      out.write("        ");

            int[][] array = {{2500,2100,2200},{2000,1900,2400},{1800,2200,2450}};
    
      out.write("\n");
      out.write("    \n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th> Salesman</th>\n");
      out.write("                <th> Jan</th>\n");
      out.write("                <th> Feb</th>\n");
      out.write("                <th> Mac</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("                ");
 
            for(int i = 0; i < array.length; i++) {
                out.println("<tr>");
                out.println("<td>Salesman " + (i+1) + "</td>");
                for(int j = 0; j < array[i].length; j++) {
                    out.println("<td>" + array[i][j] +"</td>");
                }
                out.println("</tr>");
            } 
       
      out.write("\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("       <br>\n");
      out.write("       &copy;2023-Azim\n");
      out.write("    \n");
      out.write("    </body>\n");
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
