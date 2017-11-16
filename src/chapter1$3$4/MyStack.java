package chapter1$3$4;

import java.util.ArrayList;

public class MyStack<Item> {
	private ArrayList<Item> item = new ArrayList<Item>();
	public void push(Item item) {
		this.item.add(item);
	}
	public Item pop() {
		return  this.item.remove(this.item.size()-1);
	}
	public void show() {
		System.out.println(item.toString());
	}
	public int size() {
		return item.size();
	}
}
