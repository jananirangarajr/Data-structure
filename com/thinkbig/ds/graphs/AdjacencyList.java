package com.thinkbig.ds.graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AdjacencyListImpl {
	
	Node[] nodeArray;
	
	class Node {
		int node;
		Node nextNode;
		
		Node(int element)
		{
			this.node = element;
			this.nextNode = null;
		}
	}
	
	void createNodeArray(int size)
	{
		 nodeArray = new Node[size];
	}

	void createAjacencyList(int node, int adjacentNode) 
	{
		// TODO Auto-generated method stub
		Node vertex = new Node(adjacentNode);
		if(nodeArray[node] == null)
		{
			nodeArray[node] = vertex;
		}
		else
		{
			Node traverseVertex = nodeArray[node];
			while(traverseVertex.nextNode != null)
			{
				traverseVertex = traverseVertex.nextNode;
			}
			traverseVertex.nextNode = vertex;
		}
	}
	void display()
	{
		for(int i = 1 ; i < nodeArray.length ; i++)
		{
			System.out.print("Adjacency list of vertex "+i);
			if(nodeArray[i] != null)
			{
				Node node = nodeArray[i];
				while(node != null)
				{
					System.out.print(" -> "+node.node);
					node = node.nextNode;
				}
				System.out.println();
			}
		}
	}
}

public class AdjacencyList {
	public static void main(String args[])
	{
//		System.out.println("Enter the number of nodes");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			int size = Integer.parseInt(reader.readLine());
			AdjacencyListImpl adjacencyList = new AdjacencyListImpl();
			adjacencyList.createNodeArray(6);
			
//			for(int i = 1 ; i <= size ; i++)
//			{
//				System.out.println("Enter the vertices connecting node "+i+" ");
//				int adjacentNode = Integer.parseInt(reader.readLine());
//				do {
//				if(adjacentNode > 0 && adjacentNode < size-1)
//				{
//					adjacencyList.createAjacencyList(i,adjacentNode);
//				}
//				else
//				{
//					System.out.println("Node doesn't exists. Exiting the program");
//					break;
//				}
//			System.out.println("Continue - 0/1 true/false");
//			Boolean option = Boolean.parseBoolean(reader.readLine());
//			}while(option);
//			}
			adjacencyList.createAjacencyList(1, 2);
			adjacencyList.createAjacencyList(2, 1);
			adjacencyList.createAjacencyList(1, 3);
			adjacencyList.createAjacencyList(3, 1);
			adjacencyList.createAjacencyList(3, 4);
			adjacencyList.createAjacencyList(2, 4);
			adjacencyList.createAjacencyList(2, 5);
			adjacencyList.createAjacencyList(4, 5);
			adjacencyList.createAjacencyList(4, 2);
			adjacencyList.createAjacencyList(4, 3);
			adjacencyList.createAjacencyList(5, 2);
			adjacencyList.createAjacencyList(5, 4);
			
			adjacencyList.display();
			
//		} catch (NumberFormatException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}
