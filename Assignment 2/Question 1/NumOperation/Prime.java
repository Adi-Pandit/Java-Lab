package NumOperation;
public class Prime
{
	int flag = 0;
	int num1;
	public void prime(int num)
	{
		if(num<0)
			num = num*(-1);

		if(num==0||num==1)
		{
			System.out.println("Entered number is neither Prime nor Composite");
			flag = 1;
		}
		else
		{
			for(int i=2; i<num/2; i++)
			{
				if(num%2==0)
				{
					System.out.println("Entered number is not Prime number");
					flag = 1;
					break;
				}
			}
		}
		if(flag==0)
			System.out.println("Entered number is Prime number");
	}
}
			
