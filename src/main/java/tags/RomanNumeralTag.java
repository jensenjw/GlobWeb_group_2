package tags;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class RomanNumeralTag extends SimpleTagSupport {
	
	private String since = "2020";
	
	@Override
	public void doTag() throws IOException
	{
		JspWriter out = getJspContext().getOut();
		out.print("@" + intToRoman(Integer.parseInt(since)) + "MMXXII");
	}
	
	public String intToRoman(int num)   
	{  
	int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
	String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
	StringBuilder roman = new StringBuilder();  
	for(int i=0;i<values.length;i++)   
		{  
		while(num >= values[i])   
			{  
			num = num - values[i];  
			roman.append(romanLetters[i]);  
			}  
		}  
	return roman.toString();  
	}

	public String getSince() {
		return since;
	}

	public void setSince(String since) {
		this.since = since;
	}  
	
	

}
