#include "binaryheapimpl.h"
#include <iostream>
using namespace std;
void display(BinaryHeap heap,int length)
{
    cout<<"\n Display Array Values " << endl;
    for(int i = 0 ; i < length ; i++)
     {
         cout<<"\n"<<endl;
         cout<<heap.heapArray[i];
     }
}
int main()
{
     cout<<"\n Enter the size of the array"<<endl;
     int length;
     cin>>length;
     BinaryHeap heap(length);
     cout<<"\n Enter the elements"<<endl;
     for(int i = 0 ; i < length ; i++)
     {
            cin>>heap.heapArray[i];
     }
     heap.createMaxHeap();
     display(heap,length);
     for(int i = 0 ; i < length ; i++)
        heap.deleteHeap();
    display(heap,length);
}
