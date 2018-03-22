package org.apache.jsp.sampleHelloWorldProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TestClient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Web Services Test Client</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<FRAMESET  COLS=\"220,*\">\r\n");
      out.write("<FRAME SRC=\"Method.jsp\" NAME=\"methods\" MARGINWIDTH=\"1\" MARGINHEIGHT=\"1\" SCROLLING=\"yes\" FRAMEBORDER=\"1\">\r\n");
      out.write("<FRAMESET  ROWS=\"80%,20%\">\r\n");
      out.write("<FRAME SRC=\"Input.jsp\" NAME=\"inputs\"  MARGINWIDTH=\"1\" MARGINHEIGHT=\"1\" SCROLLING=\"yes\" FRAMEBORDER=\"1\">\r\n");

StringBuffer resultJSP = new StringBuffer("Result.jsp");
resultJSP.append("?");
java.util.Enumeration resultEnum = request.getParameterNames();while (resultEnum.hasMoreElements()) {
Object resultObj = resultEnum.nextElement();
resultJSP.append(resultObj.toString()).append("=").append(request.getParameter(resultObj.toString())).append("&");
}

      out.write("\r\n");
      out.write("<FRAME SRC=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(resultJSP.toString()));
      out.write("\" NAME=\"result\"  MARGINWIDTH=\"1\" MARGINHEIGHT=\"1\" SCROLLING=\"yes\" FRAMEBORDER=\"1\">\r\n");
      out.write("</FRAMESET>\r\n");
      out.write("<NOFRAMES>\r\n");
      out.write("<BODY>\r\n");
      out.write("The Web Services Test Client requires a browser that supports frames.\r\n");
      out.write("</BODY>\r\n");
      out.write("</NOFRAMES>\r\n");
      out.write("</FRAMESET>\r\n");
      out.write("</HTML>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
