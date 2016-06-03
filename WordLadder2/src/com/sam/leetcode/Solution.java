/*
 * time limit error
 */
package com.sam.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	public List<List<String>> findLadders(String beginWord,String endWord,Set<String> wordList){
		List<String> route=new ArrayList<String>();
		List<List<String>> res=new ArrayList<List<String>>();
		dp(beginWord,endWord,wordList,route,res);		
		return res;
	}
	
	private void dp(String cur,String endWord,Set<String> wordList,List<String> route,List<List<String>> res){
		if(cur.equals(endWord)){
			route.add(endWord);
			res.add(route);
		}
		for(int j=0;j<cur.length();j++){
			char[] word=cur.toCharArray();
			for(char ch='a';ch<'z';ch++){
				word[j]=ch;
				String check=new String(word);
				if(!cur.equals(check) && wordList.contains(check)){
					Set<String> newWordList=new HashSet<String>(wordList);
					List<String> newRoute=new ArrayList<String>(route);
					newWordList.remove(check);
					newRoute.add(check);
					dp(check,endWord,newWordList,newRoute,res);
				}
			}
		}
	}
}
