import java.awt.*;
import javax.swing.*;

public class Asst8Q1
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		JPanel p1 = new JPanel();
		
		p1.setLayout(new GridLayout(6,2));
		
		JLabel l1 = new JLabel("Decimal");
		JTextField t1 = new JTextField();
		t1.setEditable(false);
		
		JLabel l2 = new JLabel("Binary");
		JLabel l22 = new JLabel("Result in Binary");
		
		JLabel l3 = new JLabel("Octal");
		JLabel l33 = new JLabel("Result in Octal");
		
		JLabel l4 = new JLabel("Hexadecimal");
		JLabel l44 = new JLabel("Result in Hexadecimal");
		
		JButton b1 = new JButton("Convert");
		JButton b2 = new JButton("Exit");
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(l22);
		p1.add(l3);
		p1.add(l33);
		p1.add(l4);
		p1.add(l44);
		p1.add(b1);
		p1.add(b2);
		frame.add(p1);
		frame.setSize(500,300);
		frame.setVisible(true);
	}
}	
		
