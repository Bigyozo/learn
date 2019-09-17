package dataStructure;

/**
 * @author zhangfanglong
 * @param <AnyType>
 * 包含泛型的大顶堆
 */
public class Heap<AnyType extends Comparable<? super AnyType>> {
	private Node<AnyType>[] heapArray;
	private int maxSize;
	private int currentSize;

	public Heap(int maxsize) {
		maxSize = maxsize;
		currentSize = 0;
		heapArray = new Node[maxSize];
	}

	public boolean isEmpty() {
		return currentSize == 0;
	}

	public boolean isFull() {
		return currentSize == maxSize;
	}

	public boolean insert(AnyType value) {
		if (isFull())
			return false;
		heapArray[currentSize] = new Node<AnyType>(value);
		percolateUp(currentSize++);
		return true;
	}

	// 上滤
	private void percolateUp(int index) {
		int parent = (index - 1) >> 1;
		Node<AnyType> tmp = heapArray[index];
		while (index > 0 && tmp.nData.compareTo(heapArray[parent].nData) > 0) {
			heapArray[index] = heapArray[parent];
			index = parent;
			parent = (index - 1) >> 1;
		}
		heapArray[index] = tmp;
	}

	public AnyType remove() {
		Node<AnyType> root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		percolateDown(0);
		return root.getnData();
	}

	// 下滤
	private void percolateDown(int index) {
		Node<AnyType> tmp = heapArray[index];
		int child, lchild, rchild;
		while (index < currentSize / 2) {
			lchild = 2 * index + 1;
			rchild = lchild + 1;
			if (rchild < currentSize && heapArray[lchild].nData.compareTo(heapArray[rchild].nData) < 0) {
				child = rchild;
			} else
				child = lchild;
			heapArray[index] = heapArray[child];
			index = child;
		}
		heapArray[index] = tmp;
	}

	// 堆元素修改
	public boolean change(int index, AnyType newValue) {
		if (index < 0 || index >= currentSize) {
			return false;
		}
		AnyType oldValue = heapArray[index].nData;
		heapArray[index].setnData(newValue);
		if (newValue.compareTo(oldValue) > 0)
			percolateUp(index);
		else
			percolateDown(index);
		return true;
	}

	// 打印堆元素
	public void displayHeap() {
		System.out.println("heapArray:");
		int maxline = (int) (Math.log(currentSize) / Math.log(2));
		for (int i = 0, n = 1; i < currentSize; i++) {
			if (i == Math.pow(2, n - 1) - 1) {
				for (int t = 0; t <= maxline - n; t++)
					System.out.print("\t");
			}
			if (i == Math.pow(2, n) - 2) {
				System.out.println(heapArray[i].nData);
				n++;
			} else
				System.out.print(heapArray[i].nData + "\t  ");
		}

	}

	static class Node<AnyType extends Comparable<? super AnyType>> {
		private AnyType nData;

		public Node(AnyType nData) {
			super();
			this.nData = nData;
		}

		public AnyType getnData() {
			return nData;
		}

		public void setnData(AnyType nData) {
			this.nData = nData;
		}
	}
	
	public void heapSort() {
		int tempSize=currentSize;
		while(currentSize>1) {
		Node<AnyType> root = heapArray[0];
		heapArray[0] = heapArray[currentSize-1];
		heapArray[currentSize-1] = root;
		currentSize--;		
		percolateDown(0);	
		}
		this.currentSize=tempSize;	
	}

	// 测试
	public static void main(String args[]) {
		Heap<Integer> h = new Heap<Integer>(20);
		h.insert(15);
		h.insert(9);
		h.insert(7);
		h.insert(8);
		h.insert(20);
		h.insert(-1);
		h.insert(7);
		h.insert(4);
		h.insert(2);
		h.heapSort();
		h.displayHeap();
	}
}
