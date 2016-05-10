package com.sam.leetcode;

public class Solution {
	public int maxProfit(int[] prices) {
        if(prices.length==0 || prices==null){
            return 0;
        }
        int start=0;
        int end=0;
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>prices[end]){
                end=i;
                max=Math.max(max,prices[end]-prices[start]);
            }
            if(prices[i]<prices[start]){
                start=i;
                end=i;
            }
        }
        return max;
    }
}
