package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insuranceQuotation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Insurance Quotation</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Insurance Quotation</h1>\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Insurance Calculation</legend><br>\n");
      out.write("            <form name=\"insuranceForm\" method=\"post\" action=\"processInsuranceQuo.jsp\">\n");
      out.write("                <label name=\"icNo\">ICNo<span style=\"color:red\">*</span></label>\n");
      out.write("                <input name=\"icNo\" type=\"text\" placeholder=\"E.g. 821210-05-3478\" required/><br><br>\n");
      out.write("                <label name=\"name\">Name<span style=\"color:red\">*</span></label>\n");
      out.write("                <input name=\"name\" type=\"text\" placeholder=\"Enter name\" required/><br><br>\n");
      out.write("                <label name=\"marketPrice\">Market Price<span style=\"color:red\">*</span></label>\n");
      out.write("                <input name=\"marketPrice\" type=\"text\" placeholder=\"Price\" required/><br><br>\n");
      out.write("                <label name=\"covType\">Coverage Type</label>\n");
      out.write("                <select name=\"covType\">\n");
      out.write("                    <option value=\"1\">Third Party</option>\n");
      out.write("                    <option value=\"2\">Comprehensive</option>\n");
      out.write("                </select><br><br>\n");
      out.write("                <label name=\"ncd\">No claims discount<br>(NCD)</label>\n");
      out.write("                <select name=\"ncd\">\n");
      out.write("                    <option value=\"10%\">10%</option>\n");
      out.write("                    <option value = \"25%\">25%</option>\n");
      out.write("                    <option value=\"35%\">35%</option>\n");
      out.write("                    <option value=\"55%\">55%</option>\n");
      out.write("                </select><br><br>\n");
      out.write("                <input type=\"submit\"/>\n");
      out.write("                <input type=\"reset\" value=\"Cancel\"><br><br>\n");
      out.write("            </form>\n");
      out.write("        </fieldset><br> \n");
      out.write("        &copy;2023-Azim S63190\n");
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
