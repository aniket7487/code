package com.basic.datastructure;

public class SinglyLinkedList {
	
	Node head;
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
		
	}

	public static void main(String[] args) {

		SinglyLinkedList iList=new SinglyLinkedList();
		iList.head = new Node(1);
		Node second=new Node(20);
		Node third=new Node(10);
		iList.head.next = second; // Link first node with the second node 
        second.next = third; // Link first node with the second node 
  
        iList.printList();
	}

	private void printList() {

		Node n = head; 
        while (n != null) { 
            System.out.print(n.data + " "); 
            n = n.next; 
        } 
	}

}
