package com.sam.leetcode;

public class Solution {
	public void nextPermutation(int[] nums){
		if(nums.length<=1) return;
		int i=nums.length-1;
		for(;i>=1;i--)
			if(nums[i]>nums[i-1]) break;//�ҵ����ڵ�ǰ�߱Ⱥ���С����ϣ�С�ߣ����ߣ�
		if(i!=0) swap(nums,i-1);//����С�ߺʹ�β��ǰ��������ĵ�һ��
		reverse(nums,i);//reverse���߼��Ժ����
	}
	private void swap(int[] nums,int i){
		for(int j=nums.length-1;j>i;j--){
			if(nums[j]>nums[i]){
				int t=nums[j];
				nums[j]=nums[i];
				nums[i]=t;
				break;
			}
		}
	}
	private void reverse(int[] nums,int i){
		int first=i;
		int last=nums.length-1;
		while(first<last){
			int t=nums[first];
			nums[first]=nums[last];
			nums[last]=t;
			first++;
			last--;
		}
	}
}
