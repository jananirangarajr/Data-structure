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
			if(option.equalsIgnoreCase("Y"))
				continue;
			else 
				break;
		}
		hashing.display(0);
	}
}
