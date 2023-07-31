package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class processCalculateCarLoan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Car Loan Calculation</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Perform Car Loan Calculation</h1>\n");
      out.write("\n");
      out.write("        <fieldset>\n");
      out.write("            ");

                //Define variables...
                String loanamount = null;
                String str_period = null;
                double result = 0;

                //Use request.getParameter() method to retrieve data from main's form...
                loanamount = request.getParameter("loan_amount");
                str_period = request.getParameter("period");
                int period = Integer.parseInt(str_period);

                switch (period) {
                    case 3:
                        result = Integer.parseInt(loanamount) + (Integer.parseInt(loanamount) * 0.028 * period);
                        break;
                    case 4:
                        result = Integer.parseInt(loanamount) + (Integer.parseInt(loanamount) * 0.028 * period);
                        break;
                    case 5:
                        result = Integer.parseInt(loanamount) + (Integer.parseInt(loanamount) * 0.028 * period);
                        break;
                    case 7:
                        result = Integer.parseInt(loanamount) + (Integer.parseInt(loanamount) * 0.045 * period);
                        break;
                }
                String total = String.format("%.2f", result);
            
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Display the output... -->\n");
      out.write("            <h1 style=\"color:blue\">Details of car loan:</h1>\n");
      out.write("            <p>Loan Request : ");
      out.print(loanamount);
      out.write("</p>\n");
      out.write("            <p>Period of payment : ");
      out.print(period);
      out.write("</p>\n");
      out.write("            <p>Total Loan (+ interest) : ");
      out.print(total);
      out.write("</p>\n");
      out.write("        </fieldset>\n");
      out.write("\n");
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
