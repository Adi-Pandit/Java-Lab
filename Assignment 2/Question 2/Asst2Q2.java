import MScCAI.*;
import MScCAII.*;
import java.io.*;

class Student
{
	int rollNo,MScCAIMarks,MScCAIIMarks;
	String name,Grade;
	static int rno=1;
	
	Student() {}
	
	Student(String name, int MScCAIMarks, int MScCAIIMarks)
	{
		rollNo = rno;
		rno++;
		this.name = name;
		this.MScCAIMarks = MScCAIMarks;
		this.MScCAIIMarks = MScCAIIMarks;
	}
	
	String Grade(int MScCAIMarks, int MScCAIIMarks)
	{
		
		float percen = (float)((MScCAIMarks+MScCAIIMarks)*100/(400));
		if(percen>=70)
			Grade = "A";
		else if(percen>=60)
			Grade = "B";
		else if(percen>=50)
			Grade = "C";
		else if(percen>=40)
			Grade = "Pass";
		else
			Grade = "Fail";
		return Grade;
	}
	public String toString()
	{
		return "Roll No : "+rollNo+"\nName : "+name+"\nMScCAIMarks : "+MScCAIMarks+"\nMScCAIIMarks : "+MScCAIMarks+"\nGrade : "+Grade;
	} 
}

class Asst2Q2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of student : ");
		int n = Integer.parseInt(br.readLine());
		Student S[] = new Student[n];
		MScCAIMarks mca1 = new MScCAIMarks();
		MScCAIIMarks mca2 = new MScCAIIMarks();
		Student s = new Student();
		String name;
		int semI,semII,CAIMarks,CAIIMarks;
				
		for(int i=0; i<n; i++)
		{
			System.out.println("\nRoll No. : "+Student.rno);
			System.out.print("Enter name : ");
			name = br.readLine();
			
			System.out.println("Enter MScCAI Marks Details : ");
			System.out.print("Enter Sem-I marks : ");
			while(true)
			{
				semI = Integer.parseInt(br.readLine());
				if(semI>=0 && semI<=100)
					break;
				else
					System.out.print("Invalid sem-I marks, please enter marks between 0 to 100 : ");
			}
			System.out.print("Enter Sem-II marks : ");
			while(true)
			{
				semII = Integer.parseInt(br.readLine());
				if(semII>=0 && semII<=100)
					break;
				else
					System.out.print("Invalid sem-II marks, please enter marks between 0 to 100 : ");
			}
			mca1 = new MScCAIMarks(semI,semII);
			CAIMarks = mca1.TotalMarks(semI,semII);
			
			System.out.println("Enter MScCAII Marks Details : ");
			System.out.print("Enter Sem-I marks : ");
			while(true)
			{
				semI = Integer.parseInt(br.readLine());
				if(semI>=0 && semI<=100)
					break;
				else
					System.out.print("Invalid sem-I marks, please enter marks between 0 to 100 : ");
			}
			System.out.print("Enter Sem-II marks : ");
			while(true)
			{
				semII = Integer.parseInt(br.readLine());
				if(semII>=0 && semII<=100)
					break;
				else
					System.out.print("Invalid sem-II marks, please enter marks between 0 to 100 : ");
			}
			mca2 = new MScCAIIMarks(semI,semII);
			CAIIMarks = mca2.TotalMarks(semI,semII);
			
			S[i] = new Student(name,CAIMarks,CAIIMarks);
			S[i].Grade(CAIMarks,CAIIMarks);
		}
		System.out.println("\nResult of Students : ");
		for(int i=0; i<n; i++)
		{
			System.out.println("\n"+S[i]);
		}
	}
}
			
						
