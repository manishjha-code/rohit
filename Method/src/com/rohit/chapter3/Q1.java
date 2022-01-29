package com.rohit.chapter3;

public class Q1 {

	public static void main(String[] args) {
		int meal = 5;
		int tip = 2;
		int total = meal + (meal>6 ? ++tip : --tip); //total = 5+(5
		
		System.out.println(tip);

	}

}
