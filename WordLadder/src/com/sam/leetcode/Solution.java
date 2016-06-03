package com.sam.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
	public int ladderLength(String beginWord,String endWord,Set<String> wordList){
		Queue<String> queue=new LinkedList<String>();
		//if(beginWord.length()==0 || endWord.length()==0) return 0;
		queue.add(beginWord);
		int level=0;
		while(!queue.isEmpty()){
			int size=queue.size();
			for(int i=0;i<size;i++){
				String cur=queue.remove();
				if(cur.equals(endWord)) return level+1;
				for(int j=0;j<cur.length();j++){
					char[] word=cur.toCharArray();
					for(char ch='a';ch<'z';ch++){
						word[j]=ch;
						String check=new String(word);
						if(!cur.equals(check) && wordList.contains(check)){
							queue.add(check);
							wordList.remove(check);
						}
					}
				}
			}
			level++;	
		}
		return 0;
	}
}
