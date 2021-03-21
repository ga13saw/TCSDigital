package com.code4you.no_of_divisor_in_num;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of test cases");
		int t = sc.nextInt();
		int[] arr = new int[t];
		System.out.println("Enter "+t+" numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			int num = arr[i];
			while (num>0) {
				int temp = num%10;
				
				if (temp!=0 && arr[i]%temp==0) {
					count++;
				}
				num=num/10;
			}
			System.out.println(count);
		}
	}
}
