import java.io.*;

class Employee
{
	String name, position;
	double salary;
	static int count = 0;

	Employee() {count++;}

	Employee(String name, String position, double salary)
	{
		this.name = name;
		this.position = position;
		this.salary = salary;
		count++;
	}

	public String toString()
	{
		return "Name : "+name+"\nPosition : "+position+"\nSalary : "+salary;
	}
}

class Asst1Q1
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of Employees : ");
		int n = Integer.parseInt(br.readLine());

		String name,position;
		double salary;
		Employee A[]=new Employee[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("\nEnter Details of Employee "+(i+1));
			System.out.print("Enter name of Employee : ");
			name = br.readLine();
			System.out.print("Enter position of Employee : ");
			position = br.readLine();
			System.out.print("Enter salary of Employee : ");
			while(true)
			{
				salary = Double.parseDouble(br.readLine());
				if(salary>0)
					break;
				else 
					System.out.print("Invalid salary input, Please Re-enter salary : ");
			}
			A[i]=new Employee(name,position,salary);
			if(Employee.count==1)
				System.out.println("\n"+Employee.count+" object is created");
			else	
				System.out.println("\n"+Employee.count+" objects are created");
		}
		System.out.print("\nEmployee details : ");
		for(int i=0; i<n; i++)
		{
			System.out.println("\nEmployee "+(i+1)+" details : ");
			System.out.println(A[i]);
		}
					
	}
}