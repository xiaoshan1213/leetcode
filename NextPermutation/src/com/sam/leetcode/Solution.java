package com.sam.leetcode;

public class Solution {
	public void nextPermutation(int[] nums){
		if(nums.length<=1) return;
		int i=nums.length-1;
		for(;i>=1;i--)
			if(nums[i]>nums[i-1]) break;//找到相邻的前者比后者小的组合（小者，大者）
		if(i!=0) swap(nums,i-1);//交换小者和从尾向前数比它大的第一个
		reverse(nums,i);//reverse大者及以后的数
	}
	private void swap(int[] nums,int i){
		for(int j=nums.length-1;j>i;j--){
			if(nums[j]>nums[i]){
				int t=nums[j];
				nums[j]=nums[i];
				nums[i]=t;
				break;
			}
		}
	}
	private void reverse(int[] nums,int i){
		int first=i;
		int last=nums.length-1;
		while(first<last){
			int t=nums[first];
			nums[first]=nums[last];
			nums[last]=t;
			first++;
			last--;
		}
	}
}
