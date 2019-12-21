package com.thinkbig.ds.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixPostfix {
	
	public static void main(String args[])
	{
		BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the expression");
		try {
			String input = bc.readLine();
			getPostfixExpression(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void getPostfixExpression(String input) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0 ; i < input.length() ; i++)
		{
			char c = input.charAt(i);
			if((c >= 65 && c <= 90) || (c>=97 && c<=122))
			{
				System.out.print(" "+c);
			}
			else
			{
				if(c == '(')
					stack.push(c);
				else if(c == ')')
				{
					while(!stack.isEmpty())
					{
						if(stack.peek() == '(')
						{
							stack.pop();
							break;
						}
						else
						{
							System.out.print(" "+stack.pop());
						}
					}
				}
				else
				{
					if(stack.empty())
						stack.push(c);
					else
					{
						int currentPrecedence = checkPrecedence(c);
						int topPrecedence = checkPrecedence(stack.peek());
						if(currentPrecedence > topPrecedence)
							stack.push(c);
						else
						{
							while(!stack.isEmpty() && currentPrecedence < topPrecedence)
							{
								System.out.print(" "+stack.pop());
								if(!stack.empty())
									topPrecedence = checkPrecedence(stack.peek());
							}
							stack.push(c);
						}
					}
				}
			}
		}
		if(!stack.empty())
		{
			int size = stack.size();
			for(int i = 0 ; i < size  ; i++)
			{
				System.out.print(" "+stack.pop());
			}
		}
	}
	static int checkPrecedence(char c) {
		// TODO Auto-generated method stub
		switch(c)
		{
		case '+' :
		case '-' :
			return 2;
		case '*' :
		case '/' :
			return 3;
		case '^' :
		case '&' :
		case '|' :
			return 1;
		}
		return 0;
	}
}
