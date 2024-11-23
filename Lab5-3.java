package com.gsv.lab5;

class Product
{
	private int productId;
	private String name;
	private int categoryId;
	private double unitPrice;
	
	public Product(int productId,String name,int categoryId,double unitPrice)
	{
		this.productId = productId;
		this.name = name;
		this.categoryId = categoryId;
		this.unitPrice = unitPrice;
	}
	
	public int getProductId()
	{
		return productId;
	}
	public String getaName()
	{
		return name;
	}
	public int getCategoryId()
	{
		return categoryId;
	}
	public double getUnitPrice()
	{
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice)
	{
		this.unitPrice = unitPrice;
	}
	public void displayProductDetails()
	{
		System.out.println("Product ID:"+productId);
		System.out.println("Name:"+name);
		System.out.println("Category ID:"+categoryId);
		System.out.println("Unit Price: $"+unitPrice);
	}
}

class ElectricalProduct extends Product
{
	private String voltageRange;
	private int wattage;
	public ElectricalProduct(int productId, String name, int categoryId, double unitPrice,String voltageRange,int wattage) 
	{
		super(productId, name, categoryId, unitPrice);
		this.voltageRange = voltageRange;
		this.wattage = wattage;
	}
	
	public String getVoltageRange()
	{
		return voltageRange;
	}
	public int getWattage()
	{
		return wattage;
	}
	public void setWattage(int wattage)
	{
		this.wattage = wattage;
	}
	public void updateWattageAndPrice(int newWattage,double newPrice)
	{
		setWattage(newWattage);
		setUnitPrice(newPrice);
	}
	
	public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Voltage Range: " + voltageRange);
        System.out.println("Wattage: " + wattage + " W");
    }
}

public class exp3 
{
	public static void main(String[] args)
	{
		ElectricalProduct eProduct = new ElectricalProduct(101, "LED Bulb", 5, 20.0, "110-240V", 10);
		
		System.out.println("Original Electrical Product Details:");
		eProduct.displayProductDetails();
		
		eProduct.updateWattageAndPrice(15, 25.0);
		
		System.out.println("\nUpdated Electrical Product Details:");
		eProduct.displayProductDetails();
	}

}
