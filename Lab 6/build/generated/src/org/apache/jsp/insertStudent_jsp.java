package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form id=\"records\" action=\"processStudent.jsp\" method=\"POST\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Student Registration</legend>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"stuno\">Student No</label></td>\n");
      out.write("                        <td><input type=\"text\" name=\"stuno\" size=\"20\" placeholder=\"E.g: UKXXXXX\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"stuname\">Name</label></td>\n");
      out.write("                        <td><input type=\"text\" name=\"stuname\" size=\"20\" placeholder=\"Enter your name\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"stuprogram\">Program</label></td>\n");
      out.write("                        <td><select name=\"stuprogram\">\n");
      out.write("                                <option value=\"BSc. Soft. Eng.\">BSc. Soft. Eng.</option>\n");
      out.write("                                <option value=\"BSc. with IM\">BSc. with IM</option>\n");
      out.write("                                <option value=\"BSc. in Networking\">BSc. in Networking</option>\n");
      out.write("                                <option value=\"BSc. in Robotics\">BSc. in Robotics</option>\n");
      out.write("                            </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <p> \n");
      out.write("                    <button type=\"submit\" value=\"Submit\">Submit\n");
      out.write("                    <button type=\"btncancel\" value=\"Reset\">Cancel              \n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
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
