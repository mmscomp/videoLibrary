/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-10-30 16:26:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Yahoo!!</title>\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".container {\n");
      out.write("    padding-right: 15px;\n");
      out.write("    padding-left: 15px;\n");
      out.write("    margin-right: auto;\n");
      out.write("    margin-left: auto;\n");
      out.write("    max-width: 1150px;\n");
      out.write("}\n");
      out.write(".diary{\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write(".diary-primary{\n");
      out.write("    background-color: #594a42;\n");
      out.write("    color: #fff;\n");
      out.write("    padding-top: 25px;\n");
      out.write("    padding-bottom: 160px;\n");
      out.write("}\n");
      out.write(".diary-primary.bg-image > img{\n");
      out.write("    opacity: 0.50;\n");
      out.write("}\n");
      out.write("h1.signUp {\n");
      out.write("    margin-top: -20px;\n");
      out.write("    float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1.signUp:hover {\n");
      out.write("   background-color: green;\n");
      out.write("   cursor: crosshair;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bg-image{\n");
      out.write("    position: relative;\n");
      out.write("    overflow: hidden;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write(".bg-image > img {\n");
      out.write("    position: absolute;\n");
      out.write("    top: -9999px;\n");
      out.write("    left: -9999px;\n");
      out.write("    bottom: -9999px;\n");
      out.write("    right: -9999px;\n");
      out.write("    margin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer{\n");
      out.write("    position: relative;\n");
      out.write("    bottom: -290px;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 60px;\n");
      out.write("    background-color: #52EF49;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!--  <h1>My First JSP!!!</h1>-->\n");
      out.write("\t<!--  <h3>My user name is ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" and passwd is </h3>-->\n");
      out.write("\n");
      out.write("\t<nav class=\"navbar navbar-default\">\n");
      out.write("\n");
      out.write("<!--  \t\t<a href=\"/\" class=\"navbar-brand\">Brand</a>\n");
      out.write("\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("\t\t\t<li><a href=\"/todo.do\">Todos</a></li>\n");
      out.write("\t\t\t<li><a href=\"http://www.yahoo.com\">Yahoo</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("-->\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t<li><a href=\"/log\">Login</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\n");
      out.write("\t</nav>\n");
      out.write("\t<section class= \"diary diary-primary bg-image\">\n");
      out.write("\t <!-- <img src=\"C:\\Users\\ARIGAP\\Desktop\\VS\\images\\thinking-girl.jpg\" alt=\"NOT FOUND\">-->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t<div class=\"title\"><h1> Here you are </h1> </div>\n");
      out.write("\t<div class=\"sub-title\"> <h3>to record your today's experience</h3></div>\n");
      out.write("\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<section>\n");
      out.write("\t<!--  <div class=\"container\">-->\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t<font color=red>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font>\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<form action=\"/log/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${genre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/verify\" method=POST>\n");
      out.write("\t\t\tUser name: <input name=name type=text /> Password:<input\n");
      out.write("\t\t\t\tname=password type=password><input type=submit value=\"Login\" />\n");
      out.write("\t\t\t\t<a href=\"/log/reset\">Reset your user name and password</a>\t\t\n");
      out.write("\t\t\t    <h1 class=\"signUp\"><a href=\"/log/register\">Sign Up</a></h1>\n");
      out.write("\t\t</form>\n");
      out.write("\t\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("\t<footer class=\"footer\">\n");
      out.write("\t\t<div>About U</div>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("\t<script src=\"webjars/jquery/1.9.1/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
