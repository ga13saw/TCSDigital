package com.code4you.common_subsequence;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string:\n");
		String str1 = sc.nextLine();
		System.out.println("Enter second string:\n");
		String str2 = sc.nextLine();
		sc.close();
		
		countCommonSubsequence(str1,str2);
	}

	private static void countCommonSubsequence(String str1, String str2) {

		int str1Len = str1.length();
		int str2Len = str2.length();
		
		int[][] countArr = new int[str1Len+1][str2Len+1];
		
		for (int i = 1; i <= str1Len; i++) {
			for (int j = 1; j <= str2Len; j++) {
				if (str1.charAt(i-1) == str2.charAt(j-1)) {
					countArr[i][j] = 1+countArr[i-1][j]+countArr[i][j-1];
				}else{
					countArr[i][j] = countArr[i-1][j]+countArr[i][j-1]-countArr[i-1][j-1];
				}
			}
		}
		
		for (int i = 0; i < str1Len; i++) {
			for (int j = 0; j < str2Len; j++) {
				
					System.out.print(countArr[i][j]+" ");
				}
			System.out.println();
			}
		
		System.out.println(countArr[str1Len][str2Len]);
	}

}









