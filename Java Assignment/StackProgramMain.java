import StackOperation.*;
import java.io.*;

class StackProgramMain
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String menu="Menu\n1)Is Stack Full.\n2)Is Stack Empty.\n3)Display Stack.\n4)Push element to stack.\n5)Pop element from stack.\n6)Exit.";
		StackOp stack= new StackOp();
		int ch;
		do
		{
			System.out.print("\n"+menu+"\nEnter Your Choice : ");
			ch = Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1: stack.isFull();
					break;
					
				case 2: stack.isEmpty();
					break;
					
				case 3: stack.displayStack();
					break;
										
				case 4: stack.push();
					break;
				
				case 5: stack.pop();
					break;
				
				case 6: System.out.println("Menu Exits.");
					break;
					
				default:System.out.println("Invalid Input");
			}
		}while(ch!=6);
	}
}
