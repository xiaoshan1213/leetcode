/*
 * dp
 */
package com.sam.leetcode;

public class Solution {
	public int maxProduct(int[] nums){
		int n=nums.length;
		int preMin,preMax;
		int curMin,curMax;
		preMin=preMax=nums[0];
		int res=nums[0];
		for(int i=1;i<n;i++){
			if(nums[i]>=0){
				curMin=preMin<=0?preMin*nums[i]:nums[i];
				curMax=preMax>0?preMax*nums[i]:nums[i];
			}else{
				curMax=preMin<=0?preMin*nums[i]:nums[i];
				curMin=preMax>0?preMax*nums[i]:nums[i];
			}
			res=Math.max(res, curMax);
			preMin=curMin;
			preMax=curMax;
		}
		return res;
	}
}
