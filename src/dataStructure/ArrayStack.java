package dataStructure;

import java.util.EmptyStackException;

/**
 * @author zhangfanglong 
 * 栈的数组实现
 */
public class ArrayStack {
	private Object[] array;
	private int size;
	private int top;

	public ArrayStack() {
		this.array = new Object[10];
		this.top = -1;
		this.size = 10;
	}

	public ArrayStack(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new IllegalArgumentException("栈初始容量不能小于0: " + initialCapacity);
		}
		this.array = new Object[initialCapacity];
		this.size = initialCapacity;
		this.top = -1;
	}

	public void push(Object item) {
		expand();
		array[++top] = item;
	}

	public Object pop() {
		Object obj = peek();
		remove();
		return obj;
	}

	public Object peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return array[top];
	}

	public void remove() {
		if (isEmpty())
			return;
		array[top--] = null;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	// 数组扩容
	private void expand() {
		if (top < size - 1)
			return;
		Object[] newArray = new Object[size * 2 + 1];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
		size = size * 2 + 1;
	}

}
