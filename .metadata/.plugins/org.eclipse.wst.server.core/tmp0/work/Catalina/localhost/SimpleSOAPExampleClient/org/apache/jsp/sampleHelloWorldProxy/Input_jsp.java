package org.apache.jsp.sampleHelloWorldProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Input_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Inputs</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1>Inputs</H1>\r\n");
      out.write("\r\n");

String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

boolean valid = true;

if(methodID != -1) methodID = Integer.parseInt(method);
switch (methodID){ 
case 2:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 5:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">endpoint:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"endpoint8\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 10:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 13:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">name:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"name16\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 1111111111:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">URLString:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"url1111111111\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 1111111112:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
}
if (valid) {

      out.write("\r\n");
      out.write("Select a method to test.\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
