package com.thinkbig.algo.search;

public class Search {

	public static void main(String args[])
	{
		int array[] = {0, 1, 3, 4, 5, 8, 9, 11, 15, 17, 18, 19, 20, 21}; //sorted Array for searching
		linearSearch(array,1);
		binarySearch(array,19,0,array.length);
		jumpSearch(array,20,0,3);
	}

	private static void jumpSearch(int[] array, int element, int fromIndex, int blocks) {
		// TODO Auto-generated method stub
		jumpSearch(array,20,0,3,3);
	}

	private static void jumpSearch(int[] array, int element, int fromIndex, int blocks,int endLimit) {
		// TODO Auto-generated method stub
		int endIndex = fromIndex+endLimit > array.length ? fromIndex+(array.length-fromIndex-1) : fromIndex+endLimit;
		if(array[fromIndex] <= element && array[endIndex] >= element)
		{
			for(int i = fromIndex; i <= endIndex ; i++)
			{
				if(array[i] == element)
				{
					System.out.println("Jump Search : Element found at position "+ i);
				}
			}
		}
		else if(array[endIndex] < element)
			jumpSearch(array,element,fromIndex+endIndex,blocks,endLimit+blocks);
	}

	private static void binarySearch(int[] array, int element,int fromIndex,int toIndex) {
		// TODO Auto-generated method stub
		int midIndex = ((toIndex-fromIndex)/2)+fromIndex;
		if(array[midIndex] == element)
			System.out.println("Binary Search : Element found at position "+midIndex);
		else if(array[midIndex] < element)
			binarySearch(array,element,midIndex+1,toIndex);
		else
			binarySearch(array,element,fromIndex,midIndex-1);
	}

	private static void linearSearch(int[] array, int element) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < array.length ; i++)
		{
			if(array[i] == element)
			{
				System.out.println("Linear Search : Element found at position "+i);
				break;
			}
		}
	}
}
