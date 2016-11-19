package stack;

/**
 * 
 * 
 * @author jack
 * 2016年11月19日 上午1:08:53
 */
public class Test {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		
		for (int i = 0; i < 15; i++) {
			stack.push(i + "");
		}

		for (int i = 0; i < 15; i++) {
			try {
				System.out.println(stack.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			System.out.println(stack.pop());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
