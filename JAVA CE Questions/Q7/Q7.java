import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code = Q7 width = 300 height = 200>
</applet>
*/

public class Q7 extends Applet implements ActionListener,KeyListener
{
	Label l1;
	TextField t1;
	int sum;
	Button b1;
	public void init()
	{
		setLayout(null);
		int min = 1;
		int max = 10;
		int a = (int)(Math.random()*(max-min+1)+min);
		
		int min1 = 11;
		int max1 = 20;
		int b = (int)(Math.random()*(max1-min1+1)+min1);
		
		l1 = new Label(a+" + "+b+" = ");
		l1.setBounds(20,20,60,20);
		
		sum = a+b;
		
		t1 = new TextField();
		t1.setBounds(90,20,80,20);
		t1.setEditable(false);
		t1.addKeyListener(this);
		
		b1 = new Button("Submit");
		b1.setBounds(55,50,50,30);
		b1.addActionListener(this);
		
		add(l1);
		add(t1);
		add(b1);
	}
	public void keyTyped(KeyEvent ke)
	{
		char ch = ke.getKeyChar();
		if((ch>='0' && ch<='9') || ch=='\b' || ch==(char)127)
		{
			t1.setEditable(true);
		}
		else
		{
			t1.setEditable(false);
		}
	}
	public void keyPressed(KeyEvent ke)
	{}
	public void keyReleased(KeyEvent ke)
	{}
	public void actionPerformed(ActionEvent ke)
	{
		if(ke.getSource()==b1)
		{
			int num = Integer.valueOf(t1.getText());
			if(num==(sum))
			{
				showStatus("Correct");
			}
			else
			{
				showStatus("Incorrect");
			}
			
		}
	}		
}
