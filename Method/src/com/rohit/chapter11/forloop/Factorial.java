package com.rohit.chapter11.forloop;

public class Factorial {

	public static void main(String[] args) {
		int factorial = 1;
		int num = 5;
		
		for (int i= 1; i<=num; i++) {
			factorial = factorial * i;
			System.out.println("factorial : "+i+" = "+factorial);
		}
		System.out.println("factorial : "+factorial);
		
		factorial = 1;
		
		int i= 1; 
		while (i<=num ) {
			factorial = factorial * i;
			System.out.println("factorial : "+i+" = "+factorial);
			i++;
		}
		System.out.println("factorial : "+factorial);
		
		
		factorial = 1;
		i= num; 
		while (i!=0 ) {
			factorial = factorial * i;
			//System.out.println("factorial : "+i+" = "+factorial);
			i--;
		}
		System.out.println("factorial : "+factorial);
	}

}
