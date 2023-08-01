package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import lab6.com.Database;
import lab6.com.Marathon;
import lab6.com.MarathonDAO;

public final class processMarathon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      lab6.com.Marathon myMarathon = null;
      synchronized (request) {
        myMarathon = (lab6.com.Marathon) _jspx_page_context.getAttribute("myMarathon", PageContext.REQUEST_SCOPE);
        if (myMarathon == null){
          myMarathon = new lab6.com.Marathon();
          _jspx_page_context.setAttribute("myMarathon", myMarathon, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            int result;

            //Step 1: Create Database Object...
            Database myDB = new Database();

            MarathonDAO object1 = new MarathonDAO();

            //Step 2: Add the records...
            result = object1.addDetails(myMarathon);

            //Step 3: Determine whether the transaction is success...
            if (result > 0) {
                System.out.println("\tRecord sucessfully added into Marathon's table...!");
                out.print("<p>" + "Record with IC No " + myMarathon.getIcno()
                        + " successfully created...!" + "</p>");
                out.print("<p>" + "Details of record are; " + "</p>");
                out.print("<p>Student ID : " + myMarathon.getIcno() + "</p>");
                out.print("<p>Name       : " + myMarathon.getName() + "</p>");
                out.print("<p>Program    : " + myMarathon.getCategory() + "</p>");
            }

            //Step 4: Close database connection...!
            System.out.println("Step 5: Close database connection...!");
            myDB.closeConnection();
            System.out.println(" ");
            System.out.println("Database connection is closed...!");
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
