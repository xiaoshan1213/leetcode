package com.sam.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String encode(List<String> strs){
		StringBuffer sb=new StringBuffer();
		for(String s:strs){
			sb.append(s.length());
			sb.append("#");
			sb.append(s);
		}
		return sb.toString();
	}
	public List<String> decode(String s){
		List<String> str=new ArrayList<>();
		int i=0;
		while(i<s.length()){
			int idx=s.indexOf('#',i);
			int l=Integer.parseInt(s.substring(i, idx));
			str.add(s.substring(idx+1, idx+l+1));
			i=idx+l+1;
		}
		return str;
	}
}
