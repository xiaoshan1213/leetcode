package com.sam.leetcode;

public class Solution {
	public int trap(int[] height){
		int len=height.length;
		int V=0;
		int top=0;
		for(int i=0;i<len;i++){
			if(height[i]<top)
				V+=top-height[i];
			top=Math.max(top, height[i]);
		}
		int preTop=top;
		top=0;
		for(int i=len-1;i>=0;i--){
			top=Math.max(top, height[i]);
			if(top<preTop)
				V-=preTop-top;
		}
		return V;
	}
}
