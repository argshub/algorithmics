package DataStructures.Heaps;

import DataStructures.Exceptions.HeapIsEmpty;
import DataStructures.Exceptions.HeapIsFull;
import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.HeapValueIncreasingError;

/**
 * Created by xenonus on 7/30/2010.
 */

public class HeapForMaxQuery {
    private int counter;
    private int capacity;
    private int arrayData[];


    public HeapForMaxQuery(int capacity) {
        this.capacity = capacity;
        this.arrayData = new int[this.capacity+1];
        this.arrayData[0] = Integer.MIN_VALUE;
        this.counter = 1;
    }


    public void insert(int element) throws HeapIsFull {
        if(this.counter > this.capacity) throw new HeapIsFull("Heap Is Full", this.capacity);
        this.arrayData[this.counter] = element;
        int i = this.counter;
        while (i > 1 && this.arrayData[i] > this.arrayData[parent(i)]) {
            this.swap(i, parent(i));
            i =  parent(i);
        }
        this.counter++;
    }

    private void maxHeapify(int parent) {
        int left = parent * 2;
        int right = parent * 2 + 1;
        int maximum = parent;
        if(left < this.counter && this.arrayData[left] > this.arrayData[maximum]) maximum = left;
        if(right < this.counter && this.arrayData[right] > this.arrayData[maximum]) maximum  = right;
        if(maximum != parent) {
            swap(parent, maximum);
            maxHeapify(maximum);
        }
    }

    public void extractMaximum() throws HeapIsEmpty {
        if(this.counter <= 1) throw new HeapIsEmpty("Heap is Empty");
        swap(1, --this.counter);
        this.maxHeapify(1);
    }

    public void increaseValue(int index, int value) throws HeapIsEmpty, HeapValueIncreasingError {
        if(this.counter <= 1) throw new HeapIsEmpty("Heap is Empty");
        if(this.arrayData[index] > value) throw new HeapValueIncreasingError("Current Value is Bigger than new Value");
        this.arrayData[index] = value;
        while(index > 1 && this.arrayData[index] > this.arrayData[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    public int maximum() throws HeapIsEmpty {
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

            HeapForMaxQuery heapForMaxQuery = new HeapForMaxQuery(20);
            heapForMaxQuery.insert(1);
            heapForMaxQuery.insert(2);
            heapForMaxQuery.insert(4);
            heapForMaxQuery.insert(3);
            heapForMaxQuery.insert(5);
            heapForMaxQuery.insert(6);
            heapForMaxQuery.insert(7);
            heapForMaxQuery.insert(8);
            heapForMaxQuery.insert(9);
            heapForMaxQuery.insert(10);

            System.out.printf("%d\n", heapForMaxQuery.maximum());
            heapForMaxQuery.extractMaximum();
            System.out.printf("%d\n", heapForMaxQuery.maximum());
            heapForMaxQuery.increaseValue(7, 88);
            System.out.printf("%d\n", heapForMaxQuery.maximum());
            heapForMaxQuery.extractMaximum();
            System.out.printf("%d\n", heapForMaxQuery.maximum());

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.printf("%s", dataStructuresExceptions.getMessage());
        }
    }

}
