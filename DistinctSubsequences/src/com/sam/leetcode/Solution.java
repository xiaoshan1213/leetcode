/*
 * dp
 */
package com.sam.leetcode;

public class Solution {
	public int numDistinct(String s,String t){
		int sl=s.length();
		int tl=t.length();
		int[][] dp=new int[tl+1][sl+1];
		//dp[t][s]
		for(int i=0;i<=sl;i++){
			dp[0][i]=1;
		}
		for(int j=1;j<=tl;j++){
			for(int k=1;k<=sl;k++){
				if(s.charAt(k-1)!=t.charAt(j-1)){
					dp[j][k]=dp[j][k-1];
					//s和t当前元素不等，则删除s当前元素后比较
				}else{
					dp[j][k]=dp[j][k-1]+dp[j-1][k-1];
					//s和t当前元素相等，要么都删除再比较，或者删除s当前元素比较
				}
			}
		}
		return dp[tl][sl];
	}
}
