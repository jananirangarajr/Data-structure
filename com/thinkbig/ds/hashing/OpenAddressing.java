package com.thinkbig.ds.hashing;

import java.util.Scanner;

class OpenAddressingImpl{
	int hashArray[];
	public OpenAddressingImpl(int size) {
		// TODO Auto-generated constructor stub
		hashArray = new int[size];
	}
	public int calculateIndex(int element) {
		// TODO Auto-generated method stub
		 int index = element%2;
		 int length = hashArray.length-1;
		 while(index <= length && hashArray[index] != 0)
		 {
			 if(index == hashArray.length-1)
			 {
				 index = 0;
				 length = (element%2)-1;
			 }
			 else
				 index += 1;
		 }
		 if(index == element%2 && hashArray[index]!=0)
				 return hashArray.length;
		 
		 return index;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("-- Elements Display--");
		for(int i = 0; i < hashArray.length; i++)
			System.out.println(hashArray[i]);
	}
	
}
public class OpenAddressing {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		OpenAddressingImpl hashing = new OpenAddressingImpl(size);
		while(true)
		{
			System.out.print("Enter the element");
			int element = sc.nextInt();
			int index = hashing.calculateIndex(element);
			if(index < size)
			{
				hashing.hashArray[index]= element;
			}
			else
			{
				System.out.println("OverFlow");
				break;
			}
			System.out.print("Continue Y/N");
			String option = sc.next();
			if(!option.equalsIgnoreCase("Y"))
				break;
		}
		hashing.display();
		
	}
}
