package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class processInsuranceQuo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Final Insurance Quotation</title>\n");
      out.write("        <style>\n");
      out.write("            p{\n");
      out.write("                color: #7F00FF;\n");
      out.write("                font-size: 1.25em;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <fieldset>\n");
      out.write("            <legend><b>Details of Insurance Quotation</b></legend>\n");
      out.write("            ");

                String ic = request.getParameter("icNo");
                String cName = request.getParameter("name");
                int mPrice = Integer.parseInt(request.getParameter("marketPrice"));
                String coverage = request.getParameter("covType");
                String ncd = request.getParameter("ncd");
                double insuranceAmt = 0.0;
                String covDesc = "";
                if (coverage.equals("1")) {
      out.write("\n");
      out.write("            ");

                       covDesc = "Third Party";
                       if (ncd.equals("10%")) {
      out.write("\n");
      out.write("            ");
insuranceAmt = 0.033 * mPrice;
                    } else if (ncd.equals("25%")) {
      out.write("\n");
      out.write("            ");
insuranceAmt = 0.025 * mPrice;
                    } else if (ncd.equals("35%")) {
      out.write("\n");
      out.write("            ");
insuranceAmt = 0.018 * mPrice;
                    } else if (ncd.equals("55%")) {
      out.write("\n");
      out.write("            ");
insuranceAmt = 0.012 * mPrice;
                        }
                    } else if (coverage.equals("2")) {
      out.write("\n");
      out.write("            ");

                covDesc = "Comprehensive";
                if (ncd.equals("10%")) {
      out.write("\n");
      out.write("            ");
insuranceAmt = 0.038 * mPrice;
                    } else if (ncd.equals("25%")) {
      out.write("\n");
      out.write("            ");
insuranceAmt = 0.030 * mPrice;
                    } else if (ncd.equals("35%")) {
      out.write("\n");
      out.write("            ");
insuranceAmt = 0.024 * mPrice;
                    } else if (ncd.equals("55%")) {
      out.write("\n");
      out.write("            ");
insuranceAmt = 0.018 * mPrice;
                            }
                        }
      out.write("  \n");
      out.write("            <p>IC No: ");
      out.print(ic);
      out.write("</p><br>\n");
      out.write("            <p>Customer Name: ");
      out.print(cName);
      out.write("</p><br>\n");
      out.write("            <p>Market Price: ");
      out.print(mPrice);
      out.write("</p><br>\n");
      out.write("            <p>Coverage type: ");
      out.print(covDesc);
      out.write("</p><br>\n");
      out.write("            <p>No claim discount (NCD) = ");
      out.print(ncd);
      out.write("</p><br>\n");
      out.write("            <p>Insurance amount: ");
      out.print(String.format("%.2f", insuranceAmt));
      out.write("</p><br>\n");
      out.write("            <p>6% GST : ");
      out.print(String.format("%.2f", insuranceAmt * 0.06));
      out.write("</p><br>\n");
      out.write("            <p>Final amount (with 6% GST): ");
      out.print(String.format("%.2f", insuranceAmt * 1.06));
      out.write("</p><br>\n");
      out.write("        </fieldset>\n");
      out.write("\n");
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
