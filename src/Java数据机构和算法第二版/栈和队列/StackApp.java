package Java数据机构和算法第二版.栈和队列;
/**
 * StackX 类中实现的栈，数据项入栈和出栈的时间复杂度都为常数O(1)，
 * 栈操作所耗的时间不依赖栈中数据项的个数，因此操作时间很短，栈不需要比较和移动操作
 * 
 *	栈实例：
 *		1.单词逆序问题
 *		2.分隔符匹配问题( 例如:({})   )
 * @author founder
 *
 */
public class StackApp {
	public static void main(String[] args) {
		StackX s = new StackX(4);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.peek());
		System.out.println(s.isFull());
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		System.out.println(s.isFull());
	}
}

class StackX {
	private int stackDeep;
	private long[] stackArray;
	private int maxSize;

	public StackX(int maxSize) {
		this.stackArray = new long[maxSize];
		stackDeep = 0;
		this.maxSize = maxSize;
	}

	public void push(long value) {
		stackArray[stackDeep++] = value;
	}

	public long pop() {
		return stackArray[--stackDeep];

	}

	public long peek() {
		return stackArray[stackDeep-1];
	}

	public boolean isEmpty() {
		return stackDeep == 0;
	}

	public boolean isFull() {
		return maxSize  == stackDeep;
	}
}