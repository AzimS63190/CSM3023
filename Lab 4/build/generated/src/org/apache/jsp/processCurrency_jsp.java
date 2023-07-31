package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class processCurrency_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            final double USD = 3.92;
            final double STG = 5.96;
            final double EURO = 4.47;
            //Define method to perform currency exchange....

            private double calculateRate(String currency, int amount) {
                double currencyChange = 0.00f;

                if (currency.equals("1")) {
                    currencyChange = (double) (amount / USD);
                }
                if (currency.equals("2")) {
                    currencyChange = (double) (amount / STG);
                }
                if (currency.equals("3")) {
                    currencyChange = (double) (amount / EURO);
                }

                return currencyChange; //return the result...
            }
        
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Process Currency Conversion</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Dongle\">\n");
      out.write("        <style>\n");
      out.write("            p{\n");
      out.write("                color: #7F00FF;\n");
      out.write("                font-family: \"Dongle\", sans-serif;\n");
      out.write("                font-size: 2.5em;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Use JSP Declaration tag, JSP Scriplet and JSP Expression in application</h1><br>\n");
      out.write("\n");
      out.write("        ");

            String code = request.getParameter("currency");
            int amt = Integer.parseInt(request.getParameter("amount"));

            String currName = " ";
            if (code.equals("1")) {
                currName = "Amount in USD is " + String.format("%.2f", calculateRate(code, amt)) + " USD";
            }
            if (code.equals("2")) {
                currName = "Amount in STG is " + String.format("%.2f", calculateRate(code, amt)) + " Sterling";
            }
            if (code.equals("3")) {
                currName = "Amount in EURO is " + String.format("%.2f", calculateRate(code, amt)) + " Euro";
            }

        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <p>Amount in Ringgit Malaysia is RM");
      out.print(amt);
      out.write("</p>\n");
      out.write("        <p>");
      out.print(currName);
      out.write("</p>\n");
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
