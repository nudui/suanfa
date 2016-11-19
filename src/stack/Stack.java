package stack;

import java.util.Arrays;

/**
 * 栈的定义
 * 
 * @author jack
 * 2016年11月19日 上午12:56:22
 */
public class Stack {
	
	// 数组长度
	private int cap = 10;
	
	// 已经使用长度
	private int size = 0;
	
	// 存储
	private Object[] arr;

	// 构造器
	public Stack(int cap) {
		super();
		this.cap = cap;
		arr = new Object[cap];
	}

	// 入栈，考虑扩容
	public boolean push(Object object) {
		// 扩容
		if (isFull()) {
			expand();
		}
		//添加元素
		arr[size ++] = object;
		return true;
	}
	
	// 出栈
	public Object pop() throws Exception{
		if(isEmpty()){
			throw new Exception("No ele in this stack");
		}
		Object result = getTop();
		size-- ;
		return result;
	}
	
	// 栈顶元素
	public Object getTop(){
		return arr[size - 1];
	}
	
	
	// 判断是否满
	public boolean isFull() {
		return size == cap;
	}

	// 判断是否空
	public boolean isEmpty() {
		return size == 0;
	}

	private void expand() {
		cap = cap * 2;
		arr = Arrays.copyOf(arr, cap);
	}
}
