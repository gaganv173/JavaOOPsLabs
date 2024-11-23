package com.gsv.lab2;

class Invoice
{
	String partNumber;
	String partDescription;
	int item_purchased;
	double price_item;
	
	public Invoice(String partNumber,String partDescription,int item_purchased,double price_item)
	{
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.item_purchased = item_purchased;
		this.price_item = price_item;
	}
	
	public void SetpartNumber(String partNumber)
	{
		this.partNumber = partNumber;
	}
	public void SetpartDesction(String partDescription)
	{
		this.partDescription = partDescription;
	}
	public void Setitem_purchased(int item_purchased)
	{
		this.item_purchased = item_purchased; 				
	}
	public void SetpriceItem(int price_item)
	{
		this.price_item = price_item;
	}
	
}

public class exp2
{
	public static void main(String[] args)
	{
		
	}
}