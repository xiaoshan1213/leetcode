package com.sam.leetcode;

public class Solution {
	public int minCostII(int[][] costs){
		if(costs.length==0) return 0;
		int preMin=0,preSec=0,preIdx=-1;
		for(int i=0;i<costs.length;i++){
			//遍历所有房屋
			int curMin=Integer.MAX_VALUE,curSec=Integer.MAX_VALUE,curIdx=-1;
			for(int j=0;j<costs[0].length;j++){
				//遍历每所房屋的所有可能，保存最小和次小的方案
				costs[i][j]=costs[i][j]+(preIdx==j?preSec:preMin);
				//如果当前房屋颜色和前一所相同，则采用次小的方案，不同则最小方案。
				if(costs[i][j]<curMin){
					curSec=curMin;
					curMin=costs[i][j];
					curIdx=j;
				}else if(costs[i][j]<curSec){
					curSec=costs[i][j];
				}
			}
			preMin=curMin;
			preSec=curSec;
			preIdx=curIdx;
		}
		return preMin;
	}
}
