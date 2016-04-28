package com.sam.example;

public class Solution2 {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode beforeHead=new ListNode(0);
		beforeHead.next=head;
		ListNode pointer=beforeHead;
		while(pointer.next!=null && pointer.next.next!=null){
			if(pointer.next.val==pointer.next.next.val){
				int duplicate=pointer.next.val;
				while(pointer.next!=null && pointer.next.val==duplicate){
					pointer.next=pointer.next.next;
				}
			}else{
				pointer=pointer.next;
			}
		}
		return beforeHead.next;
	}
}
