package com.sam.leetcode;

class TrieNode{
	public String val;
	public TrieNode[] next;
	
	public TrieNode(){
		next=new TrieNode[26];
	}
}

public class Trie {
	private TrieNode root;
	
	public Trie(){
		root=new TrieNode();
	}
	
	public void insert(String word){
		root=insert(root,word,0);
	}
	
	private TrieNode insert(TrieNode node,String word,int d){
		if(node==null) node=new TrieNode();
		if(d==word.length()){
			node.val=word;
			return node;
		}
		int c=word.charAt(d);
		node.next[c-97]=insert(node.next[c-97],word,d+1);
		return node;
	}
	
	public boolean search(String word){
		return search(root,word,0);
	}
	
	private boolean search(TrieNode node,String word,int d){
		if(node==null) return false;
		if(d==word.length() && node.val!=null) return true;
		if(d==word.length() && node.val==null) return false;
		int c=word.charAt(d);
		return search(node.next[c-97],word,d+1);
		
	}
	
	public boolean startWith(String prefix){
		return startWith(root,prefix,0);
	}
	
	private boolean startWith(TrieNode node,String prefix,int d){
		if(node==null) return false;
		if(d==prefix.length()) return true;
		int c=prefix.charAt(d);
		return startWith(node.next[c-97],prefix,d+1);
	}
}
