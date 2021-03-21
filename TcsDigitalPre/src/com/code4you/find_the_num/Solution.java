package com.code4you.find_the_num;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num range:");
		int p = sc.nextInt();
		int q = sc.nextInt();
		sc.close();
		
		ArrayList<Integer> theSpecialNumber = getTheSpecialNumber(p,q);
		
		for (Integer integer : theSpecialNumber) {
			System.out.print(integer+" ");
		}
	}

	private static ArrayList<Integer> getTheSpecialNumber(int p, int q) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = p; i <=q ; i++) {
			 
			if (i<4) {
				if (i==1) {
					list.add(i);
				}
			}else{
			int d = noOfDigits(i);
			int divFact = 1;
			for (int j = 0; j < d; j++) {
				divFact=divFact*10; 
				
			}
			int square = i*i;
			int lastdDig = square%divFact;
			int restDig = square/divFact;
			if (i==(restDig+lastdDig)) {
				list.add(i);
			}
			}
		}
		return list;
	}

	private static int noOfDigits(int i) {
		int count=0;
		while (i>0) {
			i=i/10;
			count++;
		}
		return count;
	}

}
