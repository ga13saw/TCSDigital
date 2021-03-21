package com.code4you.pangram;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str1 = sc.nextLine();
		sc.close();
		secondFreqChar(str1);
		System.out.println("2nd mtd: "+secondFreqChar2(str1));
		secondFreqChar3(str1);
	}

	private static void secondFreqChar3(String str1) {
		int[] charCount = new int[26];
		String lowerCase = str1.toLowerCase();
		for (int i = 0; i < lowerCase.length(); i++) {
			if (lowerCase.charAt(i)>='a' && lowerCase.charAt(i)<='z') {
				charCount[lowerCase.charAt(i)-'a']++;
			}
		}
		
		int first=charCount[0]>charCount[1]?0:1;
		int second=charCount[0]>charCount[1]?1:0;
		
		for (int i = 2; i < charCount.length; i++) {
			if (charCount[i]!=0) {
			
				if(charCount[i+2]>charCount[first]){
					second=first;
					first=i+2;
					
				}else if(charCount[i+2]!=charCount[first]&&charCount[i+2]>charCount[second]){
					second=i+2;
				}
			}
		}
		if (second==0) {
			System.out.println("No Second most frequent character");
			
		}else{
		char sec = (char)(second + 'a');
		System.out.println(sec);
		
		}
		
	}

	private static char secondFreqChar2(String str1) {
		int CHARS = 256;
		  int[] ch = new int[CHARS];
		    for (int i = 0; i < str1.length (); i++)
		        (ch[str1.charAt (i)])++;
		    int ch_first = 0, ch_second = 0;
		    for (int i = 0; i < CHARS; i++)
		      {
			if (ch[i] > ch[ch_first])
			  {
			    ch_second = ch_first;
			    ch_first = i;
			  }
			else if (ch[i] > ch[ch_second] && ch[i] != ch[ch_first])
			    ch_second = i;
		      }
		    return (char) ch_second;
		
		
	}

	private static char secondFreqChar(String str1) {
		
		int[] charCount = new int[26];
		String lowerCase = str1.toLowerCase();
		for (int i = 0; i < lowerCase.length(); i++) {
			if (lowerCase.charAt(i)>='a' && lowerCase.charAt(i)<='z') {
				charCount[lowerCase.charAt(i)-'a']++;
			}
		}
		//[1, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 0, 0, 1, 0, 2, 0, 1, 2, 2, 0, 1, 0, 0, 0, 0]
		int first=charCount[0]>charCount[1]?0:1;
		int second=charCount[0]>charCount[1]?1:0;
		
		
		int count =0;
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i]!=0) {
				if (charCount[i]==1) {
					count++;
				}
				if(charCount[i+2]>charCount[first]){
					second=first;
					first=i+2;
					
				}else if(charCount[i+2]<charCount[first]&&charCount[i+2]>charCount[second]){
					second=i+2;
				}
			}
		}
		if (count==lowerCase.length()) {
			System.out.println("No Second most frequent character");
			return 0;
		}else{
		char sec = (char)(second + 'a');
		System.out.println(sec);
		return sec;
		}
	}

}
