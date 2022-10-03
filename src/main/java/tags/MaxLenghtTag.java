package tags;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
@author Markus Løtveit
*/

public class MaxLenghtTag extends SimpleTagSupport {
	
private String max = "10";
	
/**
Check if the lenght of the tag body is longer than max characters and trims it if it is, otherwise print out the entire text.
*/
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
			out.print(bodyText.substring(0, Math.min(bodyText.length(), Integer.parseInt(max))) + "...");
		}
	
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	

	
	
	

}
