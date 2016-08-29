package com.sam.leetcode;

public class Solution {
	public int divide(int divided,int divisor){
		int sign=1;
		if((divided>0 && divisor<0) || (divided<0 && divisor>0)) sign=-1;
		long dvd=Math.abs((long)divided);
		long dvs=Math.abs((long)divisor);
		if(dvs==0) return Integer.MAX_VALUE;
		if(dvd<dvs || dvd==0) return 0;
		long temp=divide(dvd,dvs);
		int res;
		if(temp>Integer.MAX_VALUE)
			res=(sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
		else
			res=(int)(sign*temp);
		return res;
	}
	private long divide(long dvd,long dvs){
		if(dvd<dvs) return 0;
		long sum=dvs;
		long multiple=1;
		while((sum+sum)<=dvd){
			sum+=sum;//表示乘多少次
			multiple+=multiple;//计算binary值
		}
		return multiple+divide(dvd-sum,dvs);
	}
}
