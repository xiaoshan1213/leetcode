/*
 * dynamic programming
 */
package com.sam.leetcode;

public class Solution {
	public int minCost(int[][] costs){
		if(costs==null || costs.length==0) return 0;
		int n=costs.length,r=0,g=0,b=0;
		for(int i=0;i<n;i++){
			int rr=r,bb=b,gg=g;
			//当前房子的总代价=当前房子的代价+之前代价的最小值（除去当前房子颜色的其他两种颜色中的最小值）
			r=costs[i][0]+Math.min(bb,gg);
			b=costs[i][1]+Math.min(rr, gg);
			g=costs[i][2]+Math.min(bb, rr);
		}
		return Math.min(b, Math.min(r, g));
	}
}
