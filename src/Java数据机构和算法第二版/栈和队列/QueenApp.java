package Java数据机构和算法第二版.栈和队列;
/**
 * 循环队列（双端队列)
 * 和栈一样，队列中插入数据项和移除数据项的时间复杂度均为O(1)
 * 
 * @author founder
 *
 */
public class QueenApp {
	public static void main(String[] args) {
		Queue  q = new Queue(5);
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		
		q.remove();
		q.remove();
		q.remove();
		
		q.insert(50);
		q.insert(60);
		q.insert(70);
		q.insert(80);
		while(!q.isEmpty()) {
			long n = q.remove();
			System.out.println(n);
			System.out.println(" ");
		}
		System.out.println(" ");
	}
}
class Queue{
	private int maxSize;
	private long[] queArray;
	private int front;//头
	private int rear; //尾
	private int nItems;
	public Queue(int size) {
		maxSize = size;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	public void insert(long j) {
		if(rear == maxSize - 1) {//deal with wraparound
			rear = -1; 
		}
		queArray[++rear] = j;
		nItems++;
	}
	public long remove() {
		long temp = queArray[front++];
		if(front == maxSize) { //deal with wraparound
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public long peekFront() {
		return queArray[front];
	}
	public boolean isEmpty() {
		return nItems == 0;
	}
	public boolean isFull()	{
		return (nItems==maxSize);
	}
	public int size() {
		return nItems;
	}
}