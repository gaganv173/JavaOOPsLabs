package com.gsv.lab1;
import java.util.Scanner;

class Compare
{
	void compare(int a,int b)
	{
		if(a>b)
		{
			System.out.println(a+"is greater than "+b);
		}
		else if(a<b)
		{
			System.out.println(b+" is greater than "+a);
		}
		else
		{
			System.out.println("both number are equal");
		}
	}
	
}

public class exp2
{
	public static void main(String[] args)
	{
//		System.out.println("Hello");
		Scanner scanner = new Scanner(System.in);
		Compare com = new Compare();
		System.out.print("Please enter the number that you want to compare: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		com.compare(a, b);
	}
}