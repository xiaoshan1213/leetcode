package com.sam.leetcode;

public class Solution {
	public int maxSubArray(int[] nums){
		int sum=0,max=nums[0];
		int len=nums.length;
		for(int i=0;i<len;i++){
			sum=sum<0?nums[i]:sum+nums[i];
			max=Math.max(max, sum);
		}
		return max;
	}
}
