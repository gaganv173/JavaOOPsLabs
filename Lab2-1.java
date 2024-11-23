package com.gsv.lab2;
import java.util.Scanner;

class AmountSaved
{
	int miles_driven;
	int cost_petrol; 
	int avrage_fee;
	int tolls;
	AmountSaved(int miles_driven,int cost_petrol,int avrage_fee,int tolls)
	{
		this.miles_driven = miles_driven;
		this.cost_petrol = cost_petrol;
		this.avrage_fee = avrage_fee;
		this.tolls = tolls;
	}
	void amount_saved()
	{
		int saveing = ((miles_driven*cost_petrol)+avrage_fee)-tolls;
		System.out.println("Amount you save by car pooling is "+saveing);
	}
}

public class exp1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter how many miles you drrive:");
		int md = scanner.nextInt();
		System.out.println("Please Enter mileage:");
		int mil=scanner.nextInt();
		System.out.println("Please enter avg.fee:");
		int afee = scanner.nextInt();
		System.out.println("Please enter tolls:");
		int t_ll = scanner.nextInt();
		
		AmountSaved as = new AmountSaved(md,mil,afee,t_ll);
		as.amount_saved();	
	}
}