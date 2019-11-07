#include<iostream>
using namespace std;

class Queue{
	int element;
	Queue *front = nullptr;
	Queue *rear = nullptr;
	Queue *next;
public:
	Queue(int element)
	{
		this->element = element;
		this->next = nullptr;
	};
public:
	Queue() {
	};
public:
	void enqueue(int number)
	{
		Queue *node ;
		node = new Queue(number);
		if(this->front == nullptr && this->rear == nullptr)
		{
			this->front = this->rear = node;
		}
		else
		{
			this->rear->next = node;
			this->rear = node;
		}

	}
	void dequeue()
	{
		Queue *node = this->front;
		if(this->front == nullptr && this->rear == nullptr)
		{
			cout<<"\n No elements to dequeue";
		}
		else if(this->front != nullptr && this->rear != nullptr &&(this->front == this->rear) )
		{
			this->front = this->rear = nullptr;
		}
		else {
			while(node->next != this->rear)
			{
				node = node->next;
			}
			node->next = nullptr;
			this->rear = node;
		}
	}
	void display()
	{
		Queue *node ;
		node = this->front;
		while(node != nullptr)
		{
		    cout<<"\n";
			cout<<node->element;
			node = node->next;
		}
	}
};
int main()
{
        Queue queue;
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		cout<<"Enqueue\n";
		queue.display();
		queue.dequeue();
		cout<<"Dequeue\n";
		queue.display();
		queue.dequeue();
		cout<<"Dequeue\n";
		queue.display();
		queue.dequeue();
		cout<<"Dequeue\n";
		queue.display();
		queue.dequeue();
		cout<<"Dequeue\n";
		queue.display();
}
