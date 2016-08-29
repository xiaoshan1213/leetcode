/*
 * dp 
 */
package com.sam.leetcode;

public class Solution2 {
	public int rob(int[] nums){
		if(nums.length==0) return 0;
		if(nums.length==1) return nums[0];
		if(nums.length==2) return Math.max(nums[0], nums[1]);
		//分别计算不包括第一个元素和不包括最后一个元素的情况，取其最大值
		return Math.max(subrob(nums,0,nums.length-2), subrob(nums,1,nums.length-1));
	}
	private int subrob(int[] nums,int s,int e){
		int n=e-s+1;
		int[] d=new int[n];
		d[0]=nums[s];
		d[1]=Math.max(nums[s], nums[s+1]);
		for(int i=2;i<n;i++){
			d[i]=Math.max(d[i-2]+nums[s+i], d[i-1]);
		}
		return d[n-1];
	}
}
