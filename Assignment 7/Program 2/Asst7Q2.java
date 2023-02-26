import java.awt.*;
import java.applet.*;

/*
<applet code = "Asst7Q2" width = 500 height = 500>
</applet>
*/

public class Asst7Q2 extends Applet
{
	public void paint(Graphics g)
	{
		Color c;
		
		int x[] = {250,180,320};
		int y[] = {50,190,190};
		
		c = new Color(255,0,0);
		g.setColor(c);	
		g.fillPolygon(x,y,3);
		
		c = new Color(255,255,0);
		g.setColor(c);
		g.fillRect(180,190,140,160);
		
		c = new Color(255,255,255);
		g.setColor(c);
		g.fillRect(225,270,50,80);
	}
}
