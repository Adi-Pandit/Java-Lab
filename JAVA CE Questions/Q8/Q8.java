import java.io.*;

class arrayInput
{
	int n;
	int arr[];		
		
	arrayInput() {}
		
	void accept() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of elements : ");
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		for(int i=0; i<n; i++)
		{
			System.out.format("Enter %d element : ",(i+1)); 
			arr[i] = Integer.parseInt(br.readLine());
		}
	}
}
class printArray extends arrayInput
{
	int i=0;
	String display()
	{
		if(i==(n-1))
			return arr[n-1]+" ";
		else
			return arr[i++]+" "+(display());
	}
}
class Q8
{
	public static void main(String args[]) throws IOException
	{
		printArray pa = new printArray();
		pa.accept();
		System.out.println(pa.display());
		
	}
}
