package com.thinkbig.ds.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeapSort {
	public static void main(String args[])
	{
		System.out.println("Enter the size of the heap ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			int size = Integer.parseInt(br.readLine());
			BinaryHeap heap = new BinaryHeap(size);
			System.out.println("Enter the Elements");
			for(int i = 0 ; i < size ; i++)
			{
				heap.heapArray[i] = Integer.parseInt(br.readLine());
			}
			heap.createMinHeap();
			for(int i = size-1 ; i >= 0 ; i--)
			{
				heap.delete();
			}
			System.out.println("Elements after heap sort");
			for(int i = size-1 ; i >=0 ; i--)
			{
				System.out.println(heap.heapArray[i]);
			}
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
	}

}
