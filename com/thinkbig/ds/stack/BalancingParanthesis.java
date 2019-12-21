package com.thinkbig.ds.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancingParanthesis {
	public static void main(String args[])
	{
		BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the expression");
		try {
			String input = bc.readLine();
			checkBalancing(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void checkBalancing(String input) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0 ; i < input.length() ; i++)
		{
			char c = input.charAt(i);
			if(stack.isEmpty())
				stack.push(c);
			else
			{
				if((c == ')' && stack.peek() == '(') || (c == '(' && stack.peek() == ')'))
					stack.pop();
				else
					stack.push(c);
					
			}
		}
		if(stack.isEmpty())
			System.out.println("Balanced Paranthesis");
		else
			System.out.println("Unbalanced Paranthesis ");
	}
}
