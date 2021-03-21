package com.code4you.str;

public class Solution {

	public static void main(String[] args) {
		String str = "75Gb76xyC";
		String temp = "";
		for(int i =0;i<str.length();i++)
		{
		char ctemp = str.charAt(i);
		if((ctemp>='a' && ctemp<='z') || ( ctemp>='A' && ctemp<='Z'))
		{
		temp = temp + str.charAt(i);
		}
		}
		System.out.println(temp);

	}

}
