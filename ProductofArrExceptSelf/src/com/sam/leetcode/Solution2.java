package com.sam.leetcode;

public class Solution2 {
	public int[] productExceptSelf(int[] nums){
		int[] p=new int[nums.length];
		int product=1;
		//scan from left to right
		for(int i=0;i<nums.length;i++){
			p[i]=product;
			product*=nums[i];
		}
		product=1;
		//scan from right to left
		for(int j=nums.length-1;j>=0;j--){
			p[j]*=product;
			product*=nums[j];
		}
		return p;
	}
}
