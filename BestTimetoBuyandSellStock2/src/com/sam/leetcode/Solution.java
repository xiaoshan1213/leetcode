package com.sam.leetcode;

public class Solution {
	public int maxProfit(int[] prices){
		int len=prices.length;
		if(len==0){
			return 0;
		}
		int end=0;
		int max=0;
		for(int i=0;i<len;i++){
			if(prices[i]<prices[end]){
				end=i;
			}else if(prices[i]>prices[end]){
				max=max+prices[i]-prices[end];
				end=i;
			}
		}
		return max;
	}
}
