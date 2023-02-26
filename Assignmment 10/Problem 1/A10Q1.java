import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code=A10Q1 width = 300 height = 200>
</applet>
*/

public class A10Q1 extends Applet implements KeyListener
{
	String msg = "";
	public void init()
	{
		addKeyListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,50);
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("key released");
		repaint();
	}
	public void keyTyped(KeyEvent ke)
	{
		showStatus("key typed");
		char ch = ke.getKeyChar();
		msg += " "+ch;
		repaint();
	}
	public void keyPressed(KeyEvent ke)
	{
		showStatus("key pressed");
		int key = ke.getKeyCode();
		switch(key)
		{
			case KeyEvent.VK_F1:
				msg = msg + "F1 ";
				break;
			case KeyEvent.VK_F2:
				msg = msg + "F2 ";
				break;
			case KeyEvent.VK_F3:
				msg = msg + "F3 ";
				break;
			case KeyEvent.VK_F4:
				msg = msg + "F4 ";
				break;
			case KeyEvent.VK_F5:
				msg = msg + "F5 ";
				break;
			case KeyEvent.VK_F6:
				msg = msg + "F6 ";
				break;
			case KeyEvent.VK_F7:
				msg = msg + "F7 ";
				break;
			case KeyEvent.VK_F8:
				msg = msg + "F8 ";
				break;
			case KeyEvent.VK_F9:
				msg = msg + "F9 ";
				break;
			case KeyEvent.VK_F10:
				msg = msg + "F10 ";
				break;
			case KeyEvent.VK_F11:
				msg = msg + "F11 ";
				break;
			case KeyEvent.VK_F12:
				msg = msg + "F12 ";
				break;
			case KeyEvent.VK_ENTER:
				msg = msg + "Enter ";
				break;
			case KeyEvent.VK_DELETE:
				msg = msg + "Delete ";
				break;
			case KeyEvent.VK_ALT:
				msg = msg + "Alt ";
				break;
			case KeyEvent.VK_CONTROL:
				msg = msg + "Clt ";
				break;
			case KeyEvent.VK_ESCAPE:
				msg = msg + "Esc ";
				break;
			case KeyEvent.VK_PAGE_UP:
				msg = msg + "Page up ";
				break;
			case KeyEvent.VK_PAGE_DOWN:
				msg = msg + "Page down ";
				break;
			case KeyEvent.VK_UP:
				msg = msg + "Up ";
				break;
			case KeyEvent.VK_DOWN:
				msg = msg + "Down ";
				break;
			case KeyEvent.VK_LEFT:
				msg = msg + "Left ";
				break;
			case KeyEvent.VK_RIGHT:
				msg = msg + "Right ";
				break;
			case KeyEvent.VK_SHIFT:
				msg = msg + "Shift ";
				break;
			case KeyEvent.VK_INSERT:
				msg = msg + "Insert ";
				break;
			case KeyEvent.VK_TAB:
				msg = msg + "TAB ";
				break;
			case KeyEvent.VK_SPACE:
				msg = msg + "Space";
				break;
			case KeyEvent.VK_BACK_SPACE:
				msg = msg + "BackSpace";
				break;
			case KeyEvent.VK_PRINTSCREEN:
				msg = msg + "Printscreen";
				break;
		}
		
		repaint();
	}
}
