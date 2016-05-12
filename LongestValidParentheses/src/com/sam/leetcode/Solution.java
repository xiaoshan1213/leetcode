package com.sam.leetcode;

import java.util.Stack;

public class Solution {
	public int longestValidParentheses(String s){
		int[] sArr=new int[s.length()];
		int res=0;
		int temp=0;
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='('){
				stack.push(i);
			}else{
				if(!stack.isEmpty()){
					sArr[i]=1;
					sArr[stack.pop()]=1;
				}
			}
		}
		for(int i:sArr){
			if(i==1) temp++;
			else{
				res=Math.max(temp, res);
				temp=0;
			}
		}
		return Math.max(temp, res);
	}
}
