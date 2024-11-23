package com.gsv.lab4;

import java.util.Scanner;

public class exp5 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range (a b):");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter patter");
		String pattern = scanner.nextLine();
		
		int count=0;
		for(int i=a;i<=b;i++)
		{
			if(String.valueOf(i).contains(pattern))
			{
				count++;
			}
		}
		System.out.println("The number of times "+pattern+" ocurred between "+a+" "+b+": "+count);
	}
}
