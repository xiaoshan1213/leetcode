package com.sam.leetcode;

import java.util.Stack;

public class Solution1 {
	public String reverseWords(String s){
		Stack<String> stack=new Stack<>();
		int n=s.length();
		String temp="";
		String res="";
		for(int i=0;i<n;i++){
			if(s.charAt(i)==' '){
				stack.push(temp);
				temp="";
			}else{
				temp+=s.charAt(i);
			}
		}
		if(temp.length()!=0){
			stack.push(temp);
		}
		while(stack!=null){
			res+=stack.pop()+" ";
		}
		return res.substring(0,res.length()-1);
	}
}
