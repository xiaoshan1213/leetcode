/*
 * 1.discard whitespace
 * 2.ignore the rest char
 * 3.within MAX_INT MIN_INT
 */
package com.sam.leetcode;

public class Solution {
	public int myAtoi(String str){
		if(str==null) return 0;
		int i=0;
		boolean isPositive=true;
		int positiveCount=0;
		while(i<str.length()){
			if(positiveCount==0 && str.charAt(i)==' '){
				//do nothing
			}else if(positiveCount==0 && (str.charAt(i)=='+' || str.charAt(i)=='-')){
				isPositive=str.charAt(i)=='+'?true:false;
				positiveCount++;
			}else if(str.charAt(i)<'0' || str.charAt(i)>'9'){
				return 0;
			}else break;
			i++;
		}
		int res=0;
		while(i<str.length()){
			if(str.charAt(i)<'0'|| str.charAt(i)>'9') break;
			int digit=str.charAt(i)-'0';
			//judge the boundary
			if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10)){
				if(isPositive) return Integer.MAX_VALUE;
				else return Integer.MIN_VALUE;
			}
			res=res*10+digit;
			i++;
		}
		return isPositive?res:-res;
	}
}
