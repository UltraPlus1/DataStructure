//最大栈链表实现
public class MaxStack {
	//定义双向链表
	class Node{
		int val;
		Node next;
		Node pre;
		//当前节点前(包括当前节点)的最大值
		int curMax ;
		Node(int val){
			this.val = val;
		}
	}

	Node head ;
	private Node cur;

	public MaxStack(){
		this.head = new Node(0);
	}

	public void push(int x){
		if(cur == null){
			cur = new Node(x);
			head.next = cur;
			cur.pre = head;
			cur.curMax = x;
		}else{
			cur.next = new Node(x);
			cur.next.pre = cur;
			cur.curMax = Math.max(cur.pre.curMax,x);
		}
	}

	public  void pop(){
		cur.pre.next = null;
		cur = cur.pre;
		if(cur == head)
			cur = null;
	}

	public int top(){
		return cur.val;
	}
	public int getMax(){
		return cur.curMax;
	}
}
