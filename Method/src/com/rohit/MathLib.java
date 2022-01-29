package com.rohit;

public class MathLib {
	
	public void showName() {
		System.out.println("MathLib");
	}
	public static int sum(int first, int second) {//sum,int,int
		int sum = first+second;
		return sum;
	}
	

	
	public int sum(int first, int second,int three) { //sum,int,int,int
		int sum = first+second+three;
		return sum;
	}
	
	
	//method signature -> methodName, parameters types
	
	
	public int mutiplyTwoNumber(int first, int second) {
		int product = first * second;
		return product;
	}
	

	
	public String concatenate(String first, String second) {
		String output = first + second;
		return output;
	}
	

	
	//  input -> METHOD -> output
	
	// return Type - Must

}
