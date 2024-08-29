 package com.coding.data.structures;

public class BalancedPranthesis {

	private static boolean isBracketsBalanced(String str) {
		int i = -1;
		char[] stack = new char[str.length()];
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[')
				stack[++i] = ch;
			else {
				if (i >= 0 && ((stack[i] == '(' && ch == ')') || (stack[i] == '{' && ch == '}')
						|| (stack[i] == '[' && ch == ']')))
					i--;
				else
					return false;
			}
		}    
		return i == -1;
	}

	public static void main(String[] args) {
		String str = "{()}[]";
		if (isBracketsBalanced(str))
			System.out.println("Balanced");
		else {
			System.out.println("Not balanced");
		}
	}
}
