package com.sam.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean canPermutePalindrome(String s){
		 Map<Character,Integer> map=new HashMap<Character,Integer>();
		 for(int i=0;i<s.length();i++){
			 char c=s.charAt(i);
			 Integer cnt=map.get(c);
			 if(cnt==null) cnt=new Integer(0);
			 map.put(c, ++cnt);
		 }
		 boolean hasOdd=false;
		 for(Character c:map.keySet()){
			 if(map.get(c)%2==1){
				 if(!hasOdd) hasOdd=true;
				 else return false;
			 }
		 }
		 return true;
	}
}
