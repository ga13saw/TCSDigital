package com.code4you.min_gift_cost;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of test cases:");
		int t = sc.nextInt();
		System.out.println("Enter number of black and white gifts and their price");
		int[] minPrice=new int[t];
		for (int i = 0; i < t; i++) {
			
			int bg = sc.nextInt();
			int wg = sc.nextInt();
			int bgp = sc.nextInt();
			int wgp = sc.nextInt();
			int gcp = sc.nextInt();
			
			minPrice[i]= Math.min(bg*bgp+wg*wgp, Math.min(bg*bgp+wg*bgp+wg*gcp, bg*wgp+wg*wgp+bg*gcp));
			
		}
		for (int i : minPrice) {
			System.out.println(i);
		}
		
		}
	
}
