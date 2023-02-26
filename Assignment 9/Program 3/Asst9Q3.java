import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Asst9Q3 implements ActionListener
{
	JButton b1,b2;
	ButtonGroup b;
	String fontarr[];
	JList ls;
	JTextField t1;
	JComboBox c1;
	Asst9Q3()
	{
		JFrame frame = new JFrame();
		JPanel p1 = new JPanel();
		
		p1.setLayout(new GridLayout(4,3));
		
		JLabel l1 = new JLabel("Font");
		JLabel l2 = new JLabel("Font Style");
		JLabel l3 = new JLabel("Size");
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontarr = ge.getAvailableFontFamilyNames();
		c1 = new JComboBox(fontarr);
		
		b = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("Bold");
		rb1.setActionCommand("Bold");
		b.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Italic");
		rb2.setActionCommand("Italic");
		b.add(rb2);
	
		JPanel rButton = new JPanel();
		rButton.setLayout(new GridLayout(2,1));
		rButton.add(rb1);
		rButton.add(rb2);
		
		DefaultListModel lm = new DefaultListModel();
		for(int i=8; i<=72; i++)
		{
			lm.addElement(String.valueOf(i));
		}
		ls = new JList(lm);
		JScrollPane scrollPane = new JScrollPane(ls);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		t1 = new JTextField("Hello Everyone");	
		b1 = new JButton("Apply");
		b1.addActionListener(this);
		b2 = new JButton("Exit");
		b2.addActionListener(this);
		
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
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{
			System.exit(0);
		}
		else 
		{
			String fontName = (String)c1.getSelectedItem();
			String fontStyle = (String)b.getSelection().getActionCommand();
			int fontSize = Integer.parseInt((String)ls.getSelectedValue());
			if(fontStyle.equalsIgnoreCase("Bold"))
			{
				t1.setFont(new Font(fontName,Font.BOLD,fontSize));
			}
			else 
			{
				t1.setFont(new Font(fontName,Font.ITALIC,fontSize));
			}
		}
	}
	public static void main(String args[])
	{
		new Asst9Q3();
	}
}
