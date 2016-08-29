package com.sam.leetcode;

import java.util.LinkedList;

public class Solution1 {
	public String getPermutation(int n,int k){
		String res="";
		LinkedList<Integer> alph=new LinkedList<>();
		int l=1,temp,rest;
		for(int i=1;i<=n;i++){
			l*=i;
			alph.add(i);
		}
		for(int j=n;j>0;j--){
			temp=k/(l/j);
			rest=k%(l/j);
			if(rest==0){
				res+=alph.remove(temp);
				//最大子序列
				
			}else{
				res+=alph.remove(temp+1);
				k=rest;
			}
			
		}
		return res;
	}
}
