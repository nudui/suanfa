package queue2stack;

import queue2stack.Stack;

/**
 * 
 * 
 * @author jack
 * 2016年11月19日 上午3:03:57
 */
public class Test {

	public static void main(String[] args) {
		Stack stack = new Stack(5);

		for (int i = 0; i < 15; i++) {
			try {
				stack.push(i + "");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
		// System.out.println(stack.s);
	}

}
