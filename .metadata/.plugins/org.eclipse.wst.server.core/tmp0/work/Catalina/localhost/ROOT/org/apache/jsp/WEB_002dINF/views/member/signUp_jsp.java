/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-10-11 00:59:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1695686760000L));
    _jspx_dependants.put("jar:file:/C:/workspace/FrameWork/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boardProject/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>회원가입</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/css/member/signUp-style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <main>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"signUp-content\">\n");
      out.write("\n");
      out.write("            <form action=\"/member/signUp\" method=\"POST\" name=\"signUpFrm\" id=\"signUpFrm\">\n");
      out.write("\n");
      out.write("                <!-- 이메일 입력 -->\n");
      out.write("                <label for=\"memberEmail\">\n");
      out.write("                    <span class=\"required\">*</span> 아이디(이메일)\n");
      out.write("                </label>\n");
      out.write("\n");
      out.write("                <div class=\"signUp-input-area\">\n");
      out.write("                    <input type=\"text\" name=\"memberEmail\" id=\"memberEmail\" \n");
      out.write("                    placeholder=\"아이디(이메일)\" maxlength=\"30\" autocomplete=\"off\">\n");
      out.write("                    \n");
      out.write("                    <button id=\"sendAuthKeyBtn\" type=\"button\">인증번호 받기</button>\n");
      out.write("                </div>\n");
      out.write("                <span class=\"signUp-message\" id=\"emailMessage\">메일을 받을 수 있는 이메일을 입력해주세요.</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- 인증번호 입력 -->\n");
      out.write("                <label for=\"emailCheck\">\n");
      out.write("                    <span class=\"required\">*</span> 인증번호\n");
      out.write("                </label>\n");
      out.write("\n");
      out.write("                <div class=\"signUp-input-area\">\n");
      out.write("                    <input type=\"text\" name=\"authKey\" id=\"authKey\" s placeholder=\"인증번호 입력\" maxlength=\"6\" autocomplete=\"off\" >\n");
      out.write("                    \n");
      out.write("                    <button id=\"checkAuthKeyBtn\" type=\"button\">인증하기</button>\n");
      out.write("                </div>\n");
      out.write("                <span class=\"signUp-message\" id=\"authKeyMessage\"></span>\n");
      out.write("                                <!-- 인증번호가 일치하지 않습니다 -->\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <!-- 비밀번호/비밀번호 확인 입력 -->\n");
      out.write("                <label for=\"memberPw\">\n");
      out.write("                    <span class=\"required\">*</span> 비밀번호\n");
      out.write("                </label>\n");
      out.write("\n");
      out.write("                <div class=\"signUp-input-area\">\n");
      out.write("                    <input type=\"password\" name=\"memberPw\" id=\"memberPw\" \n");
      out.write("                    placeholder=\"비밀번호\" maxlength=\"20\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"signUp-input-area\">\n");
      out.write("                    <input type=\"password\" name=\"memberPwConfirm\" id=\"memberPwConfirm\" \n");
      out.write("                    placeholder=\"비밀번호 확인\" maxlength=\"20\" >\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <span class=\"signUp-message\" id=\"pwMessage\">영어,숫자,특수문자(!,@,#,-,_) 6~20글자 사이로 입력해주세요.</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- 닉네임 입력 -->\n");
      out.write("                <label for=\"memberNickname\">\n");
      out.write("                    <span class=\"required\">*</span> 닉네임\n");
      out.write("                </label>\n");
      out.write("\n");
      out.write("                <div class=\"signUp-input-area\">\n");
      out.write("                    <input type=\"text\" name=\"memberNickname\" id=\"memberNickname\" placeholder=\"닉네임\" maxlength=\"10\" >\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <span class=\"signUp-message\" id=\"nickMessage\">한글,영어,숫자로만 2~10글자</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- 전화번호 입력 -->\n");
      out.write("                <label for=\"memberTel\">\n");
      out.write("                    <span class=\"required\">*</span> 전화번호\n");
      out.write("                </label>\n");
      out.write("\n");
      out.write("                <div class=\"signUp-input-area\">\n");
      out.write("                    <input type=\"text\" name=\"memberTel\" id=\"memberTel\" placeholder=\"(- 없이 숫자만 입력)\" maxlength=\"11\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <span class=\"signUp-message\" id=\"telMessage\">전화번호를 입력해주세요.(- 제외)</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- 주소 입력 -->\n");
      out.write("                <label for=\"memberAddress\">주소</label>\n");
      out.write("\n");
      out.write("                <div class=\"signUp-input-area\">\n");
      out.write("                    <input type=\"text\" name=\"memberAddress\" id=\"sample6_postcode\" placeholder=\"우편번호\" maxlength=\"6\">\n");
      out.write("                    \n");
      out.write("                    <button type=\"button\" onclick=\"sample6_exeDaumPostcode()\">검색</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"signUp-input-area\">\n");
      out.write("                    <input type=\"text\" name=\"memberAddress\" placeholder=\"도로명/지번 주소\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"signUp-input-area\">\n");
      out.write("                    <input type=\"text\" name=\"memberAddress\" placeholder=\"상세 주소\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <button id=\"signUpBtn\">가입하기</button>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\n");
      out.write("<script>\n");
      out.write("    function sample6_execDaumPostcode() {\n");
      out.write("        new daum.Postcode({\n");
      out.write("            oncomplete: function(data) {\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\n");
      out.write("\n");
      out.write("                // 각 주소의 노출 규칙에 따라 주소를 조합한다.\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\n");
      out.write("                var addr = ''; // 주소 변수\n");
      out.write("             \n");
      out.write("\n");
      out.write("                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\n");
      out.write("                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\n");
      out.write("                    addr = data.roadAddress;\n");
      out.write("                } else { // 사용자가 지번 주소를 선택했을 경우(J)\n");
      out.write("                    addr = data.jibunAddress;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\n");
      out.write("                if(data.userSelectedType === 'R'){\n");
      out.write("                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)\n");
      out.write("                    // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\n");
      out.write("                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\n");
      out.write("                        extraAddr += data.bname;\n");
      out.write("                    }\n");
      out.write("                    // 건물명이 있고, 공동주택일 경우 추가한다.\n");
      out.write("                    if(data.buildingName !== '' && data.apartment === 'Y'){\n");
      out.write("                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\n");
      out.write("                    }\n");
      out.write("                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\n");
      out.write("                    if(extraAddr !== ''){\n");
      out.write("                        extraAddr = ' (' + extraAddr + ')';\n");
      out.write("                    }\n");
      out.write("                    // 조합된 참고항목을 해당 필드에 넣는다.\n");
      out.write("                    document.getElementById(\"sample6_extraAddress\").value = extraAddr;\n");
      out.write("                \n");
      out.write("                } else {\n");
      out.write("                    document.getElementById(\"sample6_extraAddress\").value = '';\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\n");
      out.write("                document.getElementById('sample6_postcode').value = data.zonecode;\n");
      out.write("                document.getElementById(\"sample6_address\").value = addr;\n");
      out.write("                // 커서를 상세주소 필드로 이동한다.\n");
      out.write("                document.getElementById(\"sample6_detailAddress\").focus();\n");
      out.write("            }\n");
      out.write("        }).open();\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    <script src=\"/resources/js/member/signUp.js\"></script>\n");
      out.write("</body>\n");
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
