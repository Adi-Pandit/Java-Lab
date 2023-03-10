import java.io.*;

class Asst5Q1
{
	public static void main(String args[])
	{
		String name = args[0];
		File f1=new File(name);

		if(f1.isDirectory())
		{
			String contentOfDir[];
			int countFile=0, countDir=0;
			System.out.println("Directory");
			contentOfDir = f1.list();
			System.out.println("\nContents of directory : ");
			for(String content : contentOfDir)
			{
				File f2=new File(name,content);
				if(f2.isFile())
				{
					System.out.println(content);
					countFile++;
				}
				else if(f2.isDirectory())
				{
					System.out.println(content);
					countDir++;
				}	
			}
			System.out.println("\nThere are total "+countFile+" files in directory "+name);
			System.out.println("\nThere are total "+countDir+" sub-directory in directory "+name);
			System.out.println("\nFiles with .txt extension in directory "+name);
			for(int i=0; i<contentOfDir.length; i++)
			{
				if(contentOfDir[i].endsWith(".txt"))
					System.out.println(contentOfDir[i]);
			}		
		}	
		else if(f1.isFile())
		{
			System.out.println("File");
			System.out.println("Path : "+f1.getPath());
			System.out.println("Size : "+f1.length());
		}
		else
			System.out.println(name+" name file/Directory is not prsent");
	}
}
