package com.sam.example;

public class Solution {
	public ListNode partition(ListNode head, int x) {
        ListNode afterHead=new ListNode(0);
        ListNode beforeHead=new ListNode(0);
        beforeHead.next=head;
        ListNode after=afterHead;
        ListNode temp=beforeHead;
        while(temp.next!=null){
            if(temp.next.val>x){
            	after.next=temp.next;
                temp.next=temp.next.next;
                after=after.next;
            }else{
                temp=temp.next;
            }
        }
        after.next=null;
        temp.next=afterHead.next;
        return beforeHead.next;
    }
	public static void main(String[] args){
		ListNode test1=new ListNode(2);
		ListNode test2=new ListNode(1);
		test1.next=test2;
		Solution solution=new Solution();
		ListNode res=solution.partition(test1, 1);
	}
}
