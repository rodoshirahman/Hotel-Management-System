package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registration system</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/file.css\">\n");
      out.write("    </head>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <h2>Register</h2>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <form method=\"post\" action=\"register\">\n");
      out.write("\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <label class=\"input-group\">Title*</label>\n");
      out.write("            <select name=\"title\" class=\"form-control\" required style=\"width: 95%;height: 20px;font-size: 16px;border-radius: 5px;border: 1px solid gray;\">\n");
      out.write("                <option value selected ></option>\n");
      out.write("                <option value=\"Dr.\">Dr.</option>\n");
      out.write("                <option value=\"Miss.\">Miss.</option>\n");
      out.write("                <option value=\"Mr.\">Mr.</option>\n");
      out.write("                <option value=\"Mrs.\">Mrs.</option>\n");
      out.write("                <option value=\"Prof.\">Prof.</option>\n");
      out.write("                <option value=\"Rev .\">Rev .</option>\n");
      out.write("                <option value=\"Rev . Fr\">Rev . Fr .</option>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <label>First Name</label>\n");
      out.write("            <input name=\"fname\" class=\"form-control\" required>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <label>Last Name</label>\n");
      out.write("            <input name=\"lname\" class=\"form-control\" required>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <label>Email</label>\n");
      out.write("            <input name=\"email\" type=\"email\" class=\"form-control\" required>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-group radio-inline\">\n");
      out.write("            <label>Nationality*</label>\n");
      out.write("            <label class=\"radio-inline\">\n");
      out.write("                <input type=\"radio\" name=\"nation\"  value=\"Bangladeshi\" checked=\"\">Bangladeshi\n");
      out.write("            </label>\n");
      out.write("            <label class=\"radio-inline\">\n");
      out.write("                <input type=\"radio\" name=\"nation\"  value=\"Non Bangladeshi \">Non Bangladeshi\n");
      out.write("            </label>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <label>Passport Country</label>\n");
      out.write("            <input name=\"country\" class=\"form-control\" required >\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <label>Phone Number</label>\n");
      out.write("            <input name=\"phone\" type =\"text\" class=\"form-control\" required>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <label>Password</label>\n");
      out.write("            <input type=\"password\" name=\"password_1\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <label>Confirm password</label>\n");
      out.write("            <input type=\"password\" name=\"password_2\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <button type=\"submit\" class=\"btn\" name=\"register\">Register</button>\n");
      out.write("        </div>\n");
      out.write("        <p>\n");
      out.write("            Already a member? <a href=\"login.php\">Sign in</a>\n");
      out.write("        </p>\n");
      out.write("    </form>\n");
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
