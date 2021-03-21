package com.code4you.sum_of_sub_square;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and cols & subarray size k: ");
		int rowsCols = sc.nextInt();
		int k = sc.nextInt();
		int[][] arr = new int[rowsCols][rowsCols];
		int p = rowsCols;
		
		for (int i = 0; i < rowsCols; i++) {
			System.out.println("enter row's of matrix value:\n");
			for (int j = 0; j < rowsCols; j++) {
				
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		sc.close();
		
		/*int[][] arr = { {1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				};*/
		//int k = 2;
		
		printSumOfElement(arr,k);

	}

	private static void printSumOfElement(int[][] arr, int k) {
		int n = arr.length;
		if(k>n){
			return;
		}
		for (int i = 0; i < n-k+1; i++) {
			for (int j = 0; j < n-k+1; j++) {
				int sum=0;
				for (int p = i; p < k+i; p++) {
					for (int l = j; l < k+j; l++) {
						sum+=arr[p][l];
					}
				}
				System.out.print(sum+" ");
			}
			System.out.println("");
		}
		
	}

}
