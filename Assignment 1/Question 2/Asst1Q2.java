class MyNumber
{
	private int num;

	MyNumber()
	{
		num = 0;
	}
	MyNumber(int num)
	{
		this.num = num;
	}

	void check(int num)
	{
		if(num==0)
			System.out.println("Given number is Zero");
		else 
		{
			if(num>0)
				System.out.print("Given number is positive ");
			else 
				System.out.print("Given number is negative ");

			if(num%2==0)
				System.out.println("and Even");
			else 
				System.out.println("and odd");
		}
	}
}

class Asst1Q2
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		System.out.println("Entered number is "+num);

		MyNumber mn = new MyNumber();
		mn.check(num);
	}
}