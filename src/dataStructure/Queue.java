package dataStructure;

/**
 * @author zhangfanglong 
 * 数组实现可扩容循环队列
 */
public class Queue {
	private Object[] queArray;
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new IllegalArgumentException("队列初始容量不能小于0: " + initialCapacity);
		}
		queArray = new Object[initialCapacity];
		this.maxSize = initialCapacity;
		front = 0;
		rear = 0;
		nItems = 0;
	}

	public void insert(Object element) {
		if (nItems == maxSize - 1)
			expand();
		queArray[rear] = element;
		rear = (rear + 1) % maxSize;
		nItems++;
	}

	public Object remove() {
		if (isEmpty())
			return null;
		else {
			Object element = queArray[front];
			queArray[front] = null;
			front = (front + 1) % maxSize;
			nItems--;
			return element;
		}
	}

	public boolean isEmpty() {
		return nItems == 0;
	}

	// 数组扩容
	private void expand() {
		int newSize = maxSize * 2 + 1;
		Object[] newArray = new Object[newSize];
		for (int i = 0; i < maxSize; i++) {
			newArray[i] = queArray[front];
			front = (front + 1) % maxSize;
		}
		queArray = newArray;
		front = 0;
		rear = nItems;
		maxSize = newSize;
	}

	public int getSize() {
		return nItems;
	}

}
