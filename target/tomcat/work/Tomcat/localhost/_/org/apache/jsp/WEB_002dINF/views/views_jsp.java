/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-10-29 02:21:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class views_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<title>Movies Yahoo!!</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".container {\r\n");
      out.write("    padding-right: 15px;\r\n");
      out.write("    padding-left: 15px;\r\n");
      out.write("    margin-right: auto;\r\n");
      out.write("    margin-left: auto;\r\n");
      out.write("    max-width: 1150px;\r\n");
      out.write("}\r\n");
      out.write(".view{\r\n");
      out.write("    text-align: left;\r\n");
      out.write("}\r\n");
      out.write(".view-primary{\r\n");
      out.write("    background-color: #dcb;<!--#594a42;-->\r\n");
      out.write("    color: red;\r\n");
      out.write("    padding-top: 25px;\r\n");
      out.write("    padding-bottom: 160px;\r\n");
      out.write("}\r\n");
      out.write(".view-primary.bg-image > img{\r\n");
      out.write("    opacity: 0.4;\r\n");
      out.write("}\r\n");
      out.write(".bg-image{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write(".bg-image > img {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: -9999px;\r\n");
      out.write("    left: -9999px;\r\n");
      out.write("    bottom: -9999px;\r\n");
      out.write("    right: -9999px;\r\n");
      out.write("    margin: auto;\r\n");
      out.write("}\r\n");
      out.write("h1 > span {\r\n");
      out.write("background-color: red;\r\n");
      out.write("text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".title>h1{\r\n");
      out.write("color: white;\r\n");
      out.write("text-align: center;\r\n");
      out.write("}\r\n");
      out.write("h2{\r\n");
      out.write("color: black;\r\n");
      out.write("}\r\n");
      out.write("a{\r\n");
      out.write("color: solid black;\r\n");
      out.write("font-size: 30pt;\r\n");
      out.write("text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fa-phone:before {\r\n");
      out.write("   content: \"\\f095\";\r\n");
      out.write("}\r\n");
      out.write(".fa-github-square:before {\r\n");
      out.write("   content: \"\\f092\";\r\n");
      out.write("}\r\n");
      out.write(".fa-linkedin:before {\r\n");
      out.write("   content: \"\\f0e1\";\r\n");
      out.write("}\r\n");
      out.write(".fa-linkedin-square:before {\r\n");
      out.write("  content: \"\\f08c\";\r\n");
      out.write("}\r\n");
      out.write("/*.footer{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    width: 80%;\r\n");
      out.write("    height: 60px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    background-color: #52EF49;\r\n");
      out.write("}*/\r\n");
      out.write("\r\n");
      out.write("footer {\r\n");
      out.write("    margin-top: 5px;\r\n");
      out.write("    border-top: 1px solid #E0E0E0;\r\n");
      out.write("    margin-left: 90px;\r\n");
      out.write("    margin-right: auto;\r\n");
      out.write("    padding: 1em;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer li {\r\n");
      out.write("   display: flex;\r\n");
      out.write("   margin: 0 1.0em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer a {\r\n");
      out.write("   text-decoration: none;\r\n");
      out.write("   color: #321;\r\n");
      out.write(" /*  padding: 1.5em; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--  <h1>My First JSP!!!</h1>-->\r\n");
      out.write("\t<!--  <h3>My user name is ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" and passwd is </h3>-->\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\r\n");
      out.write("<!--  \t\t<a href=\"/\" class=\"navbar-brand\">Brand</a>\r\n");
      out.write("\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/todo.do\">Todos</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"http://www.yahoo.com\">Yahoo</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t<li><a href=\"#\">Login</a></li>\r\n");
      out.write("\t\t</ul>-->\r\n");
      out.write("\t<a href=\"/movie/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${genre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">Go Back</a>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t\t<section>\r\n");
      out.write("\t<!--  <div class=\"container\">-->\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<font color=red>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<!--<form action=\"#\" method=POST>\r\n");
      out.write("\t\t\tUser name: <input name=name type=text /> Password:<input\r\n");
      out.write("\t\t\t\tname=password type=password><input type=submit value=\"Login\" />\r\n");
      out.write("\t\t\t\t<a href=\"#\">Reset your user name and password</a>\t\t\r\n");
      out.write("\t\t\t    <h1 class=\"signUp\"><a href=\"#\">Sign Up</a></h1>\r\n");
      out.write("   <a href = \"/movie/action/add/\">Add Movie</a> \t-->\r\n");
      out.write("  </section>\r\n");
      out.write("\t\r\n");
      out.write("\t<section class= \"view view-primary bg-image\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t<div class=\"title\"><h1><span> MOVIE Review for \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" </span></h1> </div>\r\n");
      out.write("\t<div class=\"sub-title\"> <h2>Read reviews</h2></div>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t   <li><a href=\"#\">Contact me<i class=\"fa fa-phone\"></i></a></li>\r\n");
      out.write("\t\t   <li><a href=\"#\">Follow me<i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\t\t   <li><a href=\"#\">Find me<i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("\t\t   <li><a href=\"#\">Hangout with me<i class=\"fa fa-plus\"></i></a></li>\r\n");
      out.write("\t\t   <li><a href=\"#\">Link me<i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("\t\t   <li><a href=\"/www.github.com/mmscomp\">Github<i class=\"fa fa-github\"></i></a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"webjars/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/views.jsp(146,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/views.jsp(146,1) '${reviewList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reviewList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/views.jsp(146,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("review");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t         <h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${review.movieId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h2>\r\n");
          out.write("\t    <br>  \r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
