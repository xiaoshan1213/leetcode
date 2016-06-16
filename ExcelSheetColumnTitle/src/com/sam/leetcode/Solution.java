package com.sam.leetcode;

public class Solution {
	public String convertToTitle(int n){
		String sb=new String();
		int temp=n;
		char cur='A';
		while(temp>26){
		    if(temp%26==0){
		        cur='Z';
		        temp=temp/26-1;
		    }else{
	    		cur=(char)(temp%26-1+'A');
		    	temp=temp/26;
		    }
			sb=cur+sb;
		}
		if(temp%26==0){
	        cur='Z';
	    }else{
	    	cur=(char)(temp%26-1+'A');
	    }
		sb=cur+sb;
		return sb;
	}
}
