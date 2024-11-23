
import java.util.Scanner;


class Add
{
	int result;
	Add(int a,int b)
	{
		result = a+b;
	}
	public void display()
	{
		System.out.println("Addition Result: "+result);
	}
}

class Subtract
{
	int result;
	Subtract(int a,int b)
	{
		result = a-b;
	}
	public void display()
	{
		System.out.println("Subtraction Result: "+result);	
	}
}

class Multiply
{
	int result;
	Multiply(int a,int b)
	{
		result = a*b;
	}
	public void display()
	{
		System.out.println("Multiplication Result: "+result);
	}
}

class Quotinent
{
	int result;
	Quotinent(int a,int b)
	{
		result = a%b;
	}
	public void display() 
	{
		System.out.println("Quotinent Result: "+result);
	}
}

class Divide
{
	float result;
	Divide(int a,int b)
	{
		result = (float)a/(float)b;
	}
	public void display()
	{
		System.out.println("Division Result: "+result);
	}
}

public class TwoInteger
{
	public static void main(String[] args)
	{		
		System.out.println("Hello");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the First number");
		int a = scanner.nextInt();
		System.out.println("Please enter the second number");
		int b = scanner.nextInt();
		
		Add add = new Add(a,b);
		add.display();
		
		Subtract sub = new Subtract(a,b);
		sub.display();
		
		Multiply mul = new Multiply(a,b);
		mul.display();
		
		Divide div = new Divide(a,b);
		div.display();
		
		Quotinent qut = new Quotinent(a,b);
		qut.display();
	}
}