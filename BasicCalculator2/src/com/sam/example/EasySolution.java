package com.sam.example;

public class EasySolution {
	public int calculate(String s){
		boolean divide=false;
		int res=0,sign=1,num=0,preNum=0; //replace stack
		for(char c:s.toCharArray()){
			if(Character.isDigit(c)){
				num=num*10+c-'0';
			}else if(c=='+' || c=='-' || c=='*' || c=='/'){
				if(divide){
					num=preNum/num;
					divide=false;
				}
				if(c=='/'){
					divide=true;
					preNum=num*sign;
					sign=1;
				}else if(c=='*'){
					sign*=num;  
				}else{
					res+=sign*num;
					sign=c=='+'?1:-1;
				}
				num=0;
			}
		}
		if(num>0){
			if(divide){
				num=preNum/num;
			}
			res+=sign*num;
		}
		return res;
	}
}
