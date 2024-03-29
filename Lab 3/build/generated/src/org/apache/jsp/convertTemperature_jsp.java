package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class convertTemperature_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Temperature Converter</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-color:darkgrey\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String temperature = "";
            double C = 0;
            double F = 0;
            String result = "0.0";
            if (request.getParameter("temperature") != null) {
                temperature = request.getParameter("temperature");
                C = Double.parseDouble(temperature);
                F = ((9.0 / 5.0) * C) + 32;
                result = String.format("%.1f", F);
            }
        
      out.write("\n");
      out.write("        <h1>Temperature Converter</h1>\n");
      out.write("        <hr>\n");
      out.write("        <br>\n");
      out.write("        <form method=\"get\">\n");
      out.write("            <input type=\"text\" name=\"temperature\" value=\"");
      out.print(C);
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Calculate\"/> \n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        Fahrenheit = ");
      out.print( result + "");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
