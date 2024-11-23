package com.gsv.lab4;

interface Function
{
	int evaluate(int x);
}

class Half implements Function
{

	@Override
	public int evaluate(int x) {
		// TODO Auto-generated method stub
		return x/2;
	}
	
}

public class exp6 {
	public static int[] processArray(int[] inputArray)
	{
		Half halfFunction = new Half();
		int[] resultArray = new int[inputArray.length];
		for(int i=0;i<inputArray.length;i++)
		{
			resultArray[i] = halfFunction.evaluate(inputArray[1]);
		}
		return resultArray; 
	}
	public static void main(String[] args)
	{
		int[] input = {10,20,30,40,50};
		int[] result = processArray(input);
		
		System.out.println("Processed array:");
		for(int value:result)
		{
			System.out.print(value+" ");
		}
	}
}
