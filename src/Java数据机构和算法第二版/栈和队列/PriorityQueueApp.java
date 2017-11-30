package Java���ݻ������㷨�ڶ���.ջ�Ͷ���;
/**
 * ���ȶ���
 * 	insert()�����ȶ������Ƿ��������
 * 	���û�У��Ͳ����±�Ϊ0�ĵ�Ԫ�
 * 	���򣬴����鶥����ʼ���ƴ��ڵ������
 * 	ֱ���ҵ���������Ӧ�������λ�ã�Ȼ�󣬲��������������nItem+1
 * 
 * ���ȶ��в��������������������ͷ��β�ֶΣ�����ͷ����nItems-1��β����0
 * 
 * Ч�����⣺
 * 	���������ʱ�临�Ӷ�O(N)
 * 	ɾ��������ʱ�临�Ӷ�O(1)
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
