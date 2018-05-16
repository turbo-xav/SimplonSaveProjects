package testWeb;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;

public class TagTest extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;
 
	
 
	public void setMessage(String message) {
 
		this.message = message;
 
	}
 

	
	@Override
	 public int doStartTag() throws JspException {
		 try {
			 JspWriter out = pageContext.getOut();
			
			 out.print("Hello" + message );
			 
			 } catch (IOException ioe) {
			 System.out.println(ioe);
			 }
			 return SKIP_BODY;
			 }
	
	
}
