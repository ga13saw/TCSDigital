package com.code4you.Loaves_Distribution;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects in the bread line:");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " breadlines");
		int[] loaves = new int[n];
		for (int i = 0; i < loaves.length; i++) {
			loaves[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < loaves.length - 1; i++) {
			if (isEven(loaves[i])) {
				continue;
			} else {
				loaves[i]++;
				loaves[i + 1]++;
				count += 2;
			}
		}
		if (isEven(loaves[loaves.length - 1])) {
			System.out.println("the minimum number of loaves: " + count);
		} else {
			System.out.println("NOT Possible");
		}
	}

	private static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
}
