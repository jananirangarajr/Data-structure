package com.thinkbig.ds.linkedlist;

class CircularImpl extends SingleLinkedList{
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
			node.next = root;
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
			while(node.next != null)
			{
				if(node.next.data == element) {
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
