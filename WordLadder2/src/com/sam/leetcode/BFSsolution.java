package com.sam.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSsolution {
	class TreeNode{
		public String val;
		public TreeNode parent;
		public TreeNode(String v,TreeNode p){
			val=v;
			parent=p;
		}
	}
	public List<List<String>> findLadders(String beginWord,String endWord,Set<String> wordList){
		List<List<String>> list=new ArrayList<>();
		int level=0;
		boolean found=false;
		Queue<TreeNode> q=new LinkedList<>();
		Map<String,Integer> map=new HashMap<>();
		q.offer(new TreeNode(beginWord,null));
		map.put(beginWord, 0);
		while(!q.isEmpty()){
			if(found) return list;
			int size=q.size();
			for(int i=0;i<size;i++){
				TreeNode node=q.poll();
				String word=node.val;
				if(word.equals(endWord)){
					found=true;
					List<String> ladder=new ArrayList<>();
					while(node!=null){
						ladder.add(0,node.val);
						node=node.parent;
					}
					list.add(ladder);
				}else{
					char[] wordArray=word.toCharArray();
					for(int j=0;j<wordArray.length;j++){
						char c=wordArray[j];
						for(char k='a';k<'z';k++){
							wordArray[j]=k;
							String newWord=new String(wordArray);
							if(wordList.contains(newWord) && (!map.containsKey(newWord) || map.get(newWord)==level)){
								map.put(newWord, level);
								TreeNode child=new TreeNode(newWord,node);
								q.offer(child);
							}
						}
						wordArray[j]=c;
					}
				}
			}
			level++;
		}
		return list;
	}
}
