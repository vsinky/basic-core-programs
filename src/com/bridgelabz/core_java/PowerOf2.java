package com.bridgelabz.core_java;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:  ");
		// INITIALIZATION
		int num, mul = 1;
		num = sc.nextInt();

		// CONDITION CHECK
		if (num > 31) {
			System.out.println("value of number should be less than 31");
			return;
		}

		// COMPUTATION
		else {
			System.out.println(mul);
			for (int j = 1; j <= num; j++) {
				mul = mul * 2;
				System.out.println(mul);
			}
		}

	}

}