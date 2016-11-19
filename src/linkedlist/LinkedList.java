package linkedlist;

/**
 *	链表实现
 */
public class LinkedList {

	public Node head = null; // 头节点
	public Node tail = null; // 尾节点

	public int size = 0;

	// 头插入
	public boolean insertHead(Object data) {
		if (size == 0) {
			initial(data);
		} else {
			Node node = new Node(data);
			node.setNext(head);
			head = node;
		}
		size++;
		return true;
	}

	// 尾插入
	public boolean insertTail(Object data) {
		if (size == 0) {
			initial(data);
		} else {
			Node node = new Node(data);
			tail.setNext(node);
			tail = node;
		}
		size++;
		return true;
	}

	// 中间插入,插入到index的后面
	public boolean insertAfter(int index, Object data) throws Exception {
		if (index > size) {
			insertTail(data);
		} else {
			if (index == 0) {
				insertHead(data);
			} else {
				// 获得index对应的node
				Node indexNode = getByIndex(index);
				Node node = new Node(data);
				node.setNext(indexNode.getNext());
				indexNode.setNext(node);
				size++;
			}
		}
		return true;
	}

	// 头删除
	public boolean removeHead() throws Exception {
		if (size == 0) {
			throw new Exception("likedlist is empty , can not remove head node");
		}
		head = head.getNext();
		size--;
		return true;
	}

	// 尾删除
	public boolean removeTail() throws Exception {
		if (size == 0) {
			throw new Exception("likedlist is empty , can not remove tail node");
		}
		size--;
		tail = getByIndex(size);
		tail.setNext(null);
		return true;
	}

	// 中间删除
	public boolean removeIndex(int index) throws Exception {
		if (size == 0) {
			throw new Exception("likedlist is empty , can not remove any node");
		}
		Node indexNode = getByIndex(index);
		indexNode = indexNode.getNext();
		size--;
		return true;
	}

	// 查找
	public Node getByIndex(int index) throws Exception {
		if (index > size) {
			throw new Exception("list is out by index " + index);
		}
		Node result = head;
		for (int i = 2; i <= index; i++) {
			result = result.getNext();
		}
		return result;
	}

	// 初始化第一个元素
	public void initial(Object data) {
		Node n = new Node(data);
		head = n;
		tail = n;
	}

	public void traverse() {
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.getData());
			tmp = tmp.getNext();
		}
	}
}

// 节点
class Node {

	private Object data;
	private Node next;

	public Node() {
	}

	public Node(Object data) {
		super();
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}