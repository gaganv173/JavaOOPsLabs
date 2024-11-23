package com.gsv.lab2;
import java.util.Scanner;

class Employee
{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String firstName,String lastName,double monthlySalary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		if(monthlySalary>0)
		{
			this.monthlySalary = monthlySalary;
		}
		else
		{
			this.monthlySalary = 0.0;
		}
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to increase salary by a percentage
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * (percentage / 100);
        }
    }
}

public class exp3
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee("John", "Doe", 5000);
        Employee emp2 = new Employee("Jane", "Smith", 4500);

        System.out.println("Yearly Salary before hike:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": $" + emp2.getYearlySalary());

        emp1.increaseSalary(10);
        emp2.increaseSalary(10);

        System.out.println("\nYearly Salary after 10% hike:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": $" + emp2.getYearlySalary());
	}
}
