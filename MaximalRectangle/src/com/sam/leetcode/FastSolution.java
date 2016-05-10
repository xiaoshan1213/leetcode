/*
 * array replace stack
 */
package com.sam.leetcode;

public class FastSolution {
	public int maximalRectangle(char[][] matrix){
		int m=matrix.length,n;
		if(m==0 || (n=matrix[0].length)==0){
			return 0;
		}
		int i,j,res=0;
		int[] heights=new int[n];
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				if(matrix[i][j]=='0'){
					heights[j]=0;
				}else{
					heights[j]+=1;
				}
			}
			res=Math.max(res, largestRectangleArea(heights));
		}
		return res;
	}
	public int largestRectangleArea(int[] heights){
		int n=heights.length;
		int[] lefts=new int[n];
		lefts[0]=1;
		int pre=0,res=0;
		for(int i=1;i<n;i++){
			lefts[i]=1;
			while(pre>=0 && heights[i]<heights[pre]){
				res=Math.max(res, heights[pre]*(lefts[pre]+i-pre-1));
				lefts[i]+=lefts[pre];
				pre=pre-lefts[pre];
			}
			if(pre>=0 && heights[i]==heights[pre]){
				lefts[i]+=lefts[pre];
			}
			pre=i;
		}
		while(pre>=0 && heights[pre]>0){
			res=Math.max(res,heights[pre]*(lefts[pre]+n-pre-1));
			pre=pre-lefts[pre];
		}
		return res;
	}
}
