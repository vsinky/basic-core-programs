package com.bridgelabz.core_java;

import java.util.*;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Before Swapping numbers are: ");
		System.out.println("First Number is " + num1);
		System.out.println("Second Number is " + num2);
		num1 = num1 - num2;
		num2 = num1 + num2;
		num1 = num2 - num1;
		System.out.println("After Swapping numbers are: ");
		System.out.println("First Number is " + num1);
		System.out.println("Second Number is " + num2);
	}
}