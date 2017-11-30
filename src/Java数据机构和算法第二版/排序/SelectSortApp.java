package Java数据机构和算法第二版.排序;

public class SelectSortApp {
	public static void main(String[] args) {
		ArraySel a = new ArraySel(10);
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
		a.selectionSort();
		a.disPlay();
	}
}

class ArraySel {
	private long[] a;
	private int nElems;

	public ArraySel(int max) {
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

	public void selectionSort() {
		int length = a.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (a[i] > a[j]) {
					swap(i, j);
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
