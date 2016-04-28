/*
 * 将链表往前移一位
 */
package com.sam.example;

public class Solution {

	public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
