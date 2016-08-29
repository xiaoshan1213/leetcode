package com.sam.leetcode;

import java.util.List;

public class FastSolution {
	public int minimumTotal(List<List<Integer>> triangle){
		if(triangle.isEmpty() || triangle.size()==0)
			return 0;
		int size=triangle.size();
		for(int l=size-2;l>=0;l--){
			for(int i=0;i<=l;i++){
				int temp=Math.min(triangle.get(l+1).get(i), triangle.get(l+1).get(i+1))+triangle.get(l).get(i);
				triangle.get(l).set(i, temp);
			}
		}
		return triangle.get(0).get(0);
	}
}
