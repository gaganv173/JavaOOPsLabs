package com.gsv.lab1;
import java.util.Scanner;

class Circle
{
	float radius;
	Circle(float radius)
	{
		this.radius = radius;
	}
	void Diameter()
	{
		float diameter = 2*radius;
		System.out.println("Diameter= "+diameter);
	}
	void Circumference()
	{
		float circumference = 2*(float)(Math.PI)*radius;
		System.out.println("Circumference= "+circumference);		
	}
	void Area()
	{
		float area = (float)(Math.PI)*radius*radius;
		System.out.println("Area= "+area);
	}
}

public class exp4
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle:");
		float Rad = scanner.nextFloat();
		Circle cir = new Circle(Rad);
		cir.Diameter();
		cir.Circumference();
		cir.Area();
	}
}