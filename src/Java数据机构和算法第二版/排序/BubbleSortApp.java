package Java���ݻ������㷨�ڶ���.����;

/**
 * ð������
 * 
 * @author founder
 *
 */
public class BubbleSortApp {
	public static void main(String[] args) {
		ArrayBub a = new ArrayBub(10);
		a.insert(3);
		a.insert(4);
		a.insert(1);
		a.insert(2);
		a.insert(6);
		a.insert(7);
		a.insert(8);
		a.insert(9);
		a.insert(5);
		a.insert(0);
		a.disPlay();
		a.bubbleSort();
		a.disPlay();
	}
}

class ArrayBub {
	private long[] a;
	private int nElems;

	public ArrayBub(int max) {
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		a[nElems++] = value;
	}

	public void disPlay() {
		for (long l : a) {
			System.out.print(l + "  ");
		}
		System.out.println();
	}

	public void bubbleSort() {
		int length = a.length;
		for (int i = 0; i < length - 1; i++) { // �����n-1������
			for (int j = 0; j < length - i - 1; j++) { // �Ե�ǰ��������a[0......length-i-1]��������(j�ķ�Χ�ܹؼ��������Χ��������С��)
				if(a[j]>a[j+1]) {
					swap(j,j+1);
				}
			}
		}
	}

	public void swap(int min, int max) {
		long temp = a[min];
		a[min] = a[max];
		a[max] = temp;
	}
}
