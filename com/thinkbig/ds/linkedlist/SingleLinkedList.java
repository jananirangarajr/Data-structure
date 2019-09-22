package com.thinkbig.ds.linkedlist;

public class SingleLinkedList {
	
	Node root = null;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	void add(int element)
	{
		Node node = new Node(element);
		if(root == null) {
			root = node;
		}
		else
		{
			Node parent = root;
			while(parent.next != null)
			{
				parent = parent.next;
			}
			parent.next = node;
		}	
	}
	void delete(int element)
	{
		Node node = root;
		if(node == root && node.data == element) {
			root = root.next;
			return;
		}
		else
		{
			while(node != null)
			{
				if(node.next.data == element) {
					node.next = node.next.next;
					return;
				}
				node = node.next;
			}
		}
			
	}
	void display() {
		if(root == null) 
			return;
		else
		{
			Node node = root;
			while(node != null)
			{
				System.out.println(node.data);
				node = node.next;
			}
		}
		System.out.println();
	}

}
