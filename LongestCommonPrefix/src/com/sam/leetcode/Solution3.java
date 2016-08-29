/*
 * sort first
 */
package com.sam.leetcode;

import java.util.Arrays;

public class Solution3 {
	public String longestCommonPrefix(String[] strs){
		Arrays.sort(strs);
		char[] first=strs[0].toCharArray();
		char[] last=strs[strs.length-1].toCharArray();
		int i=0,len=Math.min(first.length, last.length);
		while(i<len && first[i]==last[i]) i++;
		return strs[0].substring(0,i);
	}
}
