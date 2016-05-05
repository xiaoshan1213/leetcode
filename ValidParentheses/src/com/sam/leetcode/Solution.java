package com.sam.leetcode;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else{
                if(stack.empty()){
                    return false;
                }
                char temp=stack.pop();
                 if(s.charAt(i)==')' && temp=='('){
                     
                 }else if(s.charAt(i)==']' && temp=='['){
                     
                 }else if(s.charAt(i)=='}' && temp=='{'){
                     
                 }else{
                     return false;
                 }
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
        
    }
}
