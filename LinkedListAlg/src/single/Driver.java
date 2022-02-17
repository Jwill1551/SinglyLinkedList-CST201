package single;

import org.w3c.dom.Node;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create the Singly LinkedList 
		SinglyLinkedList list = new SinglyLinkedList();
		SinglyLinkedList list2 = new SinglyLinkedList();
		
		list2.insert(10);
		list2.insert(23);
		list2.insert(14);
		list2.insert(5);
		list2.insert(48);
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(9);
		
		list.printList();
		System.out.println(" ");
		
		list.front();
		list.back();
		list.pop_front();
		list.pop_back();
		list.size();
		
		list.printList();
		
		System.out.println(" ");
		list.reverse();
		
		list.printList();
		System.out.println(" ");
		
		list.merge(list2);
		
		list.printList();
		System.out.println(" ");
		
		SinglyLinkedList copyList = new SinglyLinkedList(list2);
		copyList.printList();
		
	}
}
