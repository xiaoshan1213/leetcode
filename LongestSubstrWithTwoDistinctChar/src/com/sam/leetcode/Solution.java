package com.sam.leetcode;

public class Solution {
	public int lengthOfLongestSubstringTwoDIstinct(String s){
		int i=0,j=-1,max=0;
		for(int k=1;k<s.length();k++){
			//kΪβ����
			if(s.charAt(k)==s.charAt(k-1)) continue;
			if(j>=0 && s.charAt(j)!=s.charAt(k)){
				//j>0Ϊ���ж��Ƿ��ǵڶ�����ͬ����
				max=Math.max(max,k-i);
				i=j+1;//����������
			}
			j=k-1;//jΪ�Ա�����
		}
		return Math.max(max, s.length()-i);
	}
}
