package com.sam.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int[] intersection(int[] nums1,int[] nums2){
		//hash O(n)
		Set<Integer> set=new HashSet<>();
		Set<Integer> intersect=new HashSet<>();
		for(int i=0;i<nums1.length;i++)
			set.add(nums1[i]);
		for(int i=0;i<nums2.length;i++){
			if(set.contains(nums2[i]))
				intersect.add(nums2[i]);
		}
		int[] res = new int[intersect.size()];
		int i=0;
		for(Integer num:intersect)
			res[i++]=num;
		return res;
	}
}
