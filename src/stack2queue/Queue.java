package stack2queue;

import stack.Stack;

/**
 * 
 * 
 * @author jack
 * 2016年11月19日 上午2:20:25
 */
public class Queue {

	private Stack s1; // 专门入栈
	private Stack s2; // 专门出栈

	public Queue(int cap) {
		super();
		this.s1 = new Stack(cap);
		this.s2 = new Stack(cap);
	}

	// 入队
	public boolean put(Object o) {
		return s1.push(o);
	}

	// 出队
	public Object poll() throws Exception {
		if (s2.isEmpty()) {
			stackTrans(s1, s2);
		}
		return s2.pop();
	}

	// 栈之间全拷贝
	private void stackTrans(Stack stack1, Stack stack2) throws Exception {
		while (!stack1.isEmpty()) {
			Object o = stack1.pop();
			stack2.push(o);
		}
	}
}
