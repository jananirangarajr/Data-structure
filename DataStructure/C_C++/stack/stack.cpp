#include<iostream>
#include<cstring>
using namespace std;

static int count=0;
class Stack
{
    int *stackArray;
    int size;
public :
    void createStack(int size)
    {
        stackArray = new int[size];
        this->size = size;
        cout<<"Array Created for specified Size"<<endl;
    }
    void push()
    {
        if(size > count){
            int number;
            cout<<"\n Enter a Number to push"<<endl;
            cin>>number;
            stackArray[count] = number;
            count++;
        }
        else
        {
            cout<<"Stack Overflow"<<endl;
        }
    }
    void pop()
    {
        if(count <= 0)
        {
            cout<<"Stack Underflow"<<endl;
        }
        else
        {
            stackArray[count-1] = NULL;
            count--;
        }
    }
    void display(int size)
    {
        cout<<size;
        for(int i = 0 ; i<size;i++)
            cout<<stackArray[i];
    }
};

int main()
{
    Stack stack;
    cout<<"Enter the size of the stack : "<<endl;
    int size;
    cin>>size;
    stack.createStack(size);
    string operation;
    do{
        cout<<"push or pop"<<endl;
        cin>>operation;
        string push = "push";
        string pop = "pop";
        if(operation.compare(push)==0){
            stack.push();
        }
        else if(operation.compare(pop)==0)
        {
            stack.pop();
        }
        else
            break;
    }while(true);
    stack.display(size);
}
