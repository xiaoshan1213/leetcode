package com.sam.example;

import java.util.Stack;

public class Solution {
	public int calculate(String s){
		int len=s.length(),sign=1,res=0,flag=0;
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<len;i++){
			if(Character.isDigit(s.charAt(i))){
				int sum=s.charAt(i)-'0';
				while(i+1<len && Character.isDigit(s.charAt(i+1))){
					sum=sum*10+s.charAt(i+1)-'0';
					i++;
				}
				stack.push(sum);
			}else if(s.charAt(i)==' '){
				
			}else if(s.charAt(i)=='+'){
				if(flag==1){
					stack.push(sign*stack.pop()+stack.pop());
				}
				 sign=1;
				 flag=1;
			}else if(s.charAt(i)=='-'){
				if(flag==1){
					stack.push(sign*stack.pop()+stack.pop());
				}
				sign=-1;
				flag=1; 
			}else if(s.charAt(i)=='*'){
				if(!Character.isDigit(s.charAt(i))){
					i++;
				}
				int sum=s.charAt(i)-'0';
				while(i+1<len && Character.isDigit(s.charAt(i+1))){
					sum=sum*10+s.charAt(i+1)-'0';
					i++;
				}
				stack.push(sum*stack.pop());
			}else if(s.charAt(i)=='/'){
				while(!Character.isDigit(s.charAt(i))){
					i++;
				}
				int sum=s.charAt(i)-'0';
				while(i+1<len && Character.isDigit(s.charAt(i+1))){
					sum=sum*10+s.charAt(i+1)-'0';
					i++;
				}
				int temp=stack.pop();
				stack.push(temp/sum);
			}
		}
		res=stack.pop();
		if(stack.empty()){
			return res;	
		}else{
			res=sign*res+stack.pop();
			return res;
		}
	}
	public static void main(String[] args){
		String s="1*2*3*4*5*6*7*8*9*10";
		Solution solution=new Solution();
		int res=solution.calculate(s);
	}
}
