package com.sam.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> spiralOrder(int[][] matrix){
		List<Integer> list=new ArrayList<Integer>();
        if(matrix==null || matrix.length==0){
            return list;
        }
		int m=matrix.length; //column
		int n=matrix[0].length; //row
		int x=0;
		int y=0;
		while(m>0 && n>0){
			if(m==1){  //judge if it is circle
				for(int i=0;i<n;i++){
					list.add(matrix[x][y++]);
				}
				break;
			}else if(n==1){
				for(int i=0;i<m;i++){
					list.add(matrix[x++][y]);
				}
				break;
			}
			for(int i=0;i<n-1;i++){
				list.add(matrix[x][y++]);
			}
			for(int i=0;i<m-1;i++){
				list.add(matrix[x++][y]);
			}
			for(int i=0;i<n-1;i++){
				list.add(matrix[x][y--]);
			}
			for(int i=0;i<m-1;i++){
				list.add(matrix[x--][y]);
			}
			x++;
			y++;
			m-=2;
			n-=2;
		}
		return list;
	}
	public static void main(String[] args){
		int A[][]={{1,2},{3,4}};
		int matrix[][]=new int[2][2];
		System.out.print(A[0][1]);
	}
	
}
