package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("      <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>SILVER MARINE HOTEL</title>\n");
      out.write("\t<!-- Bootstrap Styles-->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- FontAwesome Styles-->\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- Morris Chart Styles-->\n");
      out.write("   \n");
      out.write("        <!-- Custom Styles-->\n");
      out.write("    <link href=\"assets/css/custom-styles.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- Google Fonts-->\n");
      out.write("   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("     <!-- TABLE STYLES-->\n");
      out.write("    <link href=\"assets/js/dataTables/dataTables.bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-default top-navbar\" role=\"navigation\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"home.php\"><?php echo $_SESSION[\"user\"]; ?> </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" aria-expanded=\"false\">\n");
      out.write("                        <i class=\"fa fa-user fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                        <li><a href=\"usersetting.php\"><i class=\"fa fa-user fa-fw\"></i> User Profile</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"settings.php\"><i class=\"fa fa-gear fa-fw\"></i> Settings</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"logout.php\"><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- /.dropdown-user -->\n");
      out.write("                </li>\n");
      out.write("                <!-- /.dropdown -->\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <!--/. NAV TOP  -->\n");
      out.write("        <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"home.php\"><i class=\"fa fa-dashboard\"></i> Status</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a  href=\"messages.php\"><i class=\"fa fa-desktop\"></i> News Letters</a>\n");
      out.write("                    </li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("                        <a href=\"roombook.php\"><i class=\"fa fa-bar-chart-o\"></i>Room Booking</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"active-menu\" href=\"payment.php\"><i class=\"fa fa-qrcode\"></i> Payment</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a  href=\"profit.php\"><i class=\"fa fa-qrcode\"></i> Profit</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"logout.php\" ><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        <!-- /. NAV SIDE  -->\n");
      out.write("        <div id=\"page-wrapper\" >\n");
      out.write("            <div id=\"page-inner\">\n");
      out.write("\t\t\t <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <h1 class=\"page-header\">\n");
      out.write("                           Payment Details<small> </small>\n");
      out.write("                        </h1>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("                 <!-- /. ROW  -->\n");
      out.write("\t\t\t\t \n");
      out.write("\t\t\t\t \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Room type</th>\n");
      out.write("                                            <th>Bed Type</th>\n");
      out.write("                                            <th>Check in</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Check out</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>No of Room</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Meal Type</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                            <th>Room Rent</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Bed Rent</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Meals </th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Gr.Total</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Print</th>\n");
      out.write("                                            \n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t\t\t\t\t<?php\n");
      out.write("\t\t\t\t\t\t\t\t\t\tinclude ('db.php');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$sql=\"select * from payment\";\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$re = mysqli_query($con,$sql);\n");
      out.write("\t\t\t\t\t\t\t\t\t\twhile($row = mysqli_fetch_array($re))\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$id = $row['id'];\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif($id % 2 ==1 )\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\techo\"<tr class='gradeC'>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['fname'].\" \".$row['lname'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['troom'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['tbed'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['cin'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['cout'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['nroom'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['meal'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['ttot'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['mepr'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['btot'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['fintot'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=print.php?pid=\".$id .\" <button class='btn btn-primary'> <i class='fa fa-print' ></i> Print</button></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\";\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\telse\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\techo\"<tr class='gradeU'>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['fname'].\" \".$row['lname'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['troom'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['tbed'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['cin'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['cout'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['nroom'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['meal'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['ttot'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['mepr'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['btot'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\".$row['fintot'].\"</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=print.php?pid=\".$id .\" <button class='btn btn-primary'> <i class='fa fa-print' ></i> Print</button></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\";\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t?>\n");
      out.write("                                        \n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                <!-- /. ROW  -->\n");
      out.write("            \n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("               \n");
      out.write("    </div>\n");
      out.write("             <!-- /. PAGE INNER  -->\n");
      out.write("            </div>\n");
      out.write("         <!-- /. PAGE WRAPPER  -->\n");
      out.write("     <!-- /. WRAPPER  -->\n");
      out.write("    <!-- JS Scripts-->\n");
      out.write("    <!-- jQuery Js -->\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("      <!-- Bootstrap Js -->\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Metis Menu Js -->\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\n");
      out.write("     <!-- DATA TABLE SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/dataTables/jquery.dataTables.js\"></script>\n");
      out.write("    <script src=\"assets/js/dataTables/dataTables.bootstrap.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#dataTables-example').dataTable();\n");
      out.write("            });\n");
      out.write("    </script>\n");
      out.write("         <!-- Custom Js -->\n");
      out.write("    <script src=\"assets/js/custom-scripts.js\"></script>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</body>\n");
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
