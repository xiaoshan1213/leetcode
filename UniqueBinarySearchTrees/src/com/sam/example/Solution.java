package com.sam.example;

public class Solution {
	public int numTrees(int n) {
        int[] bs=new int[n+1];
        bs[0]=1;
        for(int i=1;i<=n;i++){
        	for(int j=0;j<i;j++){
        		bs[i]+=bs[j]*bs[i-j-1];
        	}
        }
        return bs[n];
    }
}
