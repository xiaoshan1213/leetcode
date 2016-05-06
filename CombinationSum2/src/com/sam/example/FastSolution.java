package com.sam.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FastSolution {
	public List<List<Integer>> combinationSum2(int[] candidates,int target){
		Arrays.sort(candidates);
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		stepCal(candidates,res,new ArrayList<Integer>(),target,0);
		return res;
	}
	private void stepCal(int[] candidates,List<List<Integer>> res,ArrayList<Integer> cur,int target,int pos){
		if(target<0) return;
		if(target==0){
			res.add(new ArrayList<Integer>(cur));
			return;
		}
		for(int i=pos;i<candidates.length;i++){
			if(i>pos && candidates[i]==candidates[i-1]){ //ignore duplicates
				continue;
			}
			if(target-candidates[i]<0) break;
			cur.add(candidates[i]);
			stepCal(candidates,res,cur,target-candidates[i],i+1);
			cur.remove(cur.size()-1);
		}
	}
}
