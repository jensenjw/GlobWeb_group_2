package tags;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MaxLenghtTag extends SimpleTagSupport {
	
private int max = 10;
	
	@Override
	public void doTag() throws IOException, JspException
	{
	    StringWriter stringWriter = new StringWriter();
	    JspFragment body = getJspBody();
	    body.invoke(stringWriter);
	    String bodyText = stringWriter.getBuffer().toString();
		JspWriter out = getJspContext().getOut();
		if(bodyText.length() < 10)
		{
			out.print(bodyText);
		}
		else
		{
			out.print(bodyText.substring(0, Math.min(bodyText.length(), max)) + "...");
		}
	
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	
	
	

}
