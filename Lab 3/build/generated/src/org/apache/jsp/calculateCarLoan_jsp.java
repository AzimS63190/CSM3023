package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calculateCarLoan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>car loan calculator</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Perform Car Loan Calculation</h1>\n");
      out.write("        <form id=\"carloan\" action=\"processCalculateCarLoan.jsp\" method=\"post\" onsubmit=\"return checkICNo()\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend> Loan Calculation</legend>\n");
      out.write("                <label for=\"loanAmount\">Loan Amount*   </label><!-- comment -->\n");
      out.write("                <input type=\"text\" id=\"loanAmount\" name=\"my_loanAmount\" size=\"10\" placeholder=\"Amount\" /><br/>\n");
      out.write("\n");
      out.write("                <label for=\"loanPeriod\">Period  </label>\n");
      out.write("                <select name=\"my_loanPeriod\" id=\"loanPeriod\">\n");
      out.write("                    <option value=\"3\">3 years</option>\n");
      out.write("                    <option value=\"4\">4 years</option>\n");
      out.write("                    <option value=\"5\">5 years</option>\n");
      out.write("                    <option value=\"6\">6 years</option>\n");
      out.write("                    <option value=\"7years\">7 years</option>\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                <p><input type=\"submit\" id=\"btnSubmit\" value=\"Submit\"><!-- comment -->\n");
      out.write("                    <input type=\"reset\" id=\"btnCancel\" value=\"Cancel\">\n");
      out.write("            </fieldset>\n");
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
