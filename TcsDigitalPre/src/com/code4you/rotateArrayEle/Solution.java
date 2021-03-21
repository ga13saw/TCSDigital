package com.code4you.rotateArrayEle;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
		int n = sc.nextInt();	//no. of element in array
		int k = sc.nextInt();	//no. of rotation
		int q = sc.nextInt();
		int[] arr = new int[n];
		int rot =k%n;
		System.out.println("enter "+n+" numbers");
		for (int i=0;i<n;i++ ) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < q; i++) {
			int x = sc.nextInt();
			if (x-rot>=0) {
				System.out.println(arr[x-rot]);
			}else {
				System.out.println(arr[x-rot+arr.length]);
			}
		}
	}
}