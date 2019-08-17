import Node.MyLinkedList;
public class Main {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addAtHead(1);
		list.addAtTail(3);
		list.addAtIndex(1,2);
		list.get(1);
		list.deleteAtIndex(1);
	}
}
