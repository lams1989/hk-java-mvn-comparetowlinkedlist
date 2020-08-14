package com.lams1989.comparetwolinkeList;

public class AppCompareTwoLinkedList {
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

	}

	public static void main(String args[]) {

		SinglyLinkedList llist1 = new SinglyLinkedList();
		SinglyLinkedList llist2 = new SinglyLinkedList();
		int[] llistItem1 = { 141, 302, 164, 530, 474 };
		int[] llistItem2 = { 141 };

		for (int i = 0; i < llistItem1.length; i++) {
			SinglyLinkedListNode llist_head1 = insertNodeAtHead(llist1.head, llistItem1[i]);
			llist1.head = llist_head1;
		}
		for (int i = 0; i < llistItem2.length; i++) {
			SinglyLinkedListNode llist_head2 = insertNodeAtHead(llist2.head, llistItem2[i]);
			llist2.head = llist_head2;
		}
		System.out.println(compareLists(llist1.head, llist2.head));

	}

	static boolean compareLists(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {
		if (headA != null && headB != null) {
			if (headA.data == headB.data) {
				return compareLists(headA.next, headB.next);
			} else
				return false;

		} else if (headA == null && headB == null) {
			return true;
		} else
			return false;

	}

	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode nodeInsert = new SinglyLinkedListNode(data);
		if (head == null) {
			return nodeInsert;
		}
		nodeInsert.next = head;
		return nodeInsert;
	}

	static void printLinkedList(SinglyLinkedListNode head) {

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}
}
