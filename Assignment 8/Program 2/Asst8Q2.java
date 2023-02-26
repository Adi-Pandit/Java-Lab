import java.awt.*;
import javax.swing.*;

public class Asst8Q2
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		JPanel p1 = new JPanel();
		
		p1.setLayout(new GridLayout(4,3));
		
		JLabel l1 = new JLabel("Font");
		JLabel l2 = new JLabel("Font Style");
		JLabel l3 = new JLabel("Size");
		
		String fontarr[];
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontarr = ge.getAvailableFontFamilyNames();
		JComboBox c1 = new JComboBox(fontarr);
		
		ButtonGroup b = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("Bold");
		b.add(rb1);
		JRadioButton rb2 = new JRadioButton("Italic");
		b.add(rb2);
		JPanel rButton = new JPanel();
		rButton.setLayout(new GridLayout(2,1));
		rButton.add(rb1);
		rButton.add(rb2);
		
		DefaultListModel lm = new DefaultListModel();
		for(int i=8; i<72; i++)
		{
			lm.addElement(String.valueOf(i));
		}
		JList ls = new JList(lm);
		JScrollPane scrollPane = new JScrollPane(ls);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		JTextField t1 = new JTextField("Hello Everyone");	
		JButton b1 = new JButton("Apply");
		JButton b2 = new JButton("Exit");
	
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(c1);
		p1.add(rButton);
		p1.add(scrollPane);
		p1.add(t1);
		p1.add(b1);
		p1.add(b2);
		frame.add(p1);
		frame.setSize(500,300);
		frame.setVisible(true);	
	}
}
