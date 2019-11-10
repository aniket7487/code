package com.basic.linkedlist;

public class ReverseLinkedList {

	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	private Node head=null;
	
	public static void main(String args[]) {
		ReverseLinkedList reverseLinkedList=new ReverseLinkedList();
		Node head=new Node(43);
		reverseLinkedList.addNode(head);
		reverseLinkedList.addNode(new Node(14));
		reverseLinkedList.addNode(new Node(24));
		reverseLinkedList.addNode(new Node(4));
		reverseLinkedList.display(head);
		Node reverseNode=reverseLinkedList(head);
		System.out.println("Reversed List:");
		reverseLinkedList.display(reverseNode);
	}

	public static Node reverseLinkedList(Node currentNode) {
		Node previousNode=null;
		Node nextNode;
		while(currentNode!=null)
		{
			nextNode=currentNode.next;
			// reversing the link
			currentNode.next=previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode=currentNode;
			currentNode=nextNode;
		}
		return previousNode;
	}

	public void display(Node head) {
		Node temp=head;
		if(head == null) {
			System.out.println("No Element in LinkedList...");
		}
		while(temp != null) {
			System.out.println(temp.data + " ");
			temp=temp.next;
		}
		
	}

	public void addNode(Node current) {
		if(head == null) {
			head=current;
		}else {
			Node temp=head;
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next=current;
		}
	}
}
