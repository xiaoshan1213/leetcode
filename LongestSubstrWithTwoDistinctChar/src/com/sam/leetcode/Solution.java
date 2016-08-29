package com.sam.leetcode;

public class Solution {
	public int lengthOfLongestSubstringTwoDIstinct(String s){
		int i=0,j=-1,max=0;
		for(int k=1;k<s.length();k++){
			//k为尾坐标
			if(s.charAt(k)==s.charAt(k-1)) continue;
			if(j>=0 && s.charAt(j)!=s.charAt(k)){
				//j>0为了判断是否是第二个相同的数
				max=Math.max(max,k-i);
				i=j+1;//更新首坐标
			}
			j=k-1;//j为对比坐标
		}
		return Math.max(max, s.length()-i);
	}
}
