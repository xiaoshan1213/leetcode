package com.sam.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<String> letterCombinations(String digits){
		List<String> list=new ArrayList<>();
		if(digits==null || digits.length()==0){
		    return list;
		}
		stepCal(digits,list,0,"");
		return list;
	}
	private void stepCal(String digits,List<String> list,int pos,String curStr){
		if(pos==digits.length()){
			list.add(curStr);
			return;
		}
		String temp=dict.get(digits.charAt(pos));	
		for(char element:temp.toCharArray()){
			stepCal(digits,list,pos+1,curStr+element);
		}
	}
	private static Map<Character,String> dict;
	static{
		dict=new HashMap<>();
		dict.put('2', "abc");
	    dict.put('3', "def");
	    dict.put('4', "ghi");
	    dict.put('5', "jkl");
	    dict.put('6', "mno");
	    dict.put('7', "pqrs");
	    dict.put('8', "tuv");
	    dict.put('9', "wxyz");
	}
	public static void main(String[] args){
		char c1=(char)(97);
		System.out.print(c1);
	}
}
