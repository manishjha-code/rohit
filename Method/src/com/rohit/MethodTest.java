package com.rohit;

public class MethodTest {

	public static void main(String[] args) {
		
		
		
		int sum = MathLib.sum(8, 18);
		
		System.out.println("sum = "+sum);
		
		MathLib mathLib = new MathLib();


		
		int sum1 = mathLib.sum(8, 18,5);
		
		System.out.println("sum = "+sum1);

		
		int product = mathLib.mutiplyTwoNumber(8, 18);	
		
		System.out.println("product = "+product);

		mathLib.showName();
	}

}
