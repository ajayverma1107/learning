package com.learn.binary;


class Node{
	int value;
	Node next;
	int prev;
	int nextPrev;
	
	public Node(int value,Node next){
		this.value = value;
		this.next = next;
	}
}
