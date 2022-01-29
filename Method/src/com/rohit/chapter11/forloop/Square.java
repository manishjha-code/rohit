package com.rohit.chapter11.forloop;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("provide input number :");
		int maxNumber = keyboard.nextInt();
		
		System.out.println("Print using for"); 
		for(int i = 1; i <=maxNumber;i++) {
			int product = i *i;
			System.out.println("Square of "+i +" = "+product);
		}

		System.out.println("Print using while");
		int i = 1;
		
		while( i <=maxNumber) {
			int product = i *i;
			System.out.println("Square of "+i +" = "+product);
			i++;
		}

	}

}
