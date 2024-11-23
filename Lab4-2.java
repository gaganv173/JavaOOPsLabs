package com.gsv.lab4;

import java.util.Scanner;

public class exp2 {
	
	public static boolean isValidPassword(String password)
	{
		if(password.length()<5||password.length()>12)
		{
			return false;
		}
		boolean hasLowerCase = false;
		boolean hasDigit = false;
		
		for(int i =0;i<password.length();i++)
		{
			char ch = password.charAt(i);
			if(Character.isUpperCase(ch))
			{
				return false;
			}
			if(!Character.isLetterOrDigit(ch))
			{
				return false;
			}
			if(Character.isLowerCase(ch))
			{
				hasLowerCase = true;
			}
			if(Character.isDigit(ch))
			{
				hasDigit = true;
			}
			if(i>0&&password.charAt(i)==password.charAt(i-1))
			{
				return false;
			}
		}
		for(int i=0;i<password.length()-2;i++)
		{
			String pattern = password.substring(i,i+2);
			if(password.indexOf(pattern,i+2)!=-1)
			{
				return false;
			}
		}
		return hasLowerCase&&hasDigit;
	}
	
	public static void main(String[] args)
	{
		String[] passwords = {
	            "abcanan1",   // Not acceptable (immediate pattern "an an")
	            "abc11se",    // Not acceptable (immediate pattern "11")
	            "123sd123",   // Acceptable
	            "adfasdsdf",  // Not acceptable (no digits)
	            "Aasdfasd12", // Not acceptable (uppercase character)
	            "abc1d"       // Acceptable
	        };
		 for (String password : passwords) {
	            System.out.println("Password: " + password + " -> " + (isValidPassword(password) ? "Valid" : "Invalid"));
	        }
	}
}
