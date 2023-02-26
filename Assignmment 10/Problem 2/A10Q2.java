import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class A10Q2 extends JFrame implements ActionListener
{
	JLabel p[] = new JLabel[16];
	JButton  up,down,left,right;
	int currentPos = 13;
	
	Color blackColor = Color.BLACK;
	Color whiteColor = Color.WHITE;
	Color temp;
	A10Q2()
	{
		setLayout(new GridLayout(5,4));
		setSize(700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		for(int i=1; i<=16; i++)
		{
			p[i-1] = new JLabel();
			if(i%2==0)
			{
				p[i-1].setBackground(blackColor);
				p[i-1].setOpaque(true);
			}
			else
			{
				p[i-1].setBackground(whiteColor);
				p[i-1].setOpaque(true);
			}
			if(i%4==0)
			{
				temp = blackColor;
				blackColor = whiteColor;
				whiteColor = temp;
			}
			add(p[i-1]);
		}
		up = new JButton("Up");
		down = new JButton("Down");
		left = new JButton("Left");
		right = new JButton("Right");
		
		add(up);
		add(down);
		add(left);
		add(right);
		
		up.addActionListener(this);
		down.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
		
		changePos();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==up)
		{
			if((currentPos-4)>=0)
			{
				p[currentPos].setText("");
				currentPos -= 4;
				changePos();
			}
			else
				JOptionPane.showMessageDialog(up,"Up Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
		}
		else if(ae.getSource()==down)
		{
			if((currentPos+4)<16)
			{
				p[currentPos].setText("");
				currentPos += 4;
				changePos();
			}
			else
				JOptionPane.showMessageDialog(down,"Down Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
		}
		else if(ae.getSource()==left)
		{
			if((currentPos-1)>=0)
			{
				p[currentPos].setText("");
				currentPos -= 1;
				if(currentPos==3||currentPos==7||currentPos==11)
				{
					currentPos += 1;
					changePos();
					JOptionPane.showMessageDialog(left,"Left Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
				}
				else
					changePos();
			}
			else
			{
				changePos();
				JOptionPane.showMessageDialog(left,"Left Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
			}
		}
		else
		{
			if((currentPos+1)<16)
			{
				p[currentPos].setText("");
				currentPos += 1;
				if(currentPos==4||currentPos==8||currentPos==12)
				{
					currentPos -= 1;
					changePos();
					JOptionPane.showMessageDialog(right,"Right Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					changePos();
				}
			}
			else
			{		
				changePos();
				JOptionPane.showMessageDialog(right,"Right Limit Exceeded","Alert",JOptionPane.ERROR_MESSAGE);
			}
		}
				
	}
	public void changePos()
	{
		p[currentPos].setText("*");
		p[currentPos].setFont(new Font("Curior",Font.BOLD,45));
		p[currentPos].setHorizontalAlignment(JLabel.CENTER);
		if(p[currentPos].getBackground()==Color.BLACK)
			p[currentPos].setForeground(Color.WHITE);
	}			
	public static void main(String args[])
	{
		new A10Q2();
	}
}

			
			
		
		
