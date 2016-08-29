package com.sam.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution {
	public List<Integer> closestKValues(TreeNode root,double target,int k){
		Queue<Integer> klist=new LinkedList<>();
		Stack<TreeNode> stk=new Stack<TreeNode>();
		while(root!=null){
			stk.push(root);
			root=root.left;
		}
		while(!stk.isEmpty()){
			TreeNode curr=stk.pop();
			if(klist.size()<k){
				klist.offer(curr.val);
			}else{
				int first=klist.peek();
				if(Math.abs(first-target)>Math.abs(curr.val-target)){
					klist.poll();
					klist.offer(curr.val);
				}else{
					break;
				}
			}
			//×óÖÐÓÒ£¬ÖÐÐò±éÀú
			if(curr.right!=null){
				curr=curr.right;
				while(curr!=null){
					stk.push(curr);
					curr=curr.left;
				}
			}
		}
		return (List<Integer>)klist;
	}
}
