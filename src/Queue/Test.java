package Queue;

/**
 * 
 * 
 * @author jack
 * 2016年11月19日 上午1:49:29
 */
public class Test {
	public static void main(String[] args) {
		Queue q = new Queue(3);
		
		
		try {
//			for (int i = 0; i < 10; i++) {
//				q.put(i + "");
//			}
//
//			for (int i = 0; i < 10; i++) {
//				System.out.println(q.poll());
//			}
			q.put("1");
			q.put("2");
			System.out.println(q.poll());
			q.put("3");
			System.out.println(q.poll());
			System.out.println(q.poll());
//			System.out.println(q.poll());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
