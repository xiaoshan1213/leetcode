/*
 * dp
 */
package com.sam.leetcode;

public class Solution2 {
	public int maxProduct(int[] nums){
		int max=nums[0],min=nums[0],totalMax=nums[0];
		for(int i=1;i<nums.length;i++){
			int tempMax=nums[i]*max;
			int tempMin=nums[i]*min;
			max=Math.max(Math.max(tempMax,tempMin), nums[i]);
			min=Math.min(Math.min(tempMax,tempMin), nums[i]);
			totalMax=Math.max(totalMax, max);
		}
		return totalMax;
	}
}
