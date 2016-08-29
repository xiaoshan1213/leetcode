package com.sam.leetcode;

public class Solution {
	public int rob(int[] nums){
		int[] robMoney=new int[nums.length];
		if(nums.length==0) return 0;
		for(int i=0;i<nums.length;i++){
			if(i==0) robMoney[i]=nums[i];
			else if(i==1) robMoney[i]=Math.max(robMoney[i-1], nums[i]);
			else robMoney[i]=Math.max(robMoney[i-2]+nums[i], robMoney[i-1]);
		}
		return robMoney[nums.length-1];
	}
	
}
