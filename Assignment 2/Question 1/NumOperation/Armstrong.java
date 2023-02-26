package NumOperation;
import java.lang.Math;

public class Armstrong
{
	int sum=0,count=0;
	public void armstrong(int num)
	{
		if(num>=0)
		{
			int temp=num;
			while(temp>0)
			{
				temp = temp/10;
				count++;
			}
			temp=num;
			while(temp>0)
			{
				sum = sum + (int)Math.pow((temp%10),count);
				temp = temp/10;
			}
			if(num==sum)
				System.out.println("Entered number is Armstrong number");
			else
				System.out.println("Entered number is not Armstrong number");
		}
		else
			System.out.println("Entered number is negative, Armstrong number is not possible");
	}
}
					
