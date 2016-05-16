/*
 * DFS
 */
package com.sam.leetcode;

public class Solution {
	public boolean exist(char[][] board,String word){
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				if(stepCal(board,i,j,word,0))
					return true;
			}
		}
		return false;
	}
	private boolean stepCal(char[][] board,int i,int j,String word,int step){
		if(step==word.length()) return true;
		if(i<0 || i>=board.length || j<0 || j>=board[i].length)
			return false;
		if(board[i][j]-word.charAt(step)!=0) return false;
		char record=board[i][j];
		board[i][j]='1';
		boolean res=stepCal(board,i-1,j,word,step+1) ||
				stepCal(board,i+1,j,word,step+1) ||
				stepCal(board,i,j-1,word,step+1) ||
				stepCal(board,i,j+1,word,step+1);
		board[i][j]=record;
		return res;
	}
}
