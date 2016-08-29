package com.sam.leetcode;

public class Solution {
	public void rotate(int[][] matrix){
		/*
		 * 1 2 - 3 1
		 * 3 4 - 4 2
		 * 
		 * 123 - 741 
		 * 456 - 852
		 * 789 - 963
		 * 
		 * horizontal-vertical 1/4¾ØÕó½øÐÐÐý×ª
		*/
		int n=matrix.length;
		for(int i=0;i<n/2;i++)
			for(int j=i;j<n-i-1;j++){
				int temp=matrix[i][j];
				matrix[i][j]=matrix[n-j-1][i];
				matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
				matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
				matrix[j][n-i-1]=temp;
			}
	}
}
