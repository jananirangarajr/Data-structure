package com.thinkbig.ds.hashing;

import java.util.Scanner;

class Node 
{
	int element;
	Node node;
	Node(int number)
	{
		this.element = number;
		this.node = null;
	}
}

class SeperateChaining {
	
	Node[] hashArray;
	SeperateChaining()
	{
		hashArray = new Node[10];
	}
	private int calculateIndex(int number) {
		// TODO Auto-generated method stub
		return number%2;
	}
	public void createNode(int number) {
		// TODO Auto-generated method stub
		int index = calculateIndex(number);
		Node node = new Node(number);
		if(hashArray[index] == null)
		{
			hashArray[index] = node;
		}
		else
		{
			Node parent = hashArray[index];
			while(parent.node != null)
			{
				parent = parent.node;
			}
			parent.node = node;
		}
		
	}
	public void display(int index)
	{
		Node parent = hashArray[index];
		while(parent != null)
		{
			System.out.println(parent.element);
			parent = parent.node;
		}
	}
	public void searchElement(int element) {
		// TODO Auto-generated method stub
		int index = calculateIndex(element);
		Node parent = hashArray[index];
		while(parent.element != element && parent.node != null)
		{
			parent = parent.node;
		}
		if(parent.element == element)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element Not Found");
		}
	}
}

public class SeperateChainingImpl {
	public static void main(String args[])
	{
		SeperateChaining hashing = new SeperateChaining();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Element");
			int number = sc.nextInt();
			hashing.createNode(number);
			System.out.println("Continue Y/N");
			String option = sc.next();
			if(!option.equalsIgnoreCase("Y"))
				break;
		}
		hashing.display(0);
		System.out.println("Enter the element to search");
		int element = sc.nextInt();
		hashing.searchElement(element);
	}
}
