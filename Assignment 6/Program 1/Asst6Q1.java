import java.awt.*;
import java.applet.*;

/*
<applet code="Asst6Q1" width=300 height=200>
</applet>
*/

public class Asst6Q1 extends Applet
{
	String msg,msg1;
	public void init()
	{
		setBackground(Color.blue);
		msg = "Init method";
	}
	public void start()
	{
		msg1 = "Start method";
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.drawString(msg,20,20);
		g.drawString(msg1,20,40);
		g.drawString("Paint method",20,60);
	}
}
