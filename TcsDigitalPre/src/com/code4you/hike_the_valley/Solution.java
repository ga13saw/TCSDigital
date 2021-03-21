package com.code4you.hike_the_valley;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of steps");
		int s = sc.nextInt();
		System.out.println("Enter path in D or U:");
		String path = sc.next();
		sc.close();
		int level=0;
		int count=0;
		int temp=0;
		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i)=='D') {
				temp=level;
				level--;
			}else {
				temp=level;
				level++;
			}
			//velly count will increase if level earlier value 'temp' is negative and current 
			//'level' is zero. this indicates that we had came across a velly.
			if (level==0 && temp<0) {
				count++;
			}
		}
		System.out.println("No of velly "+count);
	}

}
