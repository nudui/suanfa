package queue2stack;

import Queue.Queue;

/**
 * 
 * 
 * @author jack
 * 2016年11月19日 上午2:52:04
 */
public class Stack {

	private Queue q1;
	private Queue q2;

	private int cap = 10;

	public Stack(int cap) {
		super();
		this.cap = cap;
		this.q1 = new Queue(cap + 1);
		this.q2 = new Queue(cap + 1);
	}

	// 入栈
	public boolean push(Object o) throws Exception {
		Queue q;
		if (q1.isEmpty()) {
			q = q1;
		}
		q = q2;
		if (q.isFull()) {
			expand();
		}
		q = q2;
		return q.put(o);
	}

	// 出栈
	public Object pop() throws Exception {
		Queue from;
		Queue to;
		if (!q1.isEmpty()) {
			from = q1;
			to = q2;
		} else {
			from = q2;
			to = q1;
		}
		queueTransExceptOne(from, to);
		return from.poll();
	}

	// 扩容
	private void expand() throws Exception {
		this.cap = this.cap * 2 + 1;
		Queue q3 = new Queue(this.cap);
		Queue q4 = new Queue(this.cap);
		queueTrans(q1, q3);
		queueTrans(q2, q4);
		q1 = q3;
		q2 = q4;
	}

	private void queueTransExceptOne(Queue queue1, Queue queue2) throws Exception {
		while (queue1.getSize() > 1) {
			queue2.put(queue1.poll());
		}
	}

	private void queueTrans(Queue queue1, Queue queue2) throws Exception {
		while (!queue1.isEmpty()) {
			queue2.put(queue1.poll());
		}
	}
}
