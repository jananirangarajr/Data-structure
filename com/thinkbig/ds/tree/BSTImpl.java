package com.thinkbig.ds.tree;

class BST{
	Node root;
	class Node
	{
		int data;
		Node left,right;
		
		Node(int data)
		{
			this.data = data;
			this.left = this.right = null;
		}
	}
	//insert 
	void insert(int data)
	{
		if(root == null)
		{
			root = new Node(data);
			return;
		}
		insert(root,data);
	}
	Node insert(Node node, int data)
	{
		if(node == null)
			return new Node(data);
		if(data < node.data)
			node.left = insert(node.left,data);
		else if (data > node.data)
			node.right = insert(node.right,data);
		return node;
	}
	//display
	void display()
	{
		if(root == null)
			return;
		else
			display(root);
	}
	void display(Node node)
	{
		if(node.left != null)
			display(node.left);
		System.out.println(node.data);
		if(node.right != null)
			display(node.right);
	}
	//delete
	void delete(int data)
	{
		if(root == null)
			return;
		else
			delete(root,data);
	}
	Node delete(Node node, int data)
	{
		if(data < node.data)
			node.left = delete(node.left,data);
		else if(data > node.data)
			node.right = delete(node.right,data);
		else if(node.data == data)
		{
			if(node.left == null && node.right == null)
				return null;
			else if(node.left != null || node.right != null)
			{
				/* *** Inorder successor or Inorder Predecessor of a deleted node will be replaced always *** */ 
				// when left null find the minimum value at right and replace node's data
				if(node.left == null)
				{
					Node minRightNode = findRightMin(node.right);
					int minRightNodeData = minRightNode.data;
					node = delete(node,minRightNode.data);
					node.data = minRightNodeData;
				}
				// when left is not null find the maximum value at left and replace node's data
				else
				{
					Node maxLeftNode = findLeftMax(node.left);
					int maxLeftNodeData = maxLeftNode.data;
					node = delete(node,maxLeftNode.data);
					node.data = maxLeftNodeData;
				}

			}
		}
		return node;
	}
	Node findRightMin(Node node)
	{
		if(node != null && node.left != null)
			node = findRightMin(node.left);
		return node;
	}
	Node findLeftMax(Node node)
	{
		if(node != null && node.right != null)
			node = findLeftMax(node.right);
		return node;
	}
}

public class BSTImpl {
	public static void main(String args[])
	{
		BST bst = new BST();
		//set 1 to test right tree alone
		bst.insert(5);
		bst.insert(16);
		//set 1a to test
		bst.insert(7);
		//set 1b to test
		bst.insert(6);
		//set 1c to test
		bst.insert(14);
		bst.display();
		bst.delete(5);
		System.out.println("--- After Delete (5 deleted)---");
		bst.display();
		System.out.println("----------------------");
		bst = new BST();
		//set 2 to test left tree alone
		bst.insert(15);
		bst.insert(11);
		//set 2a to test
		bst.insert(9);
		//set 2b to test
		bst.insert(10);
		//set 2c to test
		bst.insert(8);
		bst.display();
		bst.delete(15);
		System.out.println("--- After Delete (15 Deleted)---");
		bst.display();
		System.out.println("----------------------");
		bst = new BST();
		//set 3 to test with both children
		bst.insert(10);
		bst.insert(6);
		bst.insert(4);
		bst.insert(3);
		bst.insert(5);
		bst.insert(8);
		bst.insert(7);
		bst.insert(9);
		bst.insert(16);
		bst.insert(14);
		bst.insert(13);
		bst.insert(15);
		bst.insert(18);
		bst.insert(17);
		bst.insert(19);
		bst.display();
		bst.delete(16);
		bst.delete(10);
		System.out.println("--- After Delete (16,10 deleted)---");
		bst.display();
		System.out.println("----------------------");

	}

}

