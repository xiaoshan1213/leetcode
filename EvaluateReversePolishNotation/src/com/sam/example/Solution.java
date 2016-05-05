package com.sam.example;

import java.util.Stack;

public class Solution {
	public int evalRPN(String[] tokens){
		Stack<Integer> stack=new Stack<>();
		int len=tokens.length;
		int res=0;
		for(int i=0;i<len;i++){
			if(Character.isDigit(tokens[i].charAt(0))){
				int tempNum=tokens[i].charAt(0)-'0';
				for(int j=1;j<tokens[i].length();j++){
					tempNum=tempNum*10+tokens[i].charAt(j)-'0';
				}
				stack.push(tempNum);
			}else{
				if(tokens[i].length()>1){
					int tempNum=tokens[i].charAt(1)-'0';
				    for(int j=2;j<tokens[i].length();j++){
					    tempNum=tempNum*10+tokens[i].charAt(j)-'0';
				    }
				    stack.push(-tempNum);
				}else{
					if(tokens[i].charAt(0)=='+'){
						res=stack.pop()+stack.pop();
						stack.push(res);
					}else if(tokens[i].charAt(0)=='-'){
						int temp=stack.pop();
						res=stack.pop()-temp;
						stack.push(res);
					}else if(tokens[i].charAt(0)=='*'){
						res=stack.pop()*stack.pop();
						stack.push(res);
					}else{
						int temp=stack.pop();
						res=stack.pop()/temp;
						stack.push(res);
					}
				}	
			}
		}
		return stack.pop();
	}
}
