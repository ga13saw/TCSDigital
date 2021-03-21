package com.code4you.cloudjump;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
		int n = sc.nextInt();	//no. of clouds
		int k = sc.nextInt();	//jump step
		int e=100;
		int[] cloudType = new int[n];
		System.out.println("enter 8 clouds");
		for (int i = 0; i < n; i++) {
			cloudType[i]=sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < n; i+=k) {
			if (cloudType[i]==0) {
				e-=1;
			}else {
				e-=3;
			}
		}
		System.out.println(e);
		
	}
}