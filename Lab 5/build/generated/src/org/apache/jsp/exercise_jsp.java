package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import lab5.com.Ex2;

public final class exercise_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  public String getServletInfo() {
    return "Process Exercise2";
  }

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatNumber_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.release();
    _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page Exercise 2</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            div {\n");
      out.write("                font-family: Comic Sans MS, Comic Sans, cursive;\n");
      out.write("                color: #CC0066;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Ex2 data = new Ex2();
            data.setStock(800);
            data.setUnitPrice(10.50);
            data.setCommission(0.05);

            double amount = data.getStock() * data.getUnitPrice();

            double sBroker = data.getCommission() * amount;

            double total = amount + sBroker;
        
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Exercise 2</h1>\n");
      out.write("        <p>The shares of stock : ");
      out.print(data.getStock());
      out.write("</p>\n");
      out.write("        <p>The price per share : \n");
      out.write("            ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_0.setParent(null);
      _jspx_th_fmt_formatNumber_0.setType("currency");
      _jspx_th_fmt_formatNumber_0.setCurrencyCode("MYR");
      _jspx_th_fmt_formatNumber_0.setValue(data.getUnitPrice());
      int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
      if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_0);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      out.write("</p>\n");
      out.write("        <p>The stock broker commission :  \n");
      out.write("            ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_1.setParent(null);
      _jspx_th_fmt_formatNumber_1.setType("percent");
      _jspx_th_fmt_formatNumber_1.setValue(data.getCommission());
      int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
      if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_1);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      out.write("</p>\n");
      out.write("        <br/>\n");
      out.write("        <div>\n");
      out.write("            <p>The amount paid for the stock alone without the commission :\n");
      out.write("                ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_2.setParent(null);
      _jspx_th_fmt_formatNumber_2.setType("currency");
      _jspx_th_fmt_formatNumber_2.setCurrencyCode("MYR");
      _jspx_th_fmt_formatNumber_2.setValue(amount);
      int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
      if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_2);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      out.write("</p>\n");
      out.write("            <p>The amount of the commission : \n");
      out.write("                ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_3.setParent(null);
      _jspx_th_fmt_formatNumber_3.setType("currency");
      _jspx_th_fmt_formatNumber_3.setCurrencyCode("MYR");
      _jspx_th_fmt_formatNumber_3.setValue(sBroker);
      int _jspx_eval_fmt_formatNumber_3 = _jspx_th_fmt_formatNumber_3.doStartTag();
      if (_jspx_th_fmt_formatNumber_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_3);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_3);
      out.write("</p>\n");
      out.write("            <p>The total amount paid (for the stock plus the commission) : \n");
      out.write("                ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_4.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_4.setParent(null);
      _jspx_th_fmt_formatNumber_4.setType("currency");
      _jspx_th_fmt_formatNumber_4.setCurrencyCode("MYR");
      _jspx_th_fmt_formatNumber_4.setValue(total);
      int _jspx_eval_fmt_formatNumber_4 = _jspx_th_fmt_formatNumber_4.doStartTag();
      if (_jspx_th_fmt_formatNumber_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_4);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_type_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_4);
      out.write("</p>\n");
      out.write("        </div>\n");
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
