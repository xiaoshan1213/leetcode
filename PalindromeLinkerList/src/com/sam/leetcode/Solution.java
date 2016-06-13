package com.sam.leetcode;

 public class Solution {
	public boolean isPalindrome(ListNode head){
		if(head==null || head.next==null) return true;
		ListNode secondPart=getSecondPart(head);
		secondPart=reverseList(secondPart);
		return hasSamePrefixList(head,secondPart);
	}
	private ListNode getSecondPart(ListNode head){
		ListNode p1=head;
		ListNode p2=head;
		while(p2!=null){
			p1=p1.next;
			p2=p2.next;
			if(p2==null) break;
			p2=p2.next;
		}
		return p1;
	}
	private ListNode reverseList(ListNode head){
		if(head==null || head.next==null) return head;
		ListNode p1=null;
		ListNode p2=head;
		ListNode p3=head.next;
		while(p3!=null){
			p2.next=p1;
			p1=p2;
			p2=p3;
			p3=p3.next;
		}
		p2.next=p1;
		return p2;
	}
	private boolean hasSamePrefixList(ListNode l1,ListNode l2){
		while(l1!=null && l2!=null){
			if(l1.val!=l2.val) return false;
			l1=l1.next;
			l2=l2.next;
		}
		return true;
	}
}
