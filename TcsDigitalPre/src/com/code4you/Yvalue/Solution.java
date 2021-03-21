package com.code4you.Yvalue;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int[] num = new int[n+1];
		for (int i = 1; i <= n; i++) {
			int px = sc.nextInt();
			num[px]=i;
		}
		sc.close();
		for (int i = 1; i <= n; i++) {
			int y =num[num[i]];
			System.out.println(y);
		}

	}

}
