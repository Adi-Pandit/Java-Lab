import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code = A10Q3 width = 300 height = 300>
</applet>
*/

public class A10Q3 extends Applet 
{
	public void init()
	{
		addMouseListener(new MyMouse());
		addMouseMotionListener(new MyMouse());
	}
	public class MyMouse extends MouseAdapter
	{
		public void mouseMoved(MouseEvent me)
		{
			showStatus("moved");
		}
		public void mouseDragged(MouseEvent me)
		{
			showStatus("dragged");
		}
		public void mouseClicked(MouseEvent me)
		{
			showStatus("clicked");
		}
	}
}
