package com.sam.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	public String simplifyPath(String path){
		int len=path.length();
		Deque<String> stack=new ArrayDeque<>();
		for(int i=0;i<len;){
			char c=path.charAt(i);
			if(c=='/'){
				++i;
			}else if(c=='.'){
				int j=i+1;
				while(j<len && path.charAt(j)!='/'){
					++j;
				}
				if(j-i==2 && path.charAt(i+1)=='.' && !stack.isEmpty()){
					stack.removeLast();
				}else if(j-i>2){
					stack.addLast(path.substring(i,j));
				}
				i=j;
			}else{
				int j=i+1;
				while(j<len && path.charAt(j)!='/'){
					++j;
				}
				stack.addLast(path.substring(i,j));
				i=j;
			}
		}
		StringBuilder ans=new StringBuilder();
		for(String dir:stack){
			ans.append('/').append(dir);
		}
		if(ans.length()==0){
			return "/";
		}
		return ans.toString();
	}
}
