package com.gsv.lab1;
import java.util.Scanner;

class Seprator
{
	int number;
	int num_digit=0;
	Seprator(int number)
	{
		this.number = number;
		while(number!=0)
		{
			number = number/10;
			num_digit++;
		}
	}
	int power(int base,int expo)
	{
		int product = 1;
		for(int i=1;i<=expo;i++)
		{
			product =product*base;		    
		}
		return product;
	}
	
	void sep_digit()
	{
		int temp_num = number;
		int ten_power = num_digit-1;
		while(ten_power>=0)
		{
			int display_num = temp_num/power(10,ten_power);
			temp_num = temp_num%power(10,ten_power);
			System.out.print(display_num+" ");
			ten_power--;
		}
	}
	
}

public class exp5
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number:");
		int num = scanner.nextInt();
		Seprator sep = new Seprator(num);
//		sep.display();
		sep.sep_digit();
	}
}