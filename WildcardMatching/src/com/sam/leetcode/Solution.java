/*
 * Wildcard Matching
 * '?' matches any single char
 * '*' matches any sequence of chars
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
		//pArr last is '*', return true
		if(j==pArr.length-1 && pArr[j]=='*') return true;
		//pArr[j]==sArr[i]
		if(pArr[j]=='?' || sArr[i]==pArr[j]) 
			return isMatch(sArr,i+1,pArr,j+1);
		else if(pArr[j]=='*'){
			//pArr is '*',
			while(i<sArr.length){
				if(sArr[i]!=pArr[j+1]) i++;
				if(isMatch(sArr,i,pArr,j+1)) return true;
				i++;
			}
		}else return false;
		return false;
		
	}
}
