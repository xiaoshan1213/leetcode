/*
 * ZigZag
 */
package com.sam.leetcode;

public class Solution {
	public String convert(String s,int numRows){
		String res="";
		if(s.length()==0 || s==null) return res;
		if(numRows<2) return s;
		StringBuilder sb=new StringBuilder();
		char[] sArr=s.toCharArray();
		int inter=2*(numRows-1);
		for(int i=0;i<numRows;i++){
			stepCalByRow(sArr,sb,inter,i);
		}
		return sb.toString();
	}
	private void stepCalByRow(char[] sArr,StringBuilder sb,int inter,int row){
		int left=-row;
		int right=row;
		int len=sArr.length;
		while(true){
			if(left>=len || (left<0 && right>=len)) break;
			if(left>=0) sb.append(sArr[left]);
			if(right<len && right!=left+inter && row!=0) sb.append(sArr[right]);
			left+=inter;
			right+=inter;
		}
	}
}
