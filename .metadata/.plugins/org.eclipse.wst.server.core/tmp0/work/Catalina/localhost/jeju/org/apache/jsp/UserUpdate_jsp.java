/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-05-04 09:09:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jeju.userDB;
import jeju.userVO;

public final class UserUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("jeju.userDB");
    _jspx_imports_classes.add("jeju.userVO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");

    userDB db = new userDB();  /* ????????????????????? ??? ?????? */
    String id = (String)session.getAttribute("id"); /* id???????????? ????????? ????????????  */

    userVO bag = db.read(id); /* read????????? ??????  */
    
    
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>???????????? ?????? ??? ??????</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t\t\t<header><!-- HTML ???????????? ??? ????????? header ????????? ????????? ?????? -->\r\n");
      out.write("\t\t\t<nav id = \"logo\">\t<!-- HTML ??????????????? ????????? nav ????????? ??????, id??? logo ??? ???????????? style.css?????? logo??? ????????? style??? ????????????  -->\r\n");
      out.write("\t\t\t\t<a href=\"MainPage.jsp\"> <!-- ????????? ????????? ?????????????????? ?????? ????????? ?????? a ?????? ?????? -->\r\n");
      out.write("\t\t\t\t\t<img src=\"pictures/MainLogo.png\" width=\"80\" height=\"80\">\t<!-- 80x80?????? ????????? ????????? ???????????? ????????? -->\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</nav> <!-- ?????? ???????????? ?????? -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<nav id = \"menu\" ><!-- menu?????? id??? ?????? ??????????????? ?????? -->\r\n");
      out.write("\t\t\t\t<table>\t<!-- ????????? ?????? -->\r\n");
      out.write("\t\t\t\t\t<tr>\t<!-- ???????????? ????????? ?????? -->\r\n");
      out.write("\t\t\t\t\t\t<th colspan=\"4\" style=\"text-align: right; height: 41px\"> <!-- 4?????? ???????????? ????????? ??????, ????????? 41px??? ????????? ?????? ?????? -->\r\n");
      out.write("\t\t\t\t\t\t\t");
 if( id == null) { 
      out.write(" <!-- ????????? ????????? ???????????? ?????? ?????? ?????? ??? ?????? ????????? ?????? -->\r\n");
      out.write("\t\t\t\t\t\t\t\t???????????? ????????????.\r\n");
      out.write("\t\t\t\t\t\t\t");
 } else { 
      out.write("\t<!-- ???????????? ????????? ?????? ?????? ?????? ?????? -->\r\n");
      out.write("\t\t\t\t\t\t\t    ");
      out.print( id );
      out.write("??? ???????????????.<a href=\"Logout.jsp\">????????????</a>\t<!-- ???????????? ???????????? ???????????? ?????? -->\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</th><!-- ????????? ?????? ?????? -->\r\n");
      out.write("\t\t\t\t\t</tr><!-- ???????????? ????????? ?????? -->\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><!-- ????????? ????????? ?????? ?????? -->\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"MainPage.jsp\">???????????????</a>\t<!-- ????????? ????????? ??????????????? ?????? ???????????? ???????????? ????????? ?????? ??????????????? ?????????????????? ??? -->\r\n");
      out.write("\t\t\t\t\t\t</td><!-- ????????? ????????? ?????? -->\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"MyPage.jsp\">???????????????</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"ServiceMain.jsp\">????????????</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t");
 if( id == null) {	
      out.write(" <!-- ????????? ????????? ???????????? ?????? ???????????? ???????????? ??????????????? ????????????????????? ???????????? ??????????????? ?????? -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"Login.jsp\">?????????</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
} else {
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"UserUpdate.jsp\">?????? ??????</a>  <!-- ????????? ?????????(????????? ?????? ???) ??????????????? ?????? ?????????????????? ????????? update.jsp??? ???????????? ?????? -->\r\n");
      out.write("\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table> <!-- ????????? ?????? -->\r\n");
      out.write("\t\t\t</nav><!-- menu ???????????? ?????? -->\r\n");
      out.write("\t\t</header> <!-- ?????? ???????????? ?????? -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<nav id=\"Content\" style=\"text-align: center;\" > <!-- ??? ???????????? ????????? ?????? ???????????? ?????? -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<b><font size = \"7em\" color = \"black\" >\r\n");
      out.write("\t\t\t\t???????????? ?????? ??? ??????\r\n");
      out.write("\t\t\t</font></b> <br>\r\n");
      out.write("\t\t\t<hr style = \"border : solid 3px white;'\">\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<form action = \"UserUpdate2.jsp\">\r\n");
      out.write("\t\t\t\t<!-- <b><font size = \"4em\" color = \"black\" > -->\r\n");
      out.write("\t\t\t\t<table align=\"center\" style=\"text-align: center;font-weight: 900;\">\r\n");
      out.write("\t\t\t\t\t<!-- *?????? ?????? ?????? ?????? ???????????????.<br> -->\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t*?????? ?????? ?????? ?????? ???????????????.\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t?????????  \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input name = \"id\" type=\"text\" value = ");
      out.print(bag.getId());
      out.write(" readonly style=\"text-align:center;width:200px; height:30px; letter-spacing: 1px\"> <br>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- ?????????????????? read??? ????????? value??? ?????????. id??? ??????????????? ????????? ??????????????? readonly -->\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t????????????  \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input name = \"pw\" type=\"text\" required style=\"text-align:center; width:200px; height:30px; letter-spacing: 1px\"><br>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- ??????????????? ?????? or ?????????????????? ?????????????????? required  -->\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t?????? \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input name = \"name\" type=\"text\" value = ");
      out.print(bag.getName());
      out.write(" style=\"text-align:center; width:200px; height:30px; letter-spacing: 1px\"><br>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t???????????????  \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input name = \"tel\" type=\"text\" maxlength = \"11\" value = ");
      out.print(bag.getTel());
      out.write(" style=\"text-align:center; width:200px; height:30px; letter-spacing: 1px\"><br>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\tE-mail \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input name = \"email\" type=\"text\" value = ");
      out.print(bag.getEmail());
      out.write(" style=\"text-align:center; width:200px; height:30px; letter-spacing: 1px\"><br>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t??????  \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input name = \"addr\" type=\"text\" value = ");
      out.print(bag.getAddr());
      out.write(" style=\"text-align:center; width:200px; height:30px; letter-spacing: 1px\"><br>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t????????????  \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input name = \"birth\" type=\"text\" maxlength = \"8\" value = ");
      out.print(bag.getBirth());
      out.write(" style=\"text-align:center; width:200px; height:30px; letter-spacing: 1px\"><br>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t\t\t<button type = \"submit\">???????????? ??????</button>\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- ????????? ??????????????? ???????????? ?????? ?????? -->\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<a href = \"UserDelete.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type = \"button\"  >????????????</button>  <!-- UserDelete.jsp??? ???????????? a?????? ??? ?????? ?????? -->\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
