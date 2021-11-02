/*
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
heads
c. O/P -> Percentage of Head vs Tails
*/

package com.bridgelabz.core_java;

import java.util.*;

public class FlipCoin {
	public static void main(String[] args) {

		int n = 1;
		int heads = 0;
		int tails = 0;
		Scanner sc = new Scanner(System.in);
		// INPUT DATA
		System.out.print("Enter no. of times to flip the coin: ");
		n = sc.nextInt();

		// COMPUTATION
		for (int i = 0; i < n; i++) {
			int flip = (int) ((Math.random() * 10) % 2);
			if (flip < 0.5)
				tails++;
			else
				heads++;
		}

		int Heads = (heads * n / 100);
		int Tails = (tails * n / 100);
		System.out.println("Percentage of heads: " + heads + "%");
		System.out.println("Percentage of tails: " + tails + "%");
	}
}
