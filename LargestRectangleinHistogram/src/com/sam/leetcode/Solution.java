package com.sam.leetcode;

import java.util.Stack;

public class Solution {
	public int largestRectangleArea(int[] heights){
		if(heights.length==0 || heights==null){
			return 0;
		}
		Stack<Integer> stack=new Stack<>();
		stack.push(heights[0]);
		stepCal(heights,0,stack,heights[0]);
		return stack.pop();
	}
	private void stepCal(int[] heights,int pos,Stack<Integer> stack,int tempMax){
		if(pos==heights.length) return;
		for(int i=pos;i<heights.length;i++){
			int tempH=stack.pop();
			if(heights[i]<tempH){
				stack.push(heights[i]);
				tempMax=tempMax>(heights[i]*(i-pos+1))?tempMax:(heights[i]*(i-pos+1));
			}else{
				stack.push(tempH);
				tempMax+=tempH;
			}
			stepCal(heights,pos+1,stack,tempMax);
		}
	}
}
