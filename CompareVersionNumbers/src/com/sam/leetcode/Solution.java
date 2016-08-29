/*
 * 没有考虑多个‘。’的情况
 */
package com.sam.leetcode;

public class Solution {
	public int compareVersion(String version1,String version2){
		Long v1=(long) 0,v2=(long) 0;
		int i1=0,i2=0;
		while(i1<version1.length() && version1.charAt(i1)!='.'){
			v1=v1*10+version1.charAt(i1)-'0';
			i1++;
		}
		while(i2<version2.length() && version2.charAt(i2)!='.'){
			v2=v2*10+version2.charAt(i2)-'0';
			i2++;
		}
		if(v1!=v2) return v1>v2?1:-1;
		else{
			i1++;
			i2++;
			v1=(long) 0;
			v2=(long) 0;
			while(i1<version1.length()){
				v1=v1*10+version1.charAt(i1)-'0';
				i1++;
			}
			while(i2<version2.length()){
				v2=v2*10+version2.charAt(i2)-'0';
				i2++;
			}
			if(v1!=v2) return v1>v2?1:-1;
			else return 0;
		}
	}
}
