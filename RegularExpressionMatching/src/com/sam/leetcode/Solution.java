/*
 *  '.' matches any single character
 *  '*' matches zero or more 
 */
package com.sam.leetcode;

public class Solution {
	public boolean isMatch(String s,String p){
		if(s==null || p==null) return false;
		char[] sArr=s.toCharArray();
		char[] pArr=p.toCharArray();
		return isMatch(sArr,0,pArr,0);
	}
	private boolean isMatch(char[] sArr,int i,char[] pArr,int j){
		if(j==pArr.length) return i==sArr.length;
		//1. p[j+1]!='*'
		if(j==pArr.length-1 || pArr[j+1]!='*'){
			//s[i]==p[j] move on
			if(i<sArr.length && (pArr[j]=='.' || sArr[i]==pArr[j]))
				return isMatch(sArr,i+1,pArr,j+1);
			//error
			else return false;
		}
		//2. p[j+1]=='*'
		while(i<sArr.length && (pArr[j]=='.' || sArr[i]==pArr[j])){
			//跳过p[j]p[j+1]的a*组合，匹配下一个S和p，匹配成功则返回；否则i++
			if(isMatch(sArr,i,pArr,j+2)) return true;
			i++;
		}
		//s[i]!=p[j] a*组合为空，继续匹配
		return isMatch(sArr,i,pArr,j+2);
	}
}
