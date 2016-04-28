package com.sam.example;

public class Solution {

	public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode beforeHead=new ListNode(0);
        beforeHead.next=head;
        ListNode pointer=beforeHead.next;
        ListNode current=beforeHead.next.next;
        int flag=0;
        while(current!=null){
            if(current.val==pointer.val){
                current=current.next;
                flag=1;
            }else if(current!=null && current.val!=pointer.val){
                if(flag==1){
                    pointer.val=current.val;
                    pointer.next=current.next;
                    flag=0;
                }else{
                    pointer=pointer.next;
                    current=current.next;
                }
            }
        }
        if(pointer.next==null){
            return beforeHead.next;
        }else{
            pointer=current;
            return beforeHead.next;
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Solution solution=new Solution();
//		ListNode head=new ListNode(1);
//		ListNode point2=new ListNode(1);
//		head.next=point2;
//		ListNode res=new ListNode(0);
//		res=solution.deleteDuplicates(head);
		
		ListNode test=new ListNode(1);
		ListNode test2=new ListNode(2);
		test.next=test2;
		test2=null;
	}

}
