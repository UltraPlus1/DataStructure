public class MyLinkedList {
	private  class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
		}
	}
	private Node head;
	private int size;
	/** Initialize your data structure here. */
	public MyLinkedList() {
		this.head = new Node(0);
		this.size = 0;
	}

	/** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	public int get(int index) {

	}

	/** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	public void addAtHead(int val) {
		Node tmp = head.next;
		head.next=new Node(val);
		head.next.next = tmp;
		this.size +=1;
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		Node cur = this.head;
		while (cur.next!=null){
			cur = cur.next;
		}
			cur.next = new Node(val);
			cur.next.next = null;
	}

	/** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
	public void addAtIndex(int index, int val) {
		Node cur = this.head.next;
		int i;
		if(index<=0){
			addAtHead(val);
		}else if(index>0&&index<size){
			for(i=0;i<index;i++){
				cur = cur.next;
			}
			Node tmp = cur.next;
			cur.next= new Node(val);
			cur.next.next = tmp;
			this.size +=1;
		}else if(index==size){
			addAtTail(val);
		}
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		Node cur = this.head.next;
		for(int i =0 ;i<index;i++){

		}
	}
}
