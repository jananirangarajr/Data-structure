package com.thinkbig.ds.queue;

class Queue{
	int element;
	Queue front = null;;
	Queue rear = null;
	Queue next;
	Queue(int element)
	{
		this.element = element;
		this.next = null;
	}
	Queue() {
		// TODO Auto-generated constructor stub
	}
	void enque(int number)
	{
		Queue node = new Queue(number);
		if(this.front == null & this.rear == null)
		{
			this.front = this.rear = node;
		}
		else
		{
			this.rear.next = node;
			this.rear = node;
		}
		
	}
	void deque()
	{
		Queue node = this.front;
		if(this.front == null && this.rear == null)
		{
			System.out.println("No elements to deque");
		}
		else if(this.front != null && this.rear != null &&(this.front == this.rear) )
		{
			this.front = this.rear = null;
		}
		else {
			while(node.next != this.rear)
			{
				node = node.next;
			}
			node.next = null;
			this.rear = node;
		}
	}
	void display()
	{
		Queue node = this.front;
		while(node != null)
		{
			System.out.println(" "+node.element);
			node = node.next;
		}
	}
}

public class QueueImpl {
	public static void main(String args[])
	{
		Queue queue = new Queue();
		queue.enque(1);
		queue.enque(2);
		queue.enque(3);
		System.out.println("Enque");
		queue.display();
		queue.deque();
		System.out.println("Deque");
		queue.display();
		queue.deque();
		System.out.println("Deque");
		queue.display();
		queue.deque();
		System.out.println("Deque");
		queue.display();
		queue.deque();
		System.out.println("Deque");
		queue.display();
		
	}
	
}
