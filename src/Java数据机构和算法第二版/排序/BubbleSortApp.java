package Java数据机构和算法第二版.排序;

/**
 * 冒泡排序
 * 第一趟进行9次比较
 * 第二趟进行8次比较
 * 如此类推
 * 直到最后一次比较，对于10个数据项，就是 9+8+7+6+5+4+3+2+1=45
 * 如果数组中有N个数据项，则
 * 第一趟进行N-1次比较
 * 第二趟进行N-2次比较
 * (N-1)+(N-2)+(N-3)+...+1=N*(N-1)/2
 * 当N为10时，N*(N-1)/2等于45(10*9/2)
 * 交换和比较操作次数都和N^2成正比，由于常数不算在大O表示法中，可以忽略2和4，
 * 所以冒泡的时间复杂度为O(N^2)级
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
		for (int i = 0; i < length - 1; i++) { // 最多做n-1趟排序
			for (int j = 0; j < length - i - 1; j++) { // 对当前无序区间a[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)
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
