/*
 * method from best time to sell stock 3
 */
package com.sam.leetcode;

import java.util.Arrays;

public class Solution {
	public int maxProfit(int k,int[] prices){
		if(k<=0 || prices==null || prices.length<=0) return 0;
		if(k>prices.length/2){
			int max=0;
			for(int i=0;i<prices.length-1;i++){
				int diff=prices[i+1]-prices[i];
				max+=diff>0?diff:0;
			}
			return max;
		}else{
			int buy[]=new int[k];
			int sell[]=new int[k];
			Arrays.fill(buy, Integer.MIN_VALUE);
			for(int price:prices){
				int temp=0;
				for(int i=0;i<k;i++){
					int buffer=0;
					buffer=temp-price;
					if(buy[i]<buffer) buy[i]=buffer;
					buffer=buy[i]+price;
					if(sell[i]<buffer) sell[i]=buffer;
					temp=sell[i];
				}
			}
			return sell[k-1];
		}
	}
}
