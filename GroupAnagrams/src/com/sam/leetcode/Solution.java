package com.sam.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public List<List<String>> groupAnagrams(String[] strs){
		if(strs==null || strs.length==0) return new ArrayList<List<String>>();
		HashMap<String,List<String>> map=new HashMap<String,List<String>>();
		Arrays.sort(strs);
		for(String s:strs){
			char[] sa=s.toCharArray();
			Arrays.sort(sa);
			String keySa=String.valueOf(sa);
			if(!map.containsKey(keySa)) map.put(keySa, new ArrayList<String>());
			map.get(keySa).add(s);
		}
		return new ArrayList<List<String>>(map.values());
	}
}
