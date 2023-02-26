import java.io.*;

class MatrixAddition
{
	int[][] MatrixAdd(int A[][], int B[][])    //Method to calculate Addition of Matrix
	{
		int C[][] = new int[A.length][A[0].length];
		for(int i=0; i<A.length; i++)
		{
			for(int j=0; j<A[0].length; j++)
			{
				C[i][j] = A[i][j]+B[i][j];
			}
		}
		return C;
	}
}

class Asst1Q4
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter no. of rows of matrix A : ");
		int Ar = Integer.parseInt(br.readLine());
		System.out.print("Enter no. of columns of matrix A : ");
		int Ac = Integer.parseInt(br.readLine());

		System.out.print("Enter no. of rows of matrix B : ");
		int Br = Integer.parseInt(br.readLine());
		System.out.print("Enter no. of columns of matrix B : ");
		int Bc = Integer.parseInt(br.readLine());

		if((Ar==Br)&&(Ac==Bc))    //Necessary Condition for Addition of Matrices
		{
			int A[][] = new int[Ar][Ac];
			int B[][] = new int[Br][Bc];
			int C[][] = new int[Ar][Ac];

			System.out.println("\nEnter elements of Matrix A : ");
			for(int i=0; i<Ar; i++)
			{
				for(int j=0; j<Ac; j++)
				{
					System.out.format("Enter element A[%d][%d] : ",i+1,j+1);
					A[i][j] = Integer.parseInt(br.readLine());
				}
			}
			System.out.println("\nMatrix A : ");
			for(int i=0; i<Ar; i++)
			{
				for(int j=0; j<Ac; j++)
				{
					System.out.print(A[i][j]+" ");
				}
				System.out.print("\n");
			}

			System.out.println("\nEnter elements of Matrix B : ");
			for(int i=0; i<Br; i++)
			{
				for(int j=0; j<Bc; j++)
				{
					System.out.format("Enter element B[%d][%d] : ",i+1,j+1);
					B[i][j] = Integer.parseInt(br.readLine());
				}
			}
			System.out.println("\nMatrix B : ");
			for(int i=0; i<Br; i++)
			{
				for(int j=0; j<Bc; j++)
				{
					System.out.print(B[i][j]+" ");
				}
				System.out.print("\n");
			}

			System.out.println("\nMatrix Addition is ");
			MatrixAddition ma=new MatrixAddition();
			C = ma.MatrixAdd(A,B);                           //Calling Method MatrixAdd

			for(int i=0; i<Ar; i++)
			{
				for(int j=0; j<Ac; j++)
				{
					System.out.print(C[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
		else
			System.out.println("Matrix Multiplication is not possible");
	}
}
