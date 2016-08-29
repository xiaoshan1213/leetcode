/*
 * duplicates
 */
package com.sam.leetcode;

public class Solution {
	public boolean search(int[] nums,int target){
		int n=nums.length;
		if(n==0) return false;
		int start=0,end=n-1;
		return search(start,end,nums,target);
	}
	private boolean search(int start,int end,int[] nums,int target){
		while(start<=end){
			int mid=(start+end)/2;
			if(nums[mid]==target) return true;
			if(nums[start]<nums[mid]){
				if(nums[start]<=target && nums[mid]>=target) end=mid-1;
				else return search(mid+1,end,nums,target);
			}else if(nums[start]>nums[mid]){
				if(nums[mid]<=target && nums[end]>=target) start=mid+1;
				else return search(start,mid-1,nums,target);
			}else{
				return search(start,mid-1,nums,target) || search(mid+1,end,nums,target);
			}
		}
		return false;
	}
}
