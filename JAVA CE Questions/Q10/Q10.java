import java.io.*;

class Q10
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter number of strings : ");
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[n];
		String temp;
		for(int i=0; i<n; i++)
		{
			System.out.format("Enter String %d : ",(i+1)); 
			arr[i] = br.readLine();
		}
		System.out.println("\nEntered Strings : ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				int compare = arr[j].compareTo(arr[j+1]);
				if(compare>0)
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("\n\nSorted string array in dictionary order : ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}			
