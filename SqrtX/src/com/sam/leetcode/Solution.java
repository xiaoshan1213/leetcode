package com.sam.leetcode;

public class Solution {
	public int mySqrt(int x){
		if(x<=1) return x;
		int low=1,high=x;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(mid==x/mid) return mid;
			else if(mid<x/mid) low=mid+1;
			else high=mid-1;
		}
		return low;
	}
}