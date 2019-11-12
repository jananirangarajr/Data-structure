#ifndef BINARYHEAP_H
#define BINARYHEAP_H

class BinaryHeap
{
public:
    int *heapArray;
    int deleteCount = 0;
	int length;
public :
    BinaryHeap(int size)
	{
		heapArray = new int[size];
		length = size;
	}
public :
    void createMinHeap()
	{
		if(length == 0)
			return;
		else
			minHeap(1,length);
	}
private :
    void minHeap(int index,int size)
	{
		if(index > size || index <= 0 || size == 1)
		{
			return;
		}
		else
		{
			if(index == 1)
			{
				if(heapArray[index] < heapArray[index-1]) {
					swap(index,index-1);
				}
				minHeap(index+1,size);
			}
			else if(index != size)
			{
				int parentIndex = (index-1)/2;
				if(heapArray[parentIndex] > heapArray[index])
				{
					swap(index,parentIndex);
					minHeap(parentIndex,size);
				}
				minHeap(index+1,size);
			}
		}
	}
public:
    void createMaxHeap()
	{
		if(length == 0)
			return;
		else
			maxHeap(1,length);
	}
private :
    void maxHeap(int index, int size)
	{
		if(index > size || index <= 0 )
		{
			return;
		}
		else
		{
			if(index == 1)
			{
				if(heapArray[index] > heapArray[index-1]) {
					swap(index,index-1);
				}
				maxHeap(index+1,size);
			}
			else if(index != size)
			{
				int parentIndex = (index-1)/2;
				if(heapArray[parentIndex] < heapArray[index])
				{
					swap(index,parentIndex);
					maxHeap(parentIndex,size);
				}
				maxHeap(index+1,size);
			}
		}
	}
private:
    void swap(int i, int j)
	{
		int temp = heapArray[i];
		heapArray[i] = heapArray[j];
		heapArray[j] = temp;
	}
public:
    void deleteHeap()
	{
		if(length <= 1)
			heapArray = nullptr;
		else {
			deleteCount++;
			int temp = heapArray[0];
			heapArray[0] = heapArray[length-deleteCount];
			heapArray[length-deleteCount] = temp;
			maxHeap(1,length-deleteCount);
		}
	}
};

#endif // BINARYHEAPIMPL_H
