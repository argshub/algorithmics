package DataStructures.Heaps;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.HeapIsEmpty;
import DataStructures.Exceptions.HeapIsFull;
import DataStructures.Exceptions.HeapValueIncreasingError;

/**
 * Created by xenonus on 7/31/2010.
 */
public class HeapForMinQuery {
    private int counter;
    private int capacity;
    private int arrayData[];


    public HeapForMinQuery(int capacity) {
        this.capacity = capacity;
        this.arrayData = new int[this.capacity+1];
        this.counter = 1;
    }

    public void insert(int element) throws HeapIsFull {
        if(this.counter > this.capacity) throw new HeapIsFull("Heap Is Full", this.capacity);
        this.arrayData[this.counter] = element;
        int i = this.counter;
        while (i > 1 && this.arrayData[i] < this.arrayData[parent(i)]) {
            this.swap(i, parent(i));
            i =  parent(i);
        }
        this.counter++;
    }

    private void minHeapify(int parent) {
        int left = parent * 2;
        int right = parent * 2 + 1;
        int minimum = parent;
        if(left < this.counter && this.arrayData[left] < this.arrayData[minimum]) minimum = left;
        if(right < this.counter && this.arrayData[right] < this.arrayData[minimum]) minimum  = right;
        if(minimum != parent) {
            swap(parent, minimum);
            minHeapify(minimum);
        }
    }

    public void extractMinimum() throws HeapIsEmpty {
        if(this.counter <= 1) throw new HeapIsEmpty("Heap is Empty");
        swap(1, --this.counter);
        this.minHeapify(1);
    }

    public void decreaseValue(int index, int value) throws HeapIsEmpty, HeapValueIncreasingError {
        if(this.counter <= 1) throw new HeapIsEmpty("Heap is Empty");
        if(this.arrayData[index] < value) throw new HeapValueIncreasingError("Current Value is Smaller than new Value");
        this.arrayData[index] = value;
        while(index > 1 && this.arrayData[index] < this.arrayData[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    public int minimum() throws HeapIsEmpty {
        if(this.counter == 0) throw new HeapIsEmpty("Heap is Empty");
        return this.arrayData[1];
    }

    private int parent(int n) {
        return n / 2;
    }

    private void swap(int x, int y) {
        int temp = this.arrayData[x];
        this.arrayData[x] = this.arrayData[y];
        this.arrayData[y] = temp;
    }

    public static void main(String arg[]) {
        try {

            HeapForMinQuery heapForMinQuery = new HeapForMinQuery(20);
            heapForMinQuery.insert(10);
            heapForMinQuery.insert(9);
            heapForMinQuery.insert(8);
            heapForMinQuery.insert(7);
            heapForMinQuery.insert(6);
            heapForMinQuery.insert(5);
            heapForMinQuery.insert(4);
            heapForMinQuery.insert(3);
            heapForMinQuery.insert(2);
            heapForMinQuery.insert(1);

            System.out.printf("%d\n", heapForMinQuery.minimum());
            heapForMinQuery.extractMinimum();
            System.out.printf("%d\n", heapForMinQuery.minimum());
            heapForMinQuery.decreaseValue(7, 0);
            System.out.printf("%d\n", heapForMinQuery.minimum());
            heapForMinQuery.extractMinimum();
            System.out.printf("%d\n", heapForMinQuery.minimum());

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.printf("%s", dataStructuresExceptions.getMessage());
        }
    }
}
