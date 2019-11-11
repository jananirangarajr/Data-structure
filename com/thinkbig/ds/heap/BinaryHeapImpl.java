package com.thinkbig.ds.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BinaryHeap {
	int heapArray[];
	static int deleteCount = 0;
	protected BinaryHeap(int size)
	{
		heapArray = new int[size];
	}
	protected void createMinHeap()
	{
		if(heapArray.length == 0)
			return;
		else
			minHeap(1,heapArray.length);
	}
	private void minHeap(int index,int size)
	{
		if(index > size || index <= 0 || size == 1)
		{
			return;
		}
		else
		{
			if(index == 1)
			{
				if(heapArray[index] < heapArray[index-1]) {
					swap(index,index-1);
				}
				minHeap(index+1,size);
			}
			else if(index != size)
			{
				int parentIndex = (index-1)/2;
				if(heapArray[parentIndex] > heapArray[index])
				{
					swap(index,parentIndex);
					minHeap(parentIndex,size);
				}
				minHeap(index+1,size);
			}
		}
	}
	public void createMaxHeap()
	{
		if(heapArray.length == 0)
			return;
		else
			maxHeap(1,heapArray.length);
	}
	private void maxHeap(int index, int size)
	{
		if(index > size || index <= 0 )
		{
			return;
		}
		else
		{
			if(index == 1)
			{
				if(heapArray[index] > heapArray[index-1]) {
					swap(index,index-1);
				}
				maxHeap(index+1,size);
			}
			else if(index != size)
			{
				int parentIndex = (index-1)/2;
				if(heapArray[parentIndex] < heapArray[index])
				{
					swap(index,parentIndex);
					maxHeap(parentIndex,size);
				}
				maxHeap(index+1,size);
			}
		}
	}
	private void swap(int i, int j)
	{
		int temp = heapArray[i];
		heapArray[i] = heapArray[j];
		heapArray[j] = temp;
	}
	public void display()
	{
		System.out.println("Display Array Values ");
		for(int i = 0 ; i < heapArray.length; i++)
			System.out.println(heapArray[i]);
	}
	public void delete()
	{
		if(heapArray.length <= 1)
			heapArray = null;
		else {
			deleteCount++;
			int temp = heapArray[0];
			heapArray[0] = heapArray[heapArray.length-deleteCount];
			heapArray[heapArray.length-deleteCount] = temp;
			minHeap(1,heapArray.length-deleteCount);
		}
	}
}
public class BinaryHeapImpl {
	
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
			System.out.println("MinHeap or MaxHeap ");
			String option = br.readLine();
			if(option.equalsIgnoreCase("MinHeap"))
			{
				heap.createMinHeap();
				heap.display();
				heap.delete();// either minheap or mapHeap delete -- here delete method implemented for minheap
				heap.display();
				heap.delete();
				heap.display();
				heap.delete();
				heap.display();
			}
			else if(option.equalsIgnoreCase("MaxHeap"))
			{
				heap.createMaxHeap();
				heap.display();
			}
			else
			{
				System.out.println("Enter a valid option");
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
	}
}
//https://www.youtube.com/watch?v=HqPJF2L5h9U -- reference tutorial
