package com.thinkbig.ds.linkedlist;

public class LinkedListImpl {
	public static void main(String args[])
	{
		SingleLinkedList single = new SingleLinkedList();
		single.add(10);
		single.add(3);
		single.add(5);
		single.add(13);
		single.add(15);
		single.add(17);
		single.add(7);
		single.display();
		single.delete(3);
		single.delete(10);
		single.delete(7);
		single.delete(15);
		single.display();
		System.out.println("--- Doubly Linked List ----");
		DoublyLinkedList doubly = new DoublyLinkedList();
		doubly.add(10);
		doubly.add(3);
		doubly.add(5);
		doubly.add(13);
		doubly.add(15);
		doubly.add(17);
		doubly.add(7);
		doubly.display();
		doubly.delete(3);
		doubly.delete(10);
		doubly.delete(7);
		doubly.delete(15);
		doubly.display();
		System.out.println("--- Circular Linked List ----");
		CircularLinkedList circular = new CircularLinkedList();
		circular.add(10);
		circular.add(3);
		circular.add(5);
		circular.add(13);
		circular.add(15);
		circular.add(17);
		circular.add(7);
		circular.display();
		circular.delete(3);
		circular.delete(10);
		circular.delete(7);
		circular.delete(15);
		circular.display();
		System.out.println("--- Circular Linked List ----");
		CircularImpl circularImpl = new CircularImpl();
		circularImpl.add(10);
		circularImpl.add(3);
		circularImpl.add(5);
		circularImpl.add(13);
		circularImpl.add(15);
		circularImpl.add(17);
		circularImpl.add(7);
		circularImpl.display();
		circularImpl.delete(3);
		circularImpl.delete(10);
		circularImpl.delete(7);
		circularImpl.delete(15);
		circularImpl.display();
	}

}
