package com.gsv.lab5;

class Fruit
{
	private String name;
	private String type;
	private double price;
	
	public Fruit(String name,String type,double price)
	{
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public void displayFruit()
	{
		System.out.println("Fruit Name: "+ name);
		System.out.println("Type: "+type);
		System.out.println("Price: $"+price);
		System.out.println("------------------");
	}
}

public class exp5 {
	public static void main(String[] args)
	{
		Fruit apple = new Fruit("Apple","Single",0.75);
		Fruit banana = new Fruit("Banana","Bunch",1.50);
		
		System.out.println("Fruit 1 Details:");
		apple.displayFruit();
		
		System.out.println("Fruit 2 Details:");
		banana.displayFruit();
	}
}
