/*
 * binary count
 *
 */
package com.sam.leetcode;

public class Solution {
	public double myPow(double x,int n){
		double res=1;
		long temp=Math.abs((long)n);
		while(temp>0){
			if((temp&1)==1) res*=x;
			temp>>=1;
			x*=x;
		}
		return n>0?res:1/res;
	}
}
