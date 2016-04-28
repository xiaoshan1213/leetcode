package com.sam.example;

public class Solution {

	public int removeElement(int[] nums, int val) {
		int res=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]==val){
        		
        	}else{
        		nums[res]=nums[i];
        		res++;
        	}
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
