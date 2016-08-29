package com.sam.leetcode;

import java.util.Stack;

public class Solution {
	public int lengthOfLastWord(String s){
		//save and count 
		if(s==null || s.length()==0 || (s.length()==1 && s.charAt(0)==' '))
			return 0;
		int n=s.length();
		Stack<Character> stack=new Stack<>();
		for(int i=n-1;i>=0;i--){
			if(s.charAt(i)==' '){
				if(stack.size()==0) continue;
				else break;
			}else{
				stack.push(s.charAt(i));
			}
		}
		int l=0;
		while(stack.size()!=0){
			stack.pop();
			l++;
		}
		return l;
	}
}
