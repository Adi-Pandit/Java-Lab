package StackOperation;
import java.io.*;

public class StackOp
{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	
	private int stack[];	
	int pos=-1;
	public StackOp()
	{
		stack = new int[100];      //Max Size of Stack is upto 100 integer elements
	}
	
	public Boolean isEmpty()       //Method to check stack is empty or not
	{
		if(pos==-1)
		{		
			System.out.println("Stack is Empty.");
			return true;
		}
		else
		{	
			System.out.println("Stack is Not Empty.");
			return false;
		}
	}
	
	public Boolean isFull()     //Method to check stack is full or not
	{
		if(pos==99)
		{	
			System.out.println("Stack is Full.");
			return true;
		}
		else
		{
			System.out.println("Stack is not full.");		
			return false;	
		}
	}
	
	public void push()throws IOException     //Method to push element into stack
	{
		if(!isFull())
		{
			System.out.print("Enter Element : ");
			int element=Integer.parseInt(br.readLine());
			stack[++pos]=element;
		}
	}

	public int pop()       //Method to pop element from stack
	{
		if(!isEmpty())
		{
			System.out.println("Element Popped : "+stack[pos]);
			return stack[pos--];
		}
		else
			return 0;
	}
	
	public void displayStack()       //Method to display the stack
	{
		if(!isEmpty())
		{
			System.out.println("Stack Elements : ");
			for(int i=pos; i>=0; i--)
			{
				System.out.println(stack[i]);
			}
		}
	}	
}
