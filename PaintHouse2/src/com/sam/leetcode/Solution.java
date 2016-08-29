package com.sam.leetcode;

public class Solution {
	public int minCostII(int[][] costs){
		if(costs.length==0) return 0;
		int preMin=0,preSec=0,preIdx=-1;
		for(int i=0;i<costs.length;i++){
			//�������з���
			int curMin=Integer.MAX_VALUE,curSec=Integer.MAX_VALUE,curIdx=-1;
			for(int j=0;j<costs[0].length;j++){
				//����ÿ�����ݵ����п��ܣ�������С�ʹ�С�ķ���
				costs[i][j]=costs[i][j]+(preIdx==j?preSec:preMin);
				//�����ǰ������ɫ��ǰһ����ͬ������ô�С�ķ�������ͬ����С������
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
