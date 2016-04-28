package com.sam.example;

public class Solution {

	public ListNode removeElements(ListNode head, int val) {
		ListNode helper = new ListNode(0); //固定头指针
	    helper.next = head;
	    ListNode p = helper;
	 
	    while(p.next != null){
	        if(p.next.val == val){
	            ListNode next = p.next;
	            p.next = next.next; 
	        }else{
	            p = p.next;
	        }
	    }
	 
	    return helper.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
