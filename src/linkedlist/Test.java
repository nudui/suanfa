package linkedlist;

/**
 * 
 * 
 * @author jack
 * 2016年11月19日 下午12:40:27
 */
public class Test {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertTail("t1");
		list.insertTail("t2");
		list.insertTail("t3");
		list.insertTail("t4");
		
		try {
			list.insertAfter(9, "t5");
			
			list.removeHead();
			list.removeTail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		list.traverse();
	}
}
