package com.sam.example;

public class Solution {

	public int removeDuplicates(int[] nums) {
	    if(nums.length==0){
	    	return 0;
	    }
		if(nums.length==1){
			return 1;
		}
		int res=1;
		for(int i=1;i<nums.length;i++){
			if(nums[i]!=nums[i-1]){
				nums[res]=nums[i];
				res++;
			}
		}
		return res;
	    
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test={1,2,2,2,3,3,4};
		Solution solution=new Solution();
		int res=solution.removeDuplicates(test);
		System.out.print(res);
	}

}
