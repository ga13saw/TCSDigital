package com.code4you.sencondFreqChar;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// scanner object to accept value from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String to chenck pangram: \n");
		
		String isStrPan = sc.nextLine();
		sc.close();

		System.out.println(isStringPangram(isStrPan));
		/*if (isStringPangram2(isStrPan)==26) {
			System.out.println("String is pangram");
		}else {
			System.out.println("String is not pangram");
		}*/
		

	}

	/*private static int isStringPangram2(String isStrPan) {
		int count=0;
		String lowerCase = isStrPan.toLowerCase();
		for (int i = 0; i < isStrPan.length(); i++) {
			
			if (lowerCase.charAt(i)>='a' && isStrPan.charAt(i)<='z' ) {
				count++;
			}
		}
		return count;
		
	}*/

	private static boolean isStringPangram(String isStrPan) {
		boolean[] charPresence = new boolean[26];
		
		for (int i = 0; i < isStrPan.length(); i++) {
			if (isStrPan.charAt(i)>='A' && isStrPan.charAt(i)<='Z' ) {
				charPresence[isStrPan.charAt(i) - 'A']=true;
			}
			if (isStrPan.charAt(i)>='a' && isStrPan.charAt(i)<='z' ) {
				charPresence[isStrPan.charAt(i) - 'a']=true;
			}
		}
		
		for (int i = 0; i < charPresence.length; i++) {
			if (charPresence[i]==false) {
				return false;
			}
			
	}
		return true;
	}

}
