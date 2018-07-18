package com.jda.core;
import com.jda.utility.StackImp;
import com.jda.utility.Linklist;
public class Parenthesis {
static StackImp stack = new StackImp(10);
public static boolean isPair(char c) {
		if (stack.top >= 0) {
			if (c == ')' && stack.charArray[stack.top] == '(') {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter the expression:");
		String expression = Linklist.getString();
		for (int i = 0; i < expression.length(); i++) 
		
			if ((expression.charAt(i) == '(')) {
				stack.push('(');
			}
else if ((expression.charAt(i) == ')') ) 
			{	if (!isPair(expression.charAt(i))) {
					System.out.println("The expression is not balanced");
					return;
				}
		else {
					stack.top = stack.top - 1;
				}
			}
		
				if (stack.checkEmpty()) {
			System.out.println("Balanced");
		}
	}
}
