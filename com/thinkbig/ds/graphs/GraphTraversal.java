package com.thinkbig.ds.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class BFS {
	int [][] graphMatrix;
	int []visited;
	Queue<Integer> queue = new LinkedList<Integer>();

	public BFS(int[][] graphMatrix) {
		// TODO Auto-generated constructor stub
		this.graphMatrix = graphMatrix;
		this.visited = new int[graphMatrix.length];
	}

	public void traversal(Integer startingVertex) {
		// TODO Auto-generated method stub
		if(startingVertex == null)
		{
			return;
		}
		else
		{
			if(visited[startingVertex] != 1) 
			{
				visited[startingVertex] = 1;
				for(int i = 0 ; i < graphMatrix.length ; i++)
				{
					if(graphMatrix[startingVertex][i] == 1 && !queue.contains(i)&& visited[i] != 1)
					{
						queue.add(i);
					}
				}
			}
			System.out.print(" "+startingVertex);
			traversal(queue.poll());
			
		}
	}	
}
class DFS {
	int [][] graphMatrix;
	int []visited;
	Stack<Integer> stack = new Stack<Integer>();

	public DFS(int[][] graphMatrix) {
		// TODO Auto-generated constructor stub
		this.graphMatrix = graphMatrix;
		this.visited = new int[graphMatrix.length];
	}

	public void traversal(Integer startingVertex) {
		// TODO Auto-generated method stub
		if(startingVertex == null)
		{
			return;
		}
		else
		{
			
			stack.push(startingVertex);
			for(int i = 0 ; i < graphMatrix.length ; i++)
			{
				if(graphMatrix[startingVertex][i] == 1 && !stack.contains(i) && visited[i] != 1)
				{
					traversal(i);
				}
			}
			int visit = stack.pop();
			visited[visit] = 1;
			System.out.print(" "+visit);	
		}
	}		
}

public class GraphTraversal {
	
	public static void main(String args[])
	{
		MatrixRepresentation graph = new MatrixRepresentation();
		MatrixRepresentation.main(null);
		int[][] graphMatrix = graph.getMatrix();
//		int[][] graphMatrix = {{0,1,1,0,0,0},{1,0,0,0,0,1},{1,0,0,1,0,0},{0,0,1,0,1,0},{0,0,0,0,1,0},{0,1,0,0,0,0}};
		System.out.println("BFS ");
		BFS bfs = new BFS(graphMatrix);
		bfs.traversal(3);
		
		System.out.println("\n DFS");
		DFS dfs = new DFS(graphMatrix);
		dfs.traversal(2);
		
	}

}
