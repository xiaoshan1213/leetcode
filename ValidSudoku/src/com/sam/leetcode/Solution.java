package com.sam.leetcode;

public class Solution {
	public boolean isValidSudoku(char[][] board){
		int[] col=new int[9];
		int[] row=new int[9];
		int[] blc=new int[9];
		int idx=0;
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(board[i][j]!='.'){
					idx=1<<(board[i][j]-'0');
					if((col[j]&idx)>0 || (row[i]&idx)>0 || ((blc[(i/3)*3+j/3])&idx)>0)
						return false;
					row[i]|=idx;
					col[j]|=idx;
					blc[(i/3)*3+j/3]|=idx;
				}
			}
		}
		return true;
	}
	public static void main(String[] args){
		System.out.print(3&6);
	}
}
