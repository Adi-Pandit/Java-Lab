import java.io.*;

class Student
{
	int rollNo;
	String name;
	double percen;
	static int rollno=1; 

	Student() {}

	Student(String name, double percen)
	{
		this.name = name;
		this.percen = percen;
		rollNo = rollno;
		rollno++;
	}

	void sortStudent(Student A[])
	{
		Student temp;
		for(int i=0; i<A.length; i++)
		{
			for(int j=0; j<A.length-i-1; j++)
			{
				if(A[j].percen<A[j+1].percen)
				{
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
	}

	public String toString()
	{
		return +rollNo+"\t\t"+name+"\t\t"+percen;
	}
}

class Asst1Q3
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of student : ");
		int n = Integer.parseInt(br.readLine());
		int rollNo;
		String name;
		double percen;
		Student A[] = new Student[n];
		//Student B[] = new Student[n];

		for(int i=0; i<n; i++)
		{
			System.out.println("\nEnter Details of Student "+(i+1)+" : ");
			System.out.println("Rollno : "+Student.rollno);
			System.out.print("Enter name : ");
			name = br.readLine();
			System.out.print("Enter percentage : ");
			while(true)
			{
				percen = Double.parseDouble(br.readLine());
				if(percen>0)
					break;
				else 
					System.out.print("Invalid percentage input, Please re-enter percentage : ");
			}
			A[i] = new Student(name, percen);
		}

		Student s=new Student();
		s.sortStudent(A);
		System.out.println("\n-----------------------------------------------------------------------------------------------------");
		System.out.println("\nStudents Merit List : ");
		System.out.println("\nRollNo.\t\tName\t\tPercentage");
		for(int i=0; i<n; i++)
		{
			System.out.println(A[i]);
		}
	}
}
