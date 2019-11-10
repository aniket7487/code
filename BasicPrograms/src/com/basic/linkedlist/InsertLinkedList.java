package com.basic.linkedlist;

public class InsertLinkedList {
	
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	
	public static void main(String args[]) {
		System.out.println("Start");
		InsertLinkedList insertLinkedList=new InsertLinkedList();
		insertLinkedList.addAtStart(21);
		insertLinkedList.addAtStart(121);
		insertLinkedList.addAtStart(31);
		insertLinkedList.addAtStart(41);
		insertLinkedList.display();
	}

	public void display() {

		Node current=head;
		if(head == null ) {
			System.out.println("No Linked List.");
			return;
		}
		while(current != null) {
			System.out.print(current.data + " ");
			current=current.next;
		}
		System.out.println();
	}

	public void addAtStart(int data) {

		Node newNode=new Node(data);
		if(head ==null) {
			head=newNode;
			tail=newNode;
		}else {
			Node temp=head;
			head=newNode;
			head.next=temp;
		}
	}

}
