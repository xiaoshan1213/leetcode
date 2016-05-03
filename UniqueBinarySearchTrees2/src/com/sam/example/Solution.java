package com.sam.example;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<TreeNode> generateTrees(int n) {
        return generateTrees(1,n);
    }
	public List<TreeNode> generateTrees(int start,int end){
		List<TreeNode> list=new LinkedList<>();
		if(start>end){
			list.add(null);
			return list;
		}
		for(int i=start;i<=end;i++){
			List<TreeNode> lefts=generateTrees(start,i-1);
			List<TreeNode> rights=generateTrees(i+1,end);
			for(TreeNode left:lefts){
				for(TreeNode right:rights){
					TreeNode node=new TreeNode(i);
					node.left=left;
					node.right=right;
					list.add(node);
				}
			}
		}
		return list;
	}
}
