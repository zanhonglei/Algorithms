package chapter1$3$10;

import common.Stack;
import edu.princeton.cs.algs4.StdOut;

/******************************************************************************
 *  Compilation:  javac InfixToPostfix.java
 *  Execution:    java InfixToPostFix
 *  Dependencies: Stack.java StdIn.java StdOut.java
 *
 *  Reads in an infix expression and outputs an equivalent postfix
 *  expression.
 *
 *  Windows users: replace [Ctrl-d] with [Ctrl-z] to signify end of file.
 * 
 *  % java InfixToPostfix
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  [Ctrl-d]
 *  2 3 4 + 5 6 * * + 
 *
 *  % java InfixToPostfix | java EvaluatePostfix
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  [Ctrl-d]
 *  212
 *
 ******************************************************************************/

public class InfixToPostfix {
    public static void main(String[] args) {
    	
    	String str = "( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )";
    	char[] charArray = str.trim().toCharArray();
    	
        Stack<String> stack = new Stack<String>();
        int length = charArray.length;
        for(int i = 0; i < length ;i++) {
        	char c =  charArray[i];
        	String s = String.valueOf(c);
        	if      (s.equals("+")) stack.push(s);
            else if (s.equals("*")) stack.push(s);
            else if (s.equals(")")) StdOut.print(stack.pop() + " ");
            else if (s.equals("(")) StdOut.print("");
            else                    StdOut.print(s + " ");
        }
        StdOut.println(stack.toString());
    }
}
