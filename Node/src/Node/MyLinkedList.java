package Node;
public class MyLinkedList {
	private  class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
			this.next = null;
		}
	}
	private Node head,tail;
	private int size;

	/**
	 * 链表构造函数
	 */
	public MyLinkedList() {
		Node p= new Node(0);
		this.head = p;
		this.tail = p;
		this.size = 0;
	}

	/**
	 *获取链表中第 index 个节点的值。
	 * @param index 索引
	 * @return 索引为index 对应的值 无效返回-1
	 */
	public int get(int index) {
		//如果超出范围直接返回-1
		if(index<0||index>=this.size) return -1;
		else{
			Node cur = this.head;
			for(int i =0 ;i<index;i++){
				cur= cur.next;
			}
			return cur.val;
		}
	}

	/**
	 * 在链表的第一个元素之前添加一个值为 val 的节点。
	 * @param val
	 */
	public void addAtHead(int val) {
		if(this.size==0){
			this.head.val = val;
		}else{
			Node tmp = new Node(val);
			tmp.next = this.head;
			this.head = tmp;//加了之后要更新head 的值
		}
		this.size ++;
	}

	/**
	 * 将值为 val 的节点追加到链表的最后一个元素。
	 * @param val
	 */
	public void addAtTail(int val) {
		if(this.size==0){
			this.tail.val = val;
		}else {
			Node tmp = new Node(val);
			this.tail.next = tmp;
			this.tail = tmp;//加了之后要更新tail的值
		}
		this.size++;
	}

	/**
	 * 在链表中的第 index 个节点之前添加值为 val  的节点。
	 * 如果 index 等于链表的长度，则该节点将附加到链表的末尾。
	 * 如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
	 * @param index
	 * @param val
	 */
	public void addAtIndex(int index, int val) {
		if(index>this.size){//超出范围结束
			return;
		}else if(index<=0){//比零小，加在head
			addAtHead(val);
		}else if(index==this.size){//index为size说明实在tail之后加
			addAtTail(val);
		}else {
			Node tmp = new Node(val);
			Node cur = this.head;
			for(int i=0;i<index-1;i++){
				cur = cur.next;
			}//加的位置是cur的下一个
			tmp.next = cur.next;
			cur.next = tmp;
			this.size ++;//别忘记加size
		}
	}

	/**
	 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
	 * @param index
	 */
	public void deleteAtIndex(int index) {
		if(index>=0&&index<this.size)//索引有效才能删
		{
			if(index==0)//删head
			{
				this.head = this.head.next;
			}else
			{
				Node cur = this.head;
				for(int i=0;i<index-1;i++)
				{
					cur = cur.next;
				}
				cur.next = cur.next.next;
				if(index==this.size-1){
					tail=cur;
				}//删tail 要更新tail
			}
			this.size--;//别忘记了减size
		}
	}
}
