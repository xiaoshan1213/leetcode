package com.sam.leetcode;

public class Solution {
	public boolean isPalindrome(int x){
		if(x<0) return false;
		if(x<10) return true;
		if(x%10==0) return false;
		int v;
		v=x%10;
		x=x/10;
		while(x>v){
			v=v*10+x%10;
			x=x/10;
		}
		if(v>x) v=v/10;
		return v==x?true:false;
		
	}
}
