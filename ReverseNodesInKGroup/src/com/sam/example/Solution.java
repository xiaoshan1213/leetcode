/*
 * reverse every K nodes
 */
package com.sam.example;

public class Solution {
	public ListNode reverseKGroup(ListNode head, int k) {
		if(k==1){
        	return head;
        }
        if(head==null || head.next==null){
        	return head;
        }
        ListNode beforeHead=new ListNode(0);
        beforeHead.next=head;
        ListNode tail=head;
        ListNode next=null;
        next=tail.next;
        int count=0;
        while(beforeHead.next!=null){
        	count++;
        	beforeHead.next=beforeHead.next.next;
        }
        if(k>count){
        	return head;
        }
        int tempK=k;
        while(tempK-1>0){
        	//next=tail.next;
        	if(next==null){
        		break;
        	}
        	ListNode temp=next;
        	next=next.next;
        	temp.next=tail;
        	tail=temp;
        	tempK--;
        }
        head.next=next;
        beforeHead.next=tail;
        ListNode tempTail=reverseKGroup(next,k); //recursion
        head.next=tempTail;
        return beforeHead.next;
    }
	public static void main(String[] args){
		ListNode test1=new ListNode(1);
		ListNode test2=new ListNode(2);
		ListNode test3=new ListNode(3);
		ListNode test4=new ListNode(4);
		test1.next=test2;
		test2.next=test3;
		test3.next=test4;
		Solution solution=new Solution();
		ListNode res=solution.reverseKGroup(test1, 3);
		
	}
}
