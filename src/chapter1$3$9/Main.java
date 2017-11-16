package chapter1$3$9;

import common.Stack;

public class Main {
	
	public static void main(String[] args) {
		String str = "1+2)*3-4)*5-6)))";
		// ((1+2)*((3-4)*(5-6)))
		Stack<Character> s = new Stack<>();
		Stack<Character> temp = new Stack<>();
		
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		
		for(int i = 0;i < length;i++) {
			if(charArray[i]==')') {
				temp.push(')');
				while(!s.peek().equals('(')&&s.isEmpty()) {
					temp.push(s.pop());
				}
				temp.push('(');
			}else {
				s.push(charArray[i]);
			}
		}
	}
}
