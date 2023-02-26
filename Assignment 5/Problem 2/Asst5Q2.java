import java.io.*;

class Asst5Q2
{
	public static void main(String args[]) throws IOException
	{
		File f1 = new File(args[0]);	
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f1)));
		String line;
		int countCharacter=0,countWord=0,countLine=0;
		try
		{
			while((line = br.readLine())!=null)
			{
				countCharacter += line.length();
				String[] wordList = line.split("\\s+");
				for(String s: wordList)
				{
					if(s.matches("\\w+"))
						countWord++;
				}
				String[] lineList = line.split("\n");
				countLine += lineList.length;
			}
			System.out.println("\nCharacter : "+(countCharacter+countLine)+"\nWord : "+countWord+"\nLine : "+countLine);
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println(fnfe);
			System.out.println("File is not present");
		}
	}
}
