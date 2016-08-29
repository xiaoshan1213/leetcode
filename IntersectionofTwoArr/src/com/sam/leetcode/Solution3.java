package com.sam.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution3 {
	public int[] intersection(int[] nums1,int[] nums2){
		Set<Integer> set=new HashSet<>();
		Arrays.sort(nums1);
		for(Integer num:nums2){
			if(binarySearch(nums1,num))
				set.add(num);
		}
		int i=0;
		int[] res=new int[set.size()];
		for(Integer num:set)
			res[i++]=num;
		return res;
	}
	private boolean binarySearch(int[] nums,int target){
		int low=0;
		int high=nums.length-1;
		while(low<high){
			int mid=low+(high-low)/2;
			if(nums[mid]==target)
				return true;
			if(nums[mid]>target)
				high=mid-1;
			else
				low=mid+1;
		}
		return false;
	}
}
