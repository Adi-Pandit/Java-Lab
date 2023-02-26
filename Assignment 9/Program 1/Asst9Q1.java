import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code = "Asst9Q1" width = 500 height = 200>
</applet>
*/

public class Asst9Q1 extends Applet implements MouseMotionListener
{
	Label l1,l2,l3,l4;
	public void init()
	{
		setLayout(new GridLayout(2,2));
		
		l1 = new Label("Mouse X");
		l2 = new Label();
		l2.addMouseMotionListener(this);
		
		l3 = new Label("Mouse Y");
		l4 = new Label();
		l4.addMouseMotionListener(this);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
	}
	public void mouseMoved(MouseEvent me)
	{
		l2.setText(String.valueOf(me.getX()));
		l4.setText(String.valueOf(me.getY()));
	}
	public void mouseDragged(MouseEvent me)
	{}
}
