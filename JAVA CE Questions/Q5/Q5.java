import java.io.*;

class Q5 implements numberConversion
{
	public void convertToBinary(int num)
	{
		System.out.println(Integer.toBinaryString(num));
	}
	public void convertToOctal(int num)
	{
		System.out.println(Integer.toOctalString(num));
	}
	public void convertToHexadecimal(int num)
	{
		System.out.println(Integer.toHexString(num));
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter decimal number : ");
		int num = Integer.parseInt(br.readLine());
		Q5 obj = new Q5();
		obj.convertToBinary(num);
		obj.convertToOctal(num);
		obj.convertToHexadecimal(num);
	}
}
