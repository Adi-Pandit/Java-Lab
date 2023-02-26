package NumOperation;
public class Perfect
{
	int sum=0;
	public void perfect(int num)
	{
		if(num==0)
		{
			System.out.println("Entered number is not Perfect number");
		}
		else if(num>0)
		{
			for(int i=1; i<num; i++)
			{
				if(num%i==0)
				{
					sum = sum+i;
				}
			}
			if(num==sum)
				System.out.println("Entered number is Perfect number");
			else
				System.out.println("Entered number is not Perfect number");
		}
		else 
			System.out.println("Number is negative, Perfect number is not possible");
	}
}

