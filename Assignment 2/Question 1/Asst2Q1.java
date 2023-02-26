import NumOperation.*;
import java.io.*;

class Asst2Q1
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number : ");
		int n = Integer.parseInt(br.readLine());

		Prime pr=new Prime();
		Perfect pe=new Perfect();
		Armstrong ar=new Armstrong();

		pr.prime(n);
		pe.perfect(n);
		ar.armstrong(n);
	}
}		
