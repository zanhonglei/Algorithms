package Java���ݻ������㷨�ڶ���.ջ�Ͷ���;
/**
 * ѭ�����У�˫�˶���)
 * ��ջһ���������в�����������Ƴ��������ʱ�临�ӶȾ�ΪO(1)
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
	private int front;//ͷ
	private int rear; //β
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