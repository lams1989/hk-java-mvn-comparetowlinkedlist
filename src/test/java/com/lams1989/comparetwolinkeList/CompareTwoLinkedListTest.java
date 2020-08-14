package com.lams1989.comparetwolinkeList;

import com.lams1989.comparetwolinkeList.AppCompareTwoLinkedList.SinglyLinkedList;
import com.lams1989.comparetwolinkeList.AppCompareTwoLinkedList.SinglyLinkedListNode;

import junit.framework.TestCase;

public class CompareTwoLinkedListTest extends TestCase{

	public void testCmpare1Size() {
		SinglyLinkedList llist1 = new SinglyLinkedList();
		SinglyLinkedList llist2 = new SinglyLinkedList();
		int[] llistItem1 = { 141, 302, 164, 530, 474 };
		int[] llistItem2 = { 141 };

		for (int i = 0; i < llistItem1.length; i++) {
			SinglyLinkedListNode llist_head1 = AppCompareTwoLinkedList.insertNodeAtHead(llist1.head, llistItem1[i]);
			llist1.head = llist_head1;
		}
		for (int i = 0; i < llistItem2.length; i++) {
			SinglyLinkedListNode llist_head2 = AppCompareTwoLinkedList.insertNodeAtHead(llist2.head, llistItem2[i]);
			llist2.head = llist_head2;
		}
		boolean expected = false; 
		boolean actual = AppCompareTwoLinkedList.compareLists(llist1.head, llist2.head);
		assertEquals(expected, actual);
	}
	
	public void testCmpare1iguales() {
		SinglyLinkedList llist1 = new SinglyLinkedList();
		SinglyLinkedList llist2 = new SinglyLinkedList();
		int[] llistItem1 = { 141, 302, 164, 530, 474 };
		int[] llistItem2 = { 141, 302, 164, 530, 474 };

		for (int i = 0; i < llistItem1.length; i++) {
			SinglyLinkedListNode llist_head1 = AppCompareTwoLinkedList.insertNodeAtHead(llist1.head, llistItem1[i]);
			llist1.head = llist_head1;
		}
		for (int i = 0; i < llistItem2.length; i++) {
			SinglyLinkedListNode llist_head2 = AppCompareTwoLinkedList.insertNodeAtHead(llist2.head, llistItem2[i]);
			llist2.head = llist_head2;
		}
		boolean expected = true; 
		boolean actual = AppCompareTwoLinkedList.compareLists(llist1.head, llist2.head);
		assertEquals(expected, actual);
	}
	
	public void testCmpare2vacios() {
		SinglyLinkedList llist1 = new SinglyLinkedList();
		SinglyLinkedList llist2 = new SinglyLinkedList();

			llist1.head = llist1.head;
		
			llist2.head = llist2.head;
		
		boolean expected = true; 
		boolean actual = AppCompareTwoLinkedList.compareLists(llist1.head, llist2.head);
		assertEquals(expected, actual);
	}
}
