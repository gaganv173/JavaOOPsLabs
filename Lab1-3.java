package com.gsv.lab1;
import java.util.Scanner;

class BasicOperation
{
	void Summation(int a,int b,int c)
	{
		int sum = a+b+c;
		System.out.println("Summation = "+sum);
	}
	void Average(int a,int b,int c)
	{
		float avg = (float)((a+b+c)/3);
		System.out.println("Average = "+avg);
	}
	void Product(int a,int b,int c)
	{
		int prod = a*b*c;
		System.out.println("Product = "+prod);
	}
	void Largest(int a,int b,int c)
	{
		if(a>b&&a>c)
		{
			System.out.println(a+" is greatest of all three");
		}
		else if(b>c&&b>a)
		{
			System.out.println(b+" is greatest of all three");
		}
		else if(c>b&&c>a)
		{
			System.out.println(c+"is greatest of all three");
		}
		else
		{
			System.out.println("All three number are equal");
		}
	}
	
	void Smallest(int a,int b,int c)
	{
		if(a<b&&a<c)
		{
			System.out.println(a+" is smallest of all three");
		}
		else if(b<c&&b<a)
		{
			System.out.println(b+" is smallest of all three");
		}
		else if(c<b&&c<a)
		{
			System.out.println(c+" is smallest of all three");
		}
		else
		{
			System.out.println("All three number are equal");
		}

	}
}

public class exp3
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the all three number:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		BasicOperation basic_operation = new BasicOperation();
		basic_operation.Summation(a, b, c);
		basic_operation.Average(a, b, c);
		basic_operation.Product(a, b, c);
		basic_operation.Largest(a, b, c);
		basic_operation.Smallest(a, b, c);
	}
}