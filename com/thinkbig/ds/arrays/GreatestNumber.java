package com.thinkbig.ds.arrays;

public class GreatestNumber {
	
	public static void main (String args[]) {
		char s[] = "1234".toCharArray();
		boolean changed = false;
		for (int i = s.length-1; i >= 0; i--) {
			if (s[i] > s[i-1]) {
				s = sort(s,i);
				char temp = s[i];
				s[i] = s[i-1];
				s[i-1] = temp;
				changed = true;
				break;
			}
		}
		if (changed) {
			System.out.println(s);
		}
		else 
			System.out.println("Not Possible");
	}
	private static char[] sort (char s[] , int index) {
		for (int i = index; i < s.length-1; i++) {
			for(int j = i+1 ;  j < s.length; j++) {
				if (s[i] > s[j]) {
					char temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		return s;
	}

}
