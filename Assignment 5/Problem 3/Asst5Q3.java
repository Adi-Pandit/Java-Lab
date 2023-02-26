import java.io.*;

public class Asst5Q3
{
    	public static void main(String[] args) throws IOException 
    	{
        	//InputStream f = new FileInputStream(args[0]);
        	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        	FileOutputStream even = new FileOutputStream("./even.txt");
        	FileOutputStream odd = new FileOutputStream("./odd.txt");
        	String line;
        	int lineCount=0;
        	char lineArr[];
        	try 
      		{
        		while((line = br.readLine())!=null) 
        		{
                		lineCount++;
                		lineArr = line.toCharArray();
                		               
               			if(lineCount%2==0)
               			{
               				for(char ch:lineArr)
                				even.write(ch);
                			even.write('\n');
                		}
                		else
                		{
                			for(char ch:lineArr)
                				odd.write(ch);
                			odd.write('\n');
                		}
                	}
                	System.out.println("Operation Successfull.");
                }    			
        	catch (IOException ioe) 
        	{
        	    	System.out.println(ioe);    
        	}
        	try 
        	{
        	    	odd.close();
        	    	even.close();    
        	} 
        	catch (IOException ioe) 
        	{
            		System.out.println(ioe);
        	}
    	}
}
		
