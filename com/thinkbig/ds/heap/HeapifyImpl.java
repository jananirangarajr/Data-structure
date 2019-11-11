package com.thinkbig.ds.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Heapify {
	int heapArray[];
	protected Heapify(int size)
	{
		heapArray = new int[size];
	}
	public void heapifyOperation()
	{
		if(heapArray.length <= 1)
			return;
		else
			heapifyOperation(heapArray.length-1);
	}
	private void heapifyOperation(int index)
	{
		if(index < 0 ) 
			return;
		else if((index*2)+1 > heapArray.length || (index*2)+2 > heapArray.length)
		{
			heapifyOperation(index-1);
		}
		else
		{
			int leftChildIndex = (index*2)+1;
			int rightChildIndex = (index*2)+2;
			if(leftChildIndex < heapArray.length)
			{
				if(rightChildIndex >= heapArray.length && (heapArray[index] < heapArray[leftChildIndex]))
				{
					swap(leftChildIndex,index);
				}
				else if(rightChildIndex < heapArray.length)
				{
					if(heapArray[index] < heapArray[leftChildIndex] && heapArray[leftChildIndex] > heapArray[rightChildIndex]) {
						swap(leftChildIndex,index);
						heapifyOperation(leftChildIndex);
					}
					else if(heapArray[index] < heapArray[rightChildIndex] && heapArray[rightChildIndex] > heapArray[leftChildIndex]) {
						swap(rightChildIndex,index);
						heapifyOperation(rightChildIndex);
					}
				}
			}
			heapifyOperation(index-1);
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
}
public class HeapifyImpl{
	public static void main(String args[])
	{
		System.out.println("Enter the size of the heap ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			int size = Integer.parseInt(br.readLine());
			Heapify heap = new Heapify(size);
			System.out.println("Enter the Elements");
			for(int i = 0 ; i < size ; i++)
			{
				heap.heapArray[i] = Integer.parseInt(br.readLine());
			}
			heap.heapifyOperation();
			heap.display();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
	}
}
