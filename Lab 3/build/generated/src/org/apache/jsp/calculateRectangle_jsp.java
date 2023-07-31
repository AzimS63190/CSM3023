package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calculateRectangle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");

            String result = null;
            String width1 = request.getParameter("width1");
            String height1 = request.getParameter("height1");
            String width2 = request.getParameter("width2");
            String height2 = request.getParameter("height2");

            double a1 = Double.parseDouble(width1) * Double.parseDouble(height1);
            double a2 = Double.parseDouble(width2) * Double.parseDouble(height2);
            String area1 = String.format("%.2f", a1);
            String area2 = String.format("%.2f", a2);
            if (a1 > a2) {
                result = "The area of Rectangle 1 (" + area1 + ") is greater than Area of Rectangle 2 (" + area2 + ")";
            } else if (a1 < a2) {
                result = "The area of Rectangle 2 (" + area2 + ") is greater than Area of Rectangle 1 (" + area1 + ")";
            } else {
                result = "The area of Rectangle 1 & Rectangle2 are the same which is " + area1;
            }


        
      out.write("\n");
      out.write("        <fieldset>\n");
      out.write("            <legend><h1>Rectangle Area Comparison</h1></legend>\n");
      out.write("            <p>Area of Rectangle 1 : ");
      out.print(String.format("%s", area1));
      out.write("</p>\n");
      out.write("            <p>Area of Rectangle 2 : ");
      out.print(String.format("%s", area2));
      out.write("</p>\n");
      out.write("        </fieldset>\n");
      out.write("\n");
      out.write("        <p>");
      out.print(result);
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
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
