/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-05-04 09:08:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jeju.ProductDB;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("jeju.ProductDB");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>로그인</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\t/* 테이블로 만든 메뉴의 메인페이지, 마이페이지, 고객의소리, 로그인의 글자뿐만이 아니라 셀을 눌러도 링크로 넘어갈 수 있도록 하기 위해서 설정 */\r\n");
      out.write("\t\t\t.cellIconBox{ /* 셀 전부에 설정을 해주기 위해서 클래스를 cellIconBox로 정해서 이 것만 설정을 해줌 */\r\n");
      out.write("\t\t\t\tdisplay:block;\t/* 한셀 전부를 클릭해도 되게 했음 */\r\n");
      out.write("\t\t\t\twidth:100%;\r\n");
      out.write("\t\t\t\t/* height:100%; */\r\n");
      out.write("\t\t\t\ttext-decoration:none;\r\n");
      out.write("\t\t\t\ttext-align: center;\t\r\n");
      out.write("\t\t\t\tfont-size:30px;\r\n");
      out.write("\t\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\t\tcolor:black;\r\n");
      out.write("\t\t\t}\t\t\t\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<header><!-- HTML 레이아웃 중 하나인 header 부분에 메뉴를 생성 -->\r\n");
      out.write("\t\t\t<nav id = \"logo\">\t<!-- HTML 레이아웃중 하나인 nav 부분에 생성, id는 logo 로 지정해서 style.css에서 logo를 이용해 style을 만들어줌  -->\r\n");
      out.write("\t\t\t\t<a href=\"MainPage.jsp\"> <!-- 로고를 누르면 메인페이지를 갈수 있도록 하는 a 태그 생성 -->\r\n");
      out.write("\t\t\t\t\t<img src=\"pictures/MainLogo.png\" width=\"80\" height=\"80\">\t<!-- 80x80짜리 경로를 따라서 이미지를 가져옴 -->\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</nav> <!-- 로고 레이아웃 완료 -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<nav id = \"menu\" ><!-- menu라는 id를 가진 레이아웃을 생성 -->\r\n");
      out.write("\t\t\t\t<table>\t<!-- 테이블 생성 -->\r\n");
      out.write("\t\t\t\t\t<tr>\t<!-- 테이블의 한줄을 생성 -->\r\n");
      out.write("\t\t\t\t\t\t<th colspan=\"4\" style=\"text-align: right; height: 41px\"> <!-- 4열이 합병되고 오른쪽 정렬, 높이가 41px인 테이블 헤더 생성 -->\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</th><!-- 테이블 헤더 완성 -->\r\n");
      out.write("\t\t\t\t\t</tr><!-- 테이블의 한줄을 완성 -->\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><!-- 테이블 데이터 셀을 생성 -->\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"MainPage.jsp\">메인페이지</a>\t<!-- 세션을 이용해 메인페이지 셀을 눌렀을때 로그인된 아이디 값을 넘겨주면서 메인페이지로 감 -->\r\n");
      out.write("\t\t\t\t\t\t</td><!-- 테이블 데이터 완성 -->\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"MyPage.jsp\">마이페이지</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"ServiceMain.jsp\">고객센터</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write(" <!-- 세션을 이용해 로그인이 되지 않았을때 로그인을 하기위해서 로그인페이지로 연결되는 데이터셀을 생성 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"menuLink\" href=\"Login.jsp\">로그인</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table> <!-- 테이블 완성 -->\r\n");
      out.write("\t\t\t</nav><!-- menu 레이아웃 완료 -->\r\n");
      out.write("\t\t</header> <!-- 헤더 레이아웃 완료 -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<nav id=\"Content\" align=\"center\"> <!-- 각 조원들이 넣게될 본문 레이아웃 생성 -->\r\n");
      out.write("\t\t\t");
 if(session.getAttribute("id") == null) { 
      out.write("  <!-- 로그인 세션값이 입력이 되어있지 않을때 로그인입력화면 보이게 함 -->  <!-- 세션값이 있으면 로그인페이지말고 회원정보 페이지를 보여줘야 함 -->\r\n");
      out.write("\t\t\t\t<form action = \"LoginConnect.jsp\"> <!-- 입력값 LoginConnect로 전송 -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<B><font size = \"30em\" color = \"black\" face = \"돋움\" > <!--  LOGIN글씨 폰트설정 -->\r\n");
      out.write("\t\t\t\t\tLOGIN\r\n");
      out.write("\t\t\t\t\t</font></B>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<hr style = \"border : solid 3px white;'\"> <!-- LOGIN 글씨 밑에 밑줄 -->\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<font size = \"5em\" color = \"black\"  >\r\n");
      out.write("\t\t\t\t\t<input name = \"id\" placeholder = \"아이디\" type=\"text\" required style=\"text-align:center;width:250px; height:30px; letter-spacing: 1px\"><br>  \r\n");
      out.write("\t\t\t\t\t<!--아이디인풋창 => placeholder(인풋창에 글씨써놓고 입력값이 생기면 글씨 사라지는 것), required(입력값이 없으면 전송이 안됨. 밑에 경고창띄우기), style(순서대로/중앙정렬/ input창 너비/높이/글자간 간격)  -->    \r\n");
      out.write("\t\t\t\t\t<input name = \"pw\" type = \"password\" placeholder = \"비밀번호\" type=\"text\" required style=\"text-align:center; width:250px; height:30px; letter-spacing: 1px\"><br>   \r\n");
      out.write("\t\t\t\t\t<!-- 패스워드 인풋창 => type을 패스워드로 설정해 입력시 어떤 글씨를 치고있는지 보이지 않게함 -->\r\n");
      out.write("\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<button>LOGIN</button><br>  <!-- 버튼 타입 기본 submit -->\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<form action = \"User.jsp\">  <!-- 회원가입창 연결을 위한 form -->\r\n");
      out.write("\t\t\t\t회원이 아닌가요? \r\n");
      out.write("\t\t\t\t<button>회원가입</button>  <!-- 회원가입 버튼  -->\r\n");
      out.write("\t\t\t\t<br> \r\n");
      out.write("\t\t\t\t</form> <!-- 회원가입 form닫기  -->\r\n");
      out.write("\t\t\t");
 } 
      out.write(" <!-- 세션조건 닫기 -->\r\n");
      out.write("\t\t</nav> <!-- 본문 닫음 -->\r\n");
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
