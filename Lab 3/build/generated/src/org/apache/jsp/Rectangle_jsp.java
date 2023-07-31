package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Rectangle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Rectangle Area Comparison</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form action=\"calculateRectangle.jsp\" method=\"post\" onsubmit=\"\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend><h1>Rectangle Area Comparison</h1></legend>\n");
      out.write("                <h2>Rectangle1</h2>\n");
      out.write("                <label for=\"width1\">Width1: </label>&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input type=\"text\" id=\"width1\" name=\"width1\">\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"height1\">Height1: </label>&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input type=\"text\" id=\"height1\" name=\"height1\">\n");
      out.write("                <br><br>\n");
      out.write("                <hr>\n");
      out.write("                <h2>Rectangle2</h2>\n");
      out.write("                <label for=\"width2\">Width2: </label>&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input type=\"text\" id=\"width2\" name=\"width2\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"height2\">Height2: </label>&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input type=\"text\" id=\"height2\" name=\"height2\">\n");
      out.write("                <br><br>\n");
      out.write("            </fieldset>\n");
      out.write("            <p><input type=\"submit\" id=\"btnSubmit\" value=\"Submit\"/>\n");
      out.write("                <input type=\"reset\" id=\"btnCancel\" value=\"Cancel\"/>\n");
      out.write("            </p>\n");
      out.write("        </form>\n");
      out.write("    </body>");
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
