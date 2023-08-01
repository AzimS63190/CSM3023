package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertAuthor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>LAB6 6 - Task 2 - Perform creating and retrieving records via JSP page</h1>\n");
      out.write("        <form name=\"author\" action=\"processAuthor.jsp\" >\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>\n");
      out.write("                    Author Registration\n");
      out.write("                </legend>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label> Author No</label></td>\n");
      out.write("                        <td><input type=\"text\" id=\"authno\" name=\"authno\" placeholder=\"E.g:UKXXXXX\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label>Name</label></td>\n");
      out.write("                        <td><input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Enter your name\"></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label>Address</label></td>\n");
      out.write("                        <td><input type=\"text\" id=\"address\" name=\"address\" placeholder=\"Enter your address\"></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label>City</label></td>\n");
      out.write("                        <td><input type=\"text\" id=\"city\" name=\"city\" placeholder=\"Enter your city\"></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label>State</label></td>\n");
      out.write("                        <td><input type=\"text\" id=\"state\" name=\"state\" placeholder=\"Enter your state\"</td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label>Zip</label></td>\n");
      out.write("                        <td><input type=\"text\" id=\"zip\" name=\"zip\" placeholder=\"Enter your zip\"</td> \n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <tr>\n");
      out.write("                <input type=\"submit\" id=\"btnsubmit\" name=\"submit\" value=\"Submit\">\n");
      out.write("                <input type=\"reset\" id=\"btncancel\" name=\"reset\" value=\"Cancel\"> \n");
      out.write("                </tr>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("        <footer>\n");
      out.write("            &COPY;2023 - Azim S63190\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
