package com.thinkbig.ds.graphs;

import java.util.Scanner;

public class MatrixRepresentation {
	public static void main(String args[])
	{
		System.out.println("Enter Number of Nodes ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int graphMatrix[][] = new int[size][size];
		System.out.println("Enter the edjes in 0/1");
		for(int i = 0 ; i < size; i++)
		{
			for(int j = 0 ; j < size; j++)
			{
				System.out.println(i+ " -> "+j);
				graphMatrix[i][j] = sc.nextInt();
			}
		}
		MatrixRepresentation graph = new MatrixRepresentation();
		graph.display(graphMatrix);
	}
	void display(int[][] graphMatrix)
	{
		for(int i = 0 ; i < graphMatrix.length ; i++)
		{
			System.out.print("Adjacent Vertex of node "+i);
			for(int j = 0 ; j < graphMatrix.length ; j++)
			{
				if(graphMatrix[i][j] == 1)
					System.out.print(" -> "+j);
			}
			System.out.println();
		}
	}
}
