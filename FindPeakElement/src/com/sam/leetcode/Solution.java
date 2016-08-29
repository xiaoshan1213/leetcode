/*
 * O(log)
 */
package com.sam.leetcode;

public class Solution {
	public int findPeakElement(int[] nums){
		return biSearch(nums,0,nums.length-1);
	}
	private int biSearch(int[] nums,int start,int end){
		if(start==end)
			return start;
		else if(start+1==end){
			if(nums[start]>nums[end]) return start;
			return end;
		}else{
			int m=(start+end)/2;
			if(nums[m]>nums[m-1] && nums[m]>nums[m+1])
				return m;
			else if(nums[m-1]>nums[m] && nums[m]>nums[m+1])
				return biSearch(nums,start,m-1);
			else
				return biSearch(nums,m+1,end);
		}	
	}
}
