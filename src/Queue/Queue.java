package Queue;

/**
 * 
 * 
 * @author jack
 * 2016年11月19日 上午1:37:17
 */
public class Queue {
	//    t	h       
	// [0,1,2,3,4]
	private Object[] arr;
	int head = 0;
	int tail = 0; // tail处不存储元素

	public Queue(int cap) {
		arr = new Object[cap];
	}

	// 入队
	public boolean put(Object object) throws Exception {
		if (isFull()) {
			throw new Exception("The queue is full now");
		}
		arr[tail] = object;
		tail = (tail + 1) % arr.length;
		return true;
	}

	// 出队
	public Object poll() throws Exception {
		if (isEmpty()) {
			throw new Exception("The queue is empty now");
		}
		Object result = arr[head];
		head = (head + 1) % arr.length;
		return result;
	}

	// 判断是否满
	public boolean isFull() {
		return head == (tail + 1) % arr.length;
	}

	// 判断是否空
	public boolean isEmpty() {
		return head == tail;
	}

	// 队列size
	public int getSize(){
		if(tail > head){
			return tail - head;
		} else{
			return arr.length - head + tail;
		}
	}
}
