package com.code4you.max_sub_natrix;

public class MaximumSizeSquare {

	public static void main(String[] args) {
		int[][] arr = {{0, 1, 1, 0, 1},
				  {1, 1, 0, 1, 0},
				  {0, 1, 1, 1, 0},
				  {1, 1, 1, 1, 0},
				  {1, 1, 1, 1, 1},
				  {0, 0, 0, 0, 0}};
		
		//int[][] arr = {{1,0,0,1,0},  {1,1,1,1,1},{1,0,1,1,1}, {0,0,1,1,0} , {1,1,1,1,1}};
		
		printMaxSubSquare(arr);

	}

	private static void printMaxSubSquare(int[][] arr) {
		
		int rows = arr.length;
		int cols = arr[0].length;
		
		int[][] tempArr = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			tempArr[i][0] = arr[i][0];
		}
		for (int i = 0; i < cols; i++) {
			tempArr[0][i]=arr[0][i];
		}
		
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (arr[i][j]==1) {
					tempArr[i][j]=Math.min(tempArr[i][j-1],Math.min(tempArr[i-1][j], tempArr[i-1][j-1]))+1;
				}else{
					tempArr[i][j]=0;
				}
				
			}
		}
		
		int tempMaxS = tempArr[0][0];
		int max_i=0;
		int max_j=0;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (tempMaxS<tempArr[i][j]) {
					tempMaxS = tempArr[i][j];
					max_i = i;
					max_j = j;
				}
			}
		}
		
		for (int i = max_i; i > max_i-tempMaxS; i--) {
			for (int j = max_j; j > max_j-tempMaxS; j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}
	
	
}
