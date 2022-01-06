package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class adminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Administrator\t</title>\n");
      out.write("        <!-- Bootstrap Styles-->\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- FontAwesome Styles-->\n");
      out.write("        <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Morris Chart Styles-->\n");
      out.write("        <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Custom Styles-->\n");
      out.write("        <link href=\"assets/css/custom-styles.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Google Fonts-->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <nav class=\"navbar navbar-default top-navbar\" role=\"navigation\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"http://localhost:8084/Hotel_Management/pages/adminHome.jsp\">Admin </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fa fa-user fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                            \n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <form action=\"../adminlogoutServlet\" method=\"post\">\n");
      out.write("                                <i class=\"fa fa-sign-out\" aria-hidden=\"true\" style=\"color: white; padding: 10px;\"></i>\n");
      out.write("                                <button type=\"submit\" id=\"book\" class=\"btn btn-amber\">\n");
      out.write("                                    logout\n");
      out.write("                                </button>  \n");
      out.write("                            </form>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- /.dropdown-user -->\n");
      out.write("                    </li>\n");
      out.write("                    <!-- /.dropdown -->\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <!--/. NAV TOP  -->\n");
      out.write("            <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("                <div class=\"sidebar-collapse\">\n");
      out.write("                    <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"active-menu\" href=\"http://localhost:8084/Hotel_Management/pages/adminHome.jsp\"><i class=\"fa fa-dashboard\"></i> Status</a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"http://localhost:8084/Hotel_Management/pages/adminHome.jsp\"><i class=\"fa fa-bar-chart-o\"></i> Room Booking</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"http://localhost:8084/Hotel_Management/pages/payment.jsp\"><i class=\"fa fa-qrcode\"></i> Payment</a>\n");
      out.write("                        </li>\n");
      out.write("                      <li> \n");
      out.write("                        <form action=\"../adminlogoutServlet\" method=\"post\">\n");
      out.write("                          <i class=\"fa fa-sign-out\" aria-hidden=\"true\" style=\"color: white; padding: 10px;\"></i>\n");
      out.write("                          <button type=\"submit\" id=\"book\" class=\"btn btn-amber\">\n");
      out.write("                              logout\n");
      out.write("                          </button>  \n");
      out.write("                        </form>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("            <!-- /. NAV SIDE  -->\n");
      out.write("            <div id=\"page-wrapper\">\n");
      out.write("                <div id=\"page-inner\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <h1 class=\"page-header\">\n");
      out.write("                                Status <small>Room Booking </small>\n");
      out.write("                            </h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /. ROW  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"panel panel-default\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <div class=\"panel-group\" id=\"accordion\">\n");
      out.write("\n");
      out.write("                                        <div class=\"panel panel-primary\">\n");
      out.write("                                            <div class=\"panel-heading\">\n");
      out.write("                                                <h4 class=\"panel-title\">\n");
      out.write("                                                    <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\">\n");
      out.write("                                                        <button class=\"btn btn-default\" type=\"button\">\n");
      out.write("                                                             Room Bookings  <span class=\"badge\"></span>\n");
      out.write("                                                        </button>\n");
      out.write("                                                    </a>\n");
      out.write("                                                </h4>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"collapseTwo\" class=\"panel-collapse in\" style=\"height: auto;\">\n");
      out.write("                                                <div class=\"panel-body\">\n");
      out.write("                                                    <div class=\"panel panel-default\">\n");
      out.write("                                           \n");
      out.write("                                                        <div class=\"panel-body\">\n");
      out.write("                                                            <div class=\"table-responsive\">\n");
      out.write("                                                                <form method=\"get\">\n");
      out.write("                                                                <table class=\"table\">\n");
      out.write("                                                                    <thead>\n");
      out.write("                                                                        <tr>\n");
      out.write("                                                                            <!--  <th>Name</th> -->\n");
      out.write("                                                                            <th>Email</th>\n");
      out.write("                                                                            <!--  <th>Country</th> -->\n");
      out.write("                                                                            <th>Room</th>\n");
      out.write("                                                                            <th>Bedding</th>\n");
      out.write("                                                                            <th>Meal</th>\n");
      out.write("                                                                            <th>Check In</th>\n");
      out.write("                                                                            <th>Check Out</th>\n");
      out.write("                                                                            <th>Status</th>\n");
      out.write("\n");
      out.write("                                                                        </tr>\n");
      out.write("                                                                    </thead>\n");
      out.write("                                                                    <tbody>\n");

    try
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
    Statement stmt=conn.createStatement();
    ResultSet rs=stmt.executeQuery("select * from reservation");
    while(rs.next())
    {
     
    
      out.write("\n");
      out.write("       <tr>\n");
      out.write("        <td>");
      out.print(rs.getString("email") );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("troom") );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("bed") );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("nroom") );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("meal") );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("cin") );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("cout") );
      out.write("</td>\n");
      out.write("        \n");
      out.write("    </tr>\n");
      out.write("          ");

     
    }
    
      out.write("\n");
      out.write("      \n");
      out.write("                                                                    </tbody>\n");
      out.write("                                                                </table>\n");
      out.write("        ");

        
        conn.close();
        }
    catch(Exception e)
    {
        e.printStackTrace();
        }
    
      out.write("\n");
      out.write("\n");
      out.write("                                                                </form>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <!-- End  Basic Table  --> \n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- /. PAGE INNER  -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /. PAGE WRAPPER  -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /. WRAPPER  -->\n");
      out.write("        <!-- JS Scripts-->\n");
      out.write("        <!-- jQuery Js -->\n");
      out.write("        <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("        <!-- Bootstrap Js -->\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Metis Menu Js -->\n");
      out.write("        <script src=\"assets/js/jquery.metisMenu.js\"></script>\n");
      out.write("        <!-- Morris Chart Js -->\n");
      out.write("        <script src=\"assets/js/morris/raphael-2.1.0.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/morris/morris.js\"></script>\n");
      out.write("        <!-- Custom Js -->\n");
      out.write("        <script src=\"assets/js/custom-scripts.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
