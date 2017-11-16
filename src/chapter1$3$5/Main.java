package chapter1$3$5;

import chapter1$3$4.MyStack;

public class Main {
	
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<>();
		int N = 50;
		while(N>0) {
			stack.push(N%2);
			N/=2;
		}
		int size = stack.size();
		for(int i = 0;i < size;i++) {
			System.out.print(stack.pop());
		}
		
	}
}
