package com.gsv.lab4;

import java.util.HashMap;
import java.util.Scanner;

public class exp3 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        
        System.out.println("Enter the threshold (n):");
        int n = scanner.nextInt();

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }

        System.out.println("Characters exceeding " + n + " occurrences:");
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > n) {
                System.out.println(c + " -> " + charCountMap.get(c));
            }
        }

        scanner.close();
    }
}
