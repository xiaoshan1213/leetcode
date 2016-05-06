package com.sam.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	 
	    if(candidates == null || candidates.length == 0) return result;
	 
	    ArrayList<Integer> current = new ArrayList<Integer>();
	    Arrays.sort(candidates);
	 
	    combinationSum(candidates, target, 0, current, result);
	 
	    return result;
	}
	 
	public void combinationSum(int[] candidates, int target, int j, ArrayList<Integer> curr, List<List<Integer>> result){
	   if(target == 0){
	       ArrayList<Integer> temp = new ArrayList<Integer>(curr);
	       result.add(temp);
	       return; 
	   }
	 
	   for(int i=j; i<candidates.length; i++){
	       if(target < candidates[i]) 
	            return;
	       
	       curr.add(candidates[i]);
	       combinationSum(candidates, target - candidates[i], i, curr, result); //add self
	       curr.remove(curr.size()-1); //not add self
	   }
	}
	public static void main(String[] args){
		Solution solution=new Solution();
		int[] candidates={2,2,4};
		int target=4;
		List<List<Integer>> res=solution.combinationSum(candidates, target);
		System.out.print(res);
	}
}
