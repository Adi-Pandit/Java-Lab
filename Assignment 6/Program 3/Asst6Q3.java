import java.awt.*;
import java.applet.*;

/*
<applet code = "Asst6Q3" width = 300 height = 200>
<param name = str value = AdityaPandit>
</applet>
*/

public class Asst6Q3 extends Applet
{
	public void paint(Graphics g)
	{
		String Str = getParameter("str");
		char strArray[] = Str.toCharArray();
		String vowel="";
		g.drawString(Str,20,20);
		for(char ch: strArray)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vowel += ch+" ";
			}
		}
		showStatus(vowel);
	}
}
