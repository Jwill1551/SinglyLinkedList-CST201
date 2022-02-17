package single;

import java.io.*;

public class SinglyLinkedList {

	Node head; // head of list
	int size = 0; // size of list
	
	public SinglyLinkedList(){
		
	}
	
	// Copy Constructor
	public SinglyLinkedList(SinglyLinkedList copyList) {
		Node oldNode = copyList.head;
		
		this.head = oldNode;
	}

	static class Node { // static so it can be used in the main

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	// Access the first element in the LinkedList
	public void front() {
		System.out.println(this.head.data + " is the front element of a LinkedList");
	}
	
	// Access the back element in the LinkedList
	public void back() {
		Node currNode = this.head;

		// Traverse through the LinkedList
		while (currNode != null) {
			if(currNode.next == null) {
				System.out.println(currNode.data + " is the last element of a LinkedList");
			}
			currNode = currNode.next;
		}
	}
	
	// Removes the front element in the LinkedList
	public void pop_front() {
		Node currNode = this.head;
		int counter = 0;
		
		while(currNode != null) {
			currNode = currNode.next;
			counter++;
			
			// If the first element is found than it will be removed and head will reference the next node after it.
			if(counter == 1) {
				this.head = currNode;
				System.out.println("The new front element is " + currNode.data);
			};
		}
	}
	
	// Removes the back element in the LinkedList 
	public void pop_back() {
		Node currNode = this.head;
		Node prev_Node = null;

		// Traverse through the LinkedList
		while (currNode != null) {
			// Remove the old back element and make the previous node the new back element
			if(currNode.next == null) {
				prev_Node.next = null;
				System.out.println("The new back element is " + prev_Node.data);
			}
			
			// Store previous node
			prev_Node = currNode;
			currNode = currNode.next;
		}
	}
	
	// Determines if the list is empty
	public void empty() {
		Node currNode = this.head;
		
		if(currNode == null || currNode.next == null) {
			System.out.println("This list is empty");
		} else {
			System.out.println("This list is not empty");
		}
	}
	
	// Return # of elements
	public int size() {
		Node currNode = this.head;
		
		while (currNode != null) {
			currNode = currNode.next;
			size++;
		}
		
		System.out.println(size);
		
		return size;
	}
	
	// Reverse elements in a LinkedList
	public void reverse() {
		Node prev_Node = null;
		Node curr_Node = this.head;
		Node next_Node = null;
		
		while(curr_Node != null) {
			next_Node = curr_Node.next;
			curr_Node.next = prev_Node;
			prev_Node = curr_Node;
			curr_Node = next_Node;
		}
		
		this.head = prev_Node;
	}
	
	// Will merge a LinkedList with another
	public void merge(SinglyLinkedList list) {
		Node currNode = this.head;
		Node newNode = list.head;
		int cnt = 0;
		
		// Add the elements in the list with the new list
		while(currNode != null) {
			if(currNode.next == null && cnt != 1) {
				currNode.next = newNode;
				cnt++;
			}

			currNode = currNode.next;
		}
	}
	
	// Inserts values into a LinkedList
	@SuppressWarnings("unchecked")
	public SinglyLinkedList insert(int data) {
		// Create a new node with given data
		Node new_node = new Node(data);
		new_node.next = null;

		// If the Linked List is empty, make this head

		if (this.head == null) {
			this.head = new_node;
		} else {
			Node last = this.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		
		return (SinglyLinkedList) this;
	}

	// Method to print the LinkedList.
	public void printList() {
		Node currNode = this.head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");
			// Go to next node
			currNode = currNode.next;
		}
	}
}