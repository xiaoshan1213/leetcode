package com.sam.example;

public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m=obstacleGrid.length;
		int n=obstacleGrid[0].length;
		if(obstacleGrid[0][0]==1){
		    return 0;
		}
        for(int i=0;i<m;i++){
        	if(obstacleGrid[i][0]==1){
        		for(int k=i;k<m;k++){
        			obstacleGrid[k][0]=0;
        		}
        		break;
        	}else{
        	    obstacleGrid[i][0]=1;
        	}
        }
        for(int i=1;i<n;i++){
        	if(obstacleGrid[0][i]==1){
        		for(int k=i;k<n;k++){
        			obstacleGrid[0][k]=0;
        		}
        		break;
        	}else{
        	    obstacleGrid[0][i]=1;
        	}
        }
        for(int i=1;i<m;i++){
        	for(int j=1;j<n;j++){
        		if(obstacleGrid[i][j]==1){
        			obstacleGrid[i][j]=0;
        		}else{
        			obstacleGrid[i][j]=obstacleGrid[i][j-1]+obstacleGrid[i-1][j];
        		}
        		
        	}
        }
        return obstacleGrid[m-1][n-1];
    }
}
