package com.basic.datastructure;

public class ReversedSinglyLinkedList {

	static Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
		
	}
	public static void main(String[] args) {

		ReversedSinglyLinkedList lList=new ReversedSinglyLinkedList();
		lList.head=new Node(10);
		lList.head.next=new Node(20);
		lList.head.next.next=new Node(30);
		lList.head.next.next.next=new Node(40);
		lList.printLinkedList(head);
		head=lList.reverseList(head);
		lList.printLinkedList(head);
	}
	private Node reverseList(Node node) {

		Node next=null;
		Node current=node;
		Node previous=null;
		while(current!= null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		node=previous;
		return node;
	}
	private void printLinkedList(Node node) {

		while(node!= null) {
			System.out.println(node.data +" ");
			node=node.next;
		}
	}

}
