import java.io.*;

abstract class Shape
{
	abstract double calc_area();
	abstract double calc_volume();
}

class Sphere extends Shape
{
	double radius;	
	void input() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter radius : ");
		while(true)
		{
			radius = Double.parseDouble(br.readLine());
			if(radius>=0)
				break;
			else
				System.out.print("Radius cannot be negative, re-enter radius : ");
		}
	}	
	double calc_area()
	{
		return 4*Math.PI*Math.pow(radius,2);
	}
	double calc_volume()
	{
		return ((double)4/3)*Math.PI*Math.pow(radius,3);
	}
}
class Cone extends Shape
{
	double radius,height;
	void input() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter radius : ");
		while(true)
		{
			radius = Double.parseDouble(br.readLine());
			if(radius>=0)
				break;
			else
				System.out.print("Radius cannot be negative, re-enter radius : ");
		}
		System.out.print("Enter height : ");
		while(true)
		{
			height = Double.parseDouble(br.readLine());
			if(height>=0)
				break;
			else
				System.out.print("Height cannot be negative, re-enter height : ");
		}
	}
	double calc_area()
	{
		return Math.PI*radius*(radius+Math.pow(height*height+radius*radius,0.5));
	}
	double calc_volume()
	{
		return (double)(Math.PI*Math.pow(radius,2)*height/3);
	}
}

class Cylinder extends Shape
{
	double radius,height;
	void input() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter radius : ");
		while(true)
		{
			radius = Double.parseDouble(br.readLine());
			if(radius>=0)
				break;
			else
				System.out.print("Radius cannot be negative, re-enter radius : ");
		}
		System.out.print("Enter height : ");
		while(true)
		{
			height = Double.parseDouble(br.readLine());
			if(height>=0)
				break;
			else
				System.out.print("Height cannot be negative, re-enter height : ");
		}
	}
	double calc_area()
	{
		return 2*Math.PI*radius*(height+radius);
	}
	double calc_volume()
	{
		return Math.PI*Math.pow(radius,2)*height;
	}
}

class Box extends Shape
{
	double length,breadth,height;
	void input() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter length : ");
		while(true)
		{
			length = Double.parseDouble(br.readLine());
			if(length>=0)
				break;
			else
				System.out.print("Length cannot be negative, re-enter length : ");
		}
		System.out.print("Enter breadth : ");
		while(true)
		{
			breadth = Double.parseDouble(br.readLine());
			if(breadth>=0)
				break;
			else
				System.out.print("Breadth cannot be negative, re-enter breadth : ");
		}
		System.out.print("Enter height : ");
		while(true)
		{
			height = Double.parseDouble(br.readLine());
			if(height>=0)
				break;
			else
				System.out.print("Height cannot be negative, re-enter height : ");
		}
	}
	double calc_area()
	{
		return 2*(length*breadth+breadth*height+length*height);
	}
	double calc_volume()
	{
		return length*breadth*height;
	}
}

		
class Asst3Q2
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("\n-----------------------------------------------------------------------");
		
		System.out.println("Sphere : ");
		Sphere sp=new Sphere();
		sp.input();
		System.out.format("Area of Sphere : %.2f",sp.calc_area());
		System.out.format("\nVolume of Sphere : %.2f",sp.calc_volume());
		System.out.println("\n-----------------------------------------------------------------------");
		
		System.out.println("Cone : ");
		Cone co=new Cone();
		co.input();
		System.out.format("Area of Cone : %.2f",co.calc_area());
		System.out.format("\nVolume of Cone : %.2f",co.calc_volume());
		System.out.println("\n-----------------------------------------------------------------------");
		
		System.out.println("Cylinder : ");
		Cylinder cy=new Cylinder();
		cy.input();
		System.out.format("Area of Cylinder : %.2f",cy.calc_area());
		System.out.format("\nVolume of Cylinder : %.2f",cy.calc_volume());
		System.out.println("\n-----------------------------------------------------------------------");
		
		System.out.println("Box : ");
		Box b=new Box();
		b.input();
		System.out.format("Area of Box : %.2f",b.calc_area());
		System.out.format("\nVolume of Box : %.2f",b.calc_volume());
		System.out.println("\n-----------------------------------------------------------------------");
	}
}
