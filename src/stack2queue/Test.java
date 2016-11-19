package stack2queue;

/**
 * 
 * 
 * @author jack
 * 2016年11月19日 上午2:27:32
 */
public class Test {
	public static void main(String[] args) {
		Queue q = new Queue(5);
//		for(int i = 0 ; i < 5 ; i ++){
//			q.put(i + "");
//		}
//		
//		for(int i = 0 ; i < 5 ; i ++){
//			try {
//				System.out.println(q.poll());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		q.put("0");
		q.put("1");
		q.put("2");
		q.put("3");
		q.put("4");
		q.put("5");
		try {
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(q.poll());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
