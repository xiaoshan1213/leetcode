/*
 * o(n)
 */
package com.sam.leetcode;

import java.util.Stack;

public class FastSolution {
	public int largestRectangleArea(int[] heights){
		if(heights==null || heights.length==0) return 0;
		Stack<Integer> stack=new Stack<>();
		int i=0,res=0;
		while(i<heights.length || !stack.isEmpty()){
			if(i==heights.length || (!stack.isEmpty() && heights[stack.peek()]>heights[i])){
				int h=heights[stack.pop()];
				int left=stack.isEmpty()?0:stack.peek()+1;
				res=Math.max(res, h*(i-left));
			}else{
				stack.push(i++);
			}
		}
		return res;
	}
}
