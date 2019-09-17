package dataStructure;
/**
 * 
 * @author zhangfanglong
 * @param <E>
 * 包含泛型的可扩容循环队列的数组实现
 *
 */
public class PriorityQueue<E extends Comparable<? super E>> {
	private int size;
	private E[] queArray;
	private int nItems;
	private int front;
	private int rear;

	public PriorityQueue(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new IllegalArgumentException("队列初始容量不能小于0: " + initialCapacity);
		}
		queArray = (E[]) new Comparable[initialCapacity];
		size = initialCapacity;
		front = 0;
		rear = 0;
		nItems = 0;
	}

	public void insert(E obj) {
		if (isEmpty()) {
			queArray[rear] = obj;
		} else {
			if (nItems == size - 1)
				expand();
			int j = rear;
			while (j > front && obj.compareTo(queArray[(size + j - 1) % size]) < 0) {
				queArray[j] = queArray[(size + j - 1) % size];
				j = (size + j - 1) % size;
			}
			queArray[j] = obj;
		}
		rear = (rear + 1) % size;
		nItems++;
	}

	public E remove() {
		if (isEmpty())
			return null;
		else {
			E obj = queArray[front];
			queArray[front] = null;
			front = (front + 1) % size;
			nItems--;
			return obj;
		}
	}

	private boolean isEmpty() {
		return nItems == 0;
	}

	// 数组扩容
	private void expand() {
		int newSize = size * 2 + 1;
		E[] newArray = (E[]) new Comparable[newSize];
		for (int i = 0; i < size; i++) {
			newArray[i] = queArray[front];
			front = (front + 1) % size;
		}
		queArray = newArray;
		front = 0;
		rear = nItems;
		size = newSize;
	}

}
