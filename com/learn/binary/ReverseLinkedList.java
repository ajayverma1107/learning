package com.learn.binary;

public class ReverseLinkedList {
	
	
	public static void main(String[] args) {
		Node four = new Node(4,null);
		Node three = new Node(3,four);
		Node two = new Node(2,three);
		Node one = new Node(1,two);
		Node head = new Node(0,one);
		
		Node reverse = reverseList(head);
		while(reverse!= null){
			System.out.println(reverse.value);
			reverse =reverse.next;
		}
	}

	private static Node reverseList(Node head) {
		
		Node prev = null;
		Node current = head;
		while(current != null){
			Node tNext = current.next;
			current.next = prev;
			prev = current;
			current = tNext;
		}
		return prev;
	}

}

