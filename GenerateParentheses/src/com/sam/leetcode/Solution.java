package com.sam.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> generateParenthesis(int n){
		List<String> list=new ArrayList<>();
		stepCal(n,1,0,new StringBuilder("("),list); //'('--wrong  "(" --right
		return list;
	}
	private void stepCal(int nNum,int openUsed,int closeUsed,StringBuilder sb,List<String> list){
		if(openUsed==nNum && closeUsed==nNum){
			list.add(sb.toString());
			return;
		}
		if(openUsed>closeUsed){
			StringBuilder sb2=(openUsed<nNum)?new StringBuilder(sb):sb;
			sb2.append(')');
			stepCal(nNum,openUsed,closeUsed+1,sb2,list);
		}
		if(openUsed<nNum){
			sb.append('(');
			stepCal(nNum,openUsed+1,closeUsed,sb,list);
		}
	}
}
