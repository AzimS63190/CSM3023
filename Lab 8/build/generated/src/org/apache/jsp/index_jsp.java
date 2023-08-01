package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" \n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>User Management Application</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Application MVC system for Employee Management</h1>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"EmployeeServlet?action=list\">All Employee List</a></li>\n");
      out.write("            <li><a href=\"EmployeeServlet?action=new\">Add a new Employee</a></li>\n");
      out.write("            <li><a href=\"EmployeeServlet?action=list\">Edit Employee</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <hr>\n");
      out.write("        <h1>List of Cars Prices System(<i>Lab Exercise</i>)</h1>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"CarServlet?action=list\">All Car Prices</a></li>\n");
      out.write("            <li><a href=\"CarServlet?action=new\">Add a new Car</a></li>\n");
      out.write("            <li><a href=\"#\" id=\"showLink\">Edit Car Information</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div id=\"myDiv\" style=\"display: none\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                // Show the div and load content from servlet when clicking the \"Show Div\" link\n");
      out.write("                $(\"#showLink\").click(function (event) {\n");
      out.write("                    event.preventDefault(); // Prevent the default link behavior\n");
      out.write("\n");
      out.write("                    // Make an AJAX request to fetch data from the servlet\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: \"CarServlet?action=indexList\", // Replace with the actual URL of your servlet\n");
      out.write("                        method: \"GET\",\n");
      out.write("                        success: function (response) {\n");
      out.write("                            // Update the content of the div with the data received from the servlet\n");
      out.write("                            $(\"#myDiv\").html(response);\n");
      out.write("\n");
      out.write("                            // Slide down the div\n");
      out.write("                            $(\"#myDiv\").slideToggle();\n");
      out.write("                        },\n");
      out.write("                        error: function () {\n");
      out.write("                            console.log(\"Error occurred while fetching data from servlet.\");\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                // Hide the div when clicking the \"Hide Div\" link\n");
      out.write("                $(\"#hideLink\").click(function (event) {\n");
      out.write("                    event.preventDefault(); // Prevent the default link behavior\n");
      out.write("\n");
      out.write("                    // Slide up the div\n");
      out.write("                    $(\"#myDiv\").sli();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
