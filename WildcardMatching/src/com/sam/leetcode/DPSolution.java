package com.sam.leetcode;

public class DPSolution {
	public boolean isMatch(String s,String p){
		int m=s.length(),n=p.length();
		char[] sArr=s.toCharArray();
		char[] pArr=p.toCharArray();
		boolean[][] dp=new boolean[m+1][n+1];
		dp[0][0]=true;
		for(int j=1;j<=n;j++)
			dp[0][j]=dp[0][j-1] && pArr[j-1]=='*';
		for(int i=1;i<=m;i++)
			dp[i][0]=false;
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(pArr[j-1]=='?' || (pArr[j-1]==sArr[i-1]))
					dp[i][j]=dp[i-1][j-1];
				else if(pArr[j-1]=='*')
					dp[i][j]=dp[i-1][j] || dp[i][j-1];
			}
		}
		return dp[m][n];
	}
}
