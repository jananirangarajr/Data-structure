package com.thinkbig.ds.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class StackArray {
	static String stack[] =  new String[StackArrayImpl.size];
	static int count=0;
	public void push() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			do {
				System.out.println("Enter the element to push");
				stack[count] = sc.next();
				count++;
				System.out.println("Continue Y/N : ");
			}while(sc.next().equalsIgnoreCase("y"));
		}
		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("Stack OverFlow");
		}
	}

	public void pop() {
		// TODO Auto-generated method stub
		try {
			if(stack[0] == null)
			{
				System.out.println("Stack UnderFlow");
			}
			else
			{
				stack[--count] = null;
			}
		}
		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("Stack UnderFlow");
		}
	}


}
public class StackArrayImpl{
	static int size;
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		System.out.println("Enter the size of the stack");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(reader.readLine());
		while(true) {
			System.out.println("Push or Pop or exit");
			String operation = reader.readLine();
			StackArray stack = new StackArray();
			if(operation.equalsIgnoreCase("push"))
			{
				stack.push();
			}
			else if(operation.equalsIgnoreCase("pop"))
			{
				stack.pop();
			}
			else
			{
				break;
			}
		}
	}
}
