package com.gsv.lab4;

import java.util.HashSet;
import java.util.Scanner;

public class exp4 {
	public static boolean isPerfectString(String input) {
        HashSet<Character> charSet = new HashSet<>();
        
        for (char c : input.toCharArray()) {
            if (charSet.contains(c)) {
                return false; 
            }
            charSet.add(c);
        }
        return true;
    }
	public static void main(String[] args)
	{
		System.out.println("Hello");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		if(isPerfectString(str))
		{
			System.out.print("This string is a prefect string");
		}
		else
		{
			System.out.println("This string is not prfect");
		}
	}
}
