package com.sam.example;

public class Solution {
	public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null){
        	return head;
        }
        ListNode beforeHead=new ListNode(0);
        beforeHead.next=head;
        ListNode list2=beforeHead.next.next;
        head.next=null;
        ListNode list1=beforeHead;
        while(list2!=null){
        	while(true){
        		if(list1.next!=null){
        			if(list1.next.val>list2.val){
                		ListNode temp=list2;
                		list2=list2.next;
                		temp.next=list1.next;
                		list1.next=temp;
                		list1=beforeHead;
                		break;
                	}else{
                		list1=list1.next;
                	}
        		}else{
        			ListNode temp=list2;
            		list2=list2.next;
            		temp.next=list1.next;
            		list1.next=temp;
            		list1=beforeHead;
            		break;
        		}    		
        	}
        }
        return beforeHead.next;
    }
	public static void main(String[] args){
		ListNode test1=new ListNode(3);
		ListNode test2=new ListNode(1);
		ListNode test3=new ListNode(4);
		test1.next=test2;
		test2.next=test3;
		Solution solution=new Solution();
		ListNode res=solution.insertionSortList(test1);
	}
}
