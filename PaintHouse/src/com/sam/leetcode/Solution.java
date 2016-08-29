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
			//��ǰ���ӵ��ܴ���=��ǰ���ӵĴ���+֮ǰ���۵���Сֵ����ȥ��ǰ������ɫ������������ɫ�е���Сֵ��
			r=costs[i][0]+Math.min(bb,gg);
			b=costs[i][1]+Math.min(rr, gg);
			g=costs[i][2]+Math.min(bb, rr);
		}
		return Math.min(b, Math.min(r, g));
	}
}
