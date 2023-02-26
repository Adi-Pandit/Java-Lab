import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Asst9Q2 extends JFrame implements ActionListener,KeyListener
{
	JLabel l22,l33,l44;
	JButton b1,b2;
	int n;
	JTextField t1;
	Asst9Q2()
	{
		JFrame frame = new JFrame();
		
		frame.setLayout(new GridLayout(6,2));
		
		JLabel l1 = new JLabel("Decimal");
		t1 = new JTextField();
		t1.addKeyListener(this);
			
		JLabel l2 = new JLabel("Binary");
		l22 = new JLabel();
		
		JLabel l3 = new JLabel("Octal");
		l33 = new JLabel();
		
		JLabel l4 = new JLabel("Hexadecimal");
		l44 = new JLabel();
		
		b1 = new JButton("Convert");
		b1.addActionListener(this);
		b2 = new JButton("Exit");
		b2.addActionListener(this);
		
		frame.add(l1);
		frame.add(t1);
		frame.add(l2);
		frame.add(l22);
		frame.add(l3);
		frame.add(l33);
		frame.add(l4);
		frame.add(l44);
		frame.add(b1);
		frame.add(b2);
		frame.setSize(500,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void keyTyped(KeyEvent ke)
	{
		char ch = ke.getKeyChar();
		if((ch>'0' && ch<'9') || ch=='\b' || ch==(char)127)
		{
			t1.setEditable(true);
		}
		else
		{
			t1.setEditable(false);
		}
	}
	public void keyReleased(KeyEvent ke)
	{}
	public void keyPressed(KeyEvent ke)
	{}		
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			n = Integer.valueOf(t1.getText());
			l22.setText(Integer.toBinaryString(n));
			l33.setText(Integer.toOctalString(n));
			l44.setText(Integer.toHexString(n));
		}
		if(ae.getSource()==b2)
		{
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		new Asst9Q2();
	}
}	
