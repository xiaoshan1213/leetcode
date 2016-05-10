package com.sam.leetcode;

import java.util.Stack;

public class Solution {
	public int maximalRectangle(char[][] matrix){
		if(matrix.length<=0 || matrix[0].length<=0){
			return 0;
		}
		int m=matrix.length;
		int n=matrix[0].length+1;
		int h=0,w=0,result=0;
		int[] height=new int[n];
		for(int i=0;i<m;i++){
			Stack<Integer> stack=new Stack<>();
			for(int j=0;j<n;j++){
				if(j<n-1){
					if(matrix[i][j]=='1') height[j]+=1;
					else height[j]=0;
				}
				while(!stack.isEmpty() && height[stack.peek()]>=height[j]){
					h=height[stack.pop()];
					w=stack.isEmpty()?j:j-stack.peek()-1;
					if(h*w>result) result=h*w;
				}
				stack.push(j);
			}
		}
		return result;
	}
}
