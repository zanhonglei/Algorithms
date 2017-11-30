package Java数据机构和算法第二版.栈和队列;
/**
 * 优先队列
 * 	insert()方法先队列中是否有数据项；
 * 	如果没有，就插入下标为0的单元里，
 * 	否则，从数组顶部开始上移存在的数据项，
 * 	直到找到新数据项应当插入的位置，然后，插入新数据项，并把nItem+1
 * 
 * 优先队列不像基本队列那样必须有头和尾字段，它的头总是nItems-1，尾总是0
 * 
 * 效率问题：
 * 	插入操作的时间复杂度O(N)
 * 	删除操作的时间复杂度O(1)
 * @author founder
 *
 */
public class PriorityQueueApp {
	public static void main(String[] args) {
		PriorityQ p = new PriorityQ(5);
		p.insert(3);
		p.insert(2);
		p.insert(1);
		p.insert(5);
		p.insert(4);
		
		while(!p.isEmpty()) {
			System.out.println(p.remove());
		}
		System.out.println();
	}
}
class PriorityQ{
	private int maxSize;
	private long[] queArray;
	private int nItems;
	
	public PriorityQ(int s) {
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}
	public void insert(long item) {
		int j ;
		if(nItems == 0) {
			queArray[nItems++]=item;
		}else {
			for( j = nItems - 1;j >= 0;j--) {
				if(item > queArray[j]) {
					queArray[j+1] = queArray[j];
				}else {
					break;
				}
			}
			queArray[j+1] = item;
			nItems++;
		}
	}
	public long remove() {
		return queArray[--nItems];
	}
	public long peekMin() {
		return queArray[nItems-1];
	}
	public boolean isEmpty() {
		return nItems == 0;
	}
	public boolean isFull() {
		return nItems == maxSize;
	}
}
