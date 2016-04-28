package com.sam.example;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
	public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
        	return null;
        }
        PriorityQueue<ListNode> q=new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
        	@Override
        	public int compare(ListNode o1, ListNode o2) {
        		// TODO Auto-generated method stub
        		if(o1.val>o2.val){
        			return 1;
        		}else if(o1.val==o2.val){
        			return 0;
        		}else{
        			return -1;
        		}
        	}
		});
        for(ListNode list:lists){
        	if(list!=null){
        		q.add(list);
        	}
        }
        ListNode head=new ListNode(0);
        ListNode p=head;
        while(q.size()>0){
        	ListNode temp=q.poll();
        	p.next=temp;
        	if(temp.next!=null){
        		q.add(temp.next);
        	}
        	p=p.next;
        }
        return head.next;
    }
}
