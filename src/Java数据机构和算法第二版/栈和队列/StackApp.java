package Java���ݻ������㷨�ڶ���.ջ�Ͷ���;
/**
 * StackX ����ʵ�ֵ�ջ����������ջ�ͳ�ջ��ʱ�临�Ӷȶ�Ϊ����O(1)��
 * ջ�������ĵ�ʱ�䲻����ջ��������ĸ�������˲���ʱ��̣ܶ�ջ����Ҫ�ȽϺ��ƶ�����
 * 
 *	ջʵ����
 *		1.������������
 *		2.�ָ���ƥ������( ����:({})   )
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