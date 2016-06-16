package com.sam.leetcode;

public class Solution {
	public int titleToNumber(String s){
		if(s==null) return 0;
		int len=s.length();
		int res=0;
		for(int i=0;i<len;i++){
			res=res*26+s.charAt(i)-'A'+1;
		}
		return res;
	}
}
