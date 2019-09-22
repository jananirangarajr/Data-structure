package com.thinkbig.ds.linkedlist;

class DoublyLinkedList {
	
	Node root = null;
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data)
		{
			this.data = data;
			next = prev = null;
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
			node.prev = parent;
		}	
	}
	void display()
	{
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
	void delete(int element)
	{
		Node node = root;
		if(node == root && node.data == element) {
			root = root.next;
			root.prev = null;
			return;
		}
		else
		{
			while(node.next != null)
			{
				if(node.next.data == element) {
					if(node.next.next!=null)
					node.next.next.prev = node;
					node.next = node.next.next;
					return;
				}
				node = node.next;
			}
		}
			
	}
}
class CircularLinkedList extends DoublyLinkedList{
	
	Node root = null;
	void add(int element)
	{
		Node node = new Node(element);
		if(root == null) {
			root = node;
		}
		else
		{
			Node parent = root;
			while(parent.next != null && parent.next != root)
			{
				parent = parent.next;
			}
			parent.next = node;
			node.prev = parent;
			node.next = root;
			root.prev = node;
		}
	}
	void delete(int element)
	{
		Node node = root;
		if(node == root && node.data == element) {
			root = root.next;
			root.prev = null;
			return;
		}
		else
		{ 
			while(node.next != null)
			{
				if(node.next.data == element) {
					node.next.next.prev = node;
					node.next = node.next.next;
					return;
				}
				node = node.next;
			}
		}
	}
	void display()
	{
		if(root == null) 
			return;
		else
		{
			Node node = root;
			while(node != null && node.next != root)
			{
				System.out.println(node.data);
				node = node.next;
			}
		}
		System.out.println();
	}
}
