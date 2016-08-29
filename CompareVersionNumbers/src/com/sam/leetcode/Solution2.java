/*
 * 依次比较每段‘。’之内的值
 */
package com.sam.leetcode;

public class Solution2 {
	public int compareVersion(String version1,String version2){
		int i=0;
		int j=0;
		int n1=version1.length();
		int n2=version2.length();
		int num1=0;
		int num2=0;
		while(i<n1 || j<n2){
			while(i<n1 && version1.charAt(i)!='.'){
				num1=num1*10+version1.charAt(i)-'0';
				i++;
			}
			while(j<n2 && version2.charAt(j)!='.'){
				num2=num2*10+version2.charAt(j)-'0';
				j++;
			}
			if(num1>num2) return 1;
			else if(num1<num2) return -1;
			num1=0;
			num2=0;
			i++;
			j++;
		}
		return 0;
	}
}
