package com.code4you.max_video_game_pur;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter p, d,m,s:");
		int p = sc.nextInt();
		int d = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		sc.close();
		int games = numberOfGames(p,d,m,s);
		int games2= numberOfGames2(p,d,m,s);
		System.out.println("No of games bought: "+games2);
		System.out.println("No of games bought: "+games);
		}
	
	//2nd method
	private static int numberOfGames2(int p, int d, int m, int s) {
		int count = 0;
		int sum=0;
		while(sum<s && s-sum>=m){
			if(p>m){
			sum+=p;
			}else{
				sum+=m;
			}
			count++;
			p=p-d;
			
		}
		
		return count;
	}
	
	//1st method
	private static int numberOfGames(int p, int d, int m, int s) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(p);
		for (int i = 0; i < s; i++) {
			p=p-d;
			if (p>m) {
				list.add(p);
			}else {
				list.add(m);
			} 
		}
		
		int sum=0,count=0;
		for (int i = 0; i < list.size(); i++) {
			if (sum<s) {
				sum+=list.get(i);
				count++;
			} 
			
		}
		return count-1;
	}
	
}
