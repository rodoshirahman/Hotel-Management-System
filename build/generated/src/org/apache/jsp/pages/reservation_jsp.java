package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>RESERVATION SILVER MARINE HOTEL</title>\n");
      out.write("    <!-- Bootstrap Styles-->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- FontAwesome Styles-->\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Custom Styles-->\n");
      out.write("    <link href=\"assets/css/custom-styles.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- Google Fonts-->\n");
      out.write("   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

String email = null;
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies){
	if(cookie.getName().equals("email")) email= cookie.getValue();
}
}
if(email == null) response.sendRedirect("http://localhost:8084/Hotel_Management/pages/login.jsp");

      out.write("\n");
      out.write("         <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"http://localhost:8084/Hotel_Management/index.jsp\"><i class=\"fa fa-home\"></i> Homepage</a>\n");
      out.write("                    </li>\n");
      out.write("                     \n");
      out.write("                   <li>\n");
      out.write("                      <h4 class=\"text-center\" style=\"color: white;\"> Welcome </h4>\n");
      out.write("                      <h4 class=\"text-center\" style=\"color: white;\">");
      out.print(email);
      out.write("</h4>\n");
      out.write("                  </li>\n");
      out.write("                   <li> \n");
      out.write("                    <a href=\"http://localhost:8084/Hotel_Management/pages/user_profile.jsp\" style=\"color: white\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i>Profile</a> \n");
      out.write("                  </li>\n");
      out.write("                  <li> \n");
      out.write("                      <form action=\"../logoutServlet\" method=\"post\">\n");
      out.write("                          <i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i><input type=\"submit\" value=\"Logout\" >\n");
      out.write("                      </form>\n");
      out.write("<!--                    <a href=\"reservation.php?logout='1'\" style=\"color: white;\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i>Logout</a> -->\n");
      out.write("                 </li>\n");
      out.write("<!--              <?php endif ?>-->\n");
      out.write("                    \n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("       \n");
      out.write("        <div id=\"page-wrapper\" >\n");
      out.write("            <div id=\"page-inner\">\n");
      out.write("             <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <h1 class=\"page-header\">\n");
      out.write("                            RESERVATION <small></small>\n");
      out.write("                        </h1>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("                 \n");
      out.write("                               \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            RESERVATION INFORMATION\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <form method=\"post\" action=\"../reservationServlet\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                     <label>User Email*</label>\n");
      out.write("                                     <input name=\"email\" type=\"text\" value=\"");
      out.print(email);
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                                        \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                            <label>Type Of Room *</label>\n");
      out.write("                                            <select name=\"troom\"  class=\"form-control\" required>\n");
      out.write("                                                <option value selected ></option>\n");
      out.write("                                                <option value=\"Superior Room\">SUPERIOR ROOM</option>\n");
      out.write("                                                <option value=\"Deluxe Room\">DELUXE ROOM</option>\n");
      out.write("                                                <option value=\"Guest House\">GUEST HOUSE</option>\n");
      out.write("                                                <option value=\"Single Room\">SINGLE ROOM</option>\n");
      out.write("                                            </select>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                            <label>Bedding Type</label>\n");
      out.write("                                            <select name=\"bed\" class=\"form-control\" required>\n");
      out.write("                                                <option value selected ></option>\n");
      out.write("                                                <option value=\"Single\">Single</option>\n");
      out.write("                                                <option value=\"Double\">Double</option>\n");
      out.write("                                                <option value=\"Triple\">Triple</option>\n");
      out.write("                                                <option value=\"Quad\">Quad</option>\n");
      out.write("                                                <option value=\"None\">None</option>\n");
      out.write("                                                \n");
      out.write("                                             \n");
      out.write("                                            </select>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                            <label>No.of Rooms *</label>\n");
      out.write("                                            <select name=\"nroom\" class=\"form-control\" required>\n");
      out.write("                                                <option value selected ></option>\n");
      out.write("                                                <option value=\"1\">1</option>\n");
      out.write("                                                <option value=\"2\">2</option>\n");
      out.write("                                                <option value=\"3\">3</option>\n");
      out.write("                                                <option value=\"4\">4</option>\n");
      out.write("                                                <option value=\"5\">5</option>\n");
      out.write("                                                <option value=\"6\">6</option>\n");
      out.write("                                                <option value=\"7\">7</option> \n");
      out.write("                                            </select>\n");
      out.write("                              </div>\n");
      out.write("                             \n");
      out.write("                             \n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                            <label>Meal Plan</label>\n");
      out.write("                                            <select name=\"meal\" class=\"form-control\"required>\n");
      out.write("                                                <option value selected ></option>\n");
      out.write("                                                <option value=\"Room only\">Room only</option>\n");
      out.write("                                                <option value=\"Breakfast\">Breakfast</option>\n");
      out.write("                                                <option value=\"Half Board\">Half Board</option>\n");
      out.write("                                                <option value=\"Full Board\">Full Board</option>\n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                             \n");
      out.write("                                            </select>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                            <label>Check-In</label>\n");
      out.write("                                            <input name=\"cin\" type =\"date\" class=\"form-control\">\n");
      out.write("                                            \n");
      out.write("                               </div>\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                            <label>Check-Out</label>\n");
      out.write("                                            <input name=\"cout\" type =\"date\" class=\"form-control\">\n");
      out.write("                                            \n");
      out.write("                               </div>\n");
      out.write("                               <div>\n");
      out.write("                                   <button type=\"submit\" class=\"btn\" name=\"reserve\">Submit</button>\n");
      out.write("                               </div>\n");
      out.write("                       </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("            \n");
      out.write("                \n");
      out.write("                    </div>\n");
      out.write("             <!-- /. PAGE INNER  -->\n");
      out.write("<!--            </div>-->\n");
      out.write("         <!-- /. PAGE WRAPPER  -->\n");
      out.write("\n");
      out.write("     <!-- /. WRAPPER  -->\n");
      out.write("    <!-- JS Scripts-->\n");
      out.write("    <!-- jQuery Js -->\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("      <!-- Bootstrap Js -->\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Metis Menu Js -->\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\n");
      out.write("      <!-- Custom Js -->\n");
      out.write("    <script src=\"assets/js/custom-scripts.js\"></script>\n");
      out.write("    \n");
      out.write("       \n");
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
