package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>SILVER MARINE ADMIN</title>\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/style.css\">  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div id=\"clouds\">\n");
      out.write("\t<div class=\"cloud x1\"></div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"cloud x2\"></div>\n");
      out.write("\t<div class=\"cloud x3\"></div>\n");
      out.write("\t<div class=\"cloud x4\"></div>\n");
      out.write("\t<div class=\"cloud x5\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div id=\"login\">\n");
      out.write("\n");
      out.write("          <form method=\"post\" action=\"../adminLoginServlet\">\n");
      out.write("\n");
      out.write("          <fieldset class=\"clearfix\">\n");
      out.write("\n");
      out.write("            <p><span class=\"fontawesome-user\"></span><input type=\"text\"  name=\"user\" value=\"Username\" onBlur=\"if(this.value == '') this.value = 'Username'\" onFocus=\"if(this.value == 'Username') this.value = ''\" required></p> <!-- JS because of IE support; better: placeholder=\"Username\" -->\n");
      out.write("            <p><span class=\"fontawesome-lock\"></span><input type=\"password\" name=\"pass\"  value=\"Password\" onBlur=\"if(this.value == '') this.value = 'Password'\" onFocus=\"if(this.value == 'Password') this.value = ''\" required></p> <!-- JS because of IE support; better: placeholder=\"Password\" -->\n");
      out.write("            <p><input type=\"submit\" name=\"sub\"  value=\"Login\"></p>\n");
      out.write("\n");
      out.write("          </fieldset>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("      </div> <!-- end login -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("   <!--  <div class=\"bottom\">  <h3><a href=\"../index.php\"> HOMEPAGE</a></h3></div>\n");
      out.write("   -->\n");
      out.write("  \n");
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
