/*
 * ±©Á¦Ã¶¾Ù
 */
package com.sam.leetcode;

public class Solution {
	public String longestCommonPrefix(String[] strs){
		String common="";
		if(strs.length==0) return common;
		if(strs.length==1) return strs[0];
		if(strs[0].length()==0) return strs[0];
		for(int i=0;i<strs[0].length();i++){
			for(int j=0;j<strs.length;j++){
				if(strs[j].length()==i) return common;
				if(strs[j].charAt(i)!=strs[0].charAt(i)){
					return common;
				}
			}
			common+=strs[0].charAt(i);
		}
		return common;
	}
}
