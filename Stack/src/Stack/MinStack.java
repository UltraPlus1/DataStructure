package Stack;

import java.util.Stack;

//java 实现最小栈的类
class MinStack {
	Stack<Integer> s1;
	private Stack<Integer> s2 = new Stack<>();

	/** initialize your data structure here. */
	public MinStack() {
		this.s1 = new Stack<>();
	}

	public void push(int x) {
		this.s1.push(x);
		if(s2.isEmpty() || s2.peek()>= x) s2.push(x);
	}

	public void pop() {

		int x=this.s1.pop();
		if(x == s2.peek())s2.pop();

	}

	public int top() {
		return this.s1.peek();
	}

	public int getMin() {
		return s2.peek();
	}

}


