package com.sam.example;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode pointToHead=new ListNode(0);
		pointToHead.next=head;
        ListNode tail=pointToHead;
        ListNode start=pointToHead;
        
        for(int i=0;i<n;i++){
        	tail=tail.next;
        }
        while(tail.next!=null){
        	start=start.next;
        	tail=tail.next;
        }
        start.next=start.next.next;
        return pointToHead.next;   
    }
	
	public static void main(String[] args){
		ListNode head=new ListNode(1);
		Solution solution=new Solution();
		ListNode res=solution.removeNthFromEnd(head, 1);
	}
}
