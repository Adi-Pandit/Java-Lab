import java.awt.*;
import java.applet.*;

/*
<applet code = Asst7Q3 width = 200 height = 500>
</applet>
*/

public class Asst7Q3 extends Applet
{
	public void paint(Graphics g)
	{
		int y=0;
		String fontarr[];
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontarr = ge.getAvailableFontFamilyNames();
		
		for(String str: fontarr)
		{
			g.drawString(str,20,20+y);
			y+=20;
		}
	}
}
