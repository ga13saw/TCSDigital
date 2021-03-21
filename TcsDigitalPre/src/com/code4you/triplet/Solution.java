package com.code4you.triplet;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length and diffrence:");
		int len = sc.nextInt();
		int diff = sc.nextInt();
		
		System.out.println("enter numbers:");
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < len; i++) {
			
			list.add(sc.nextInt());
		}
		int count=0;
		for (int i = 0; i < len; i++) {
			if (list.contains((list.get(i)+diff)) && list.contains(list.get(i)+2*diff)) {
				count++;
			}
		}
		System.out.println(count);
		}
	
}
