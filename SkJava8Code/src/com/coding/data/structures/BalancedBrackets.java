package com.coding.data.structures;

import java.util.Stack;

public class BalancedBrackets {
	private static boolean isBracketsBalanced(String str) {
		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			// If the current character is an opening bracket, push it to the stack
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				// If the stack is empty or the current character does not match the top of the
				// stack, return false
				if (stack.isEmpty())
					return false;
				char top = stack.pop();
				if ((top == '(' && ch != ')') || (top == '{' && ch != '}') || (top == '[' && ch != ']')) {
					return false;
				}
			}
		}
		// If the stack is empty, brackets are balanced; otherwise, they are not
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String str = "{()}[]";
		System.out.println(isBracketsBalanced(str) ? "Balanced" : "Not balanced");
	}
}
