/*
 * time limit exceeded
 */
package com.sam.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int minimumTotal(List<List<Integer>> triangle){
		if(triangle.isEmpty() || triangle.size()==0)
			return 0;
		int size=triangle.size();
		List<Integer> res=new ArrayList<Integer>();
		int temp=0;
		int min=Integer.MAX_VALUE;
		stepCal(0,0,temp,size,res,triangle);
		for(Integer i:res)
			if(i<min)
				min=i;
		return min;
	}
	public void stepCal(int row,int num,int temp,int size,List<Integer> res,List<List<Integer>> triangle){
		if(row==size){
			res.add(temp);
			return;
		}
		temp=temp+triangle.get(row).get(num);
		stepCal(row+1,num,temp,size,res,triangle);
		stepCal(row+1,num+1,temp,size,res,triangle);	
	}
}
