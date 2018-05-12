package DataStructures.Arrays;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.IndexOutOfRange;
import DataStructures.Iter.Iterable;
import DataStructures.Iter.Iterator;

import java.util.Vector;

/**
 * Created by xenonus on 7/27/2010.
 */
public class VectorOrArrayList<T> implements Iterable {

    private int capacity, counter;
    private T arrayData[];

    public VectorOrArrayList(int capacity) {
        this.capacity = capacity;
        this.arrayData = (T[]) new Object[this.capacity];
        this.counter = 0;
    }

    public VectorOrArrayList() {
        this(20);
    }

    public void insert(T data) {
        if(this.counter >= this.capacity) this.reserve(this.capacity * 2);
        this.arrayData[this.counter++] = data;
    }

    private void reserve(int capacity) {
        T data[] = (T[]) new Object[capacity];
        for (int i = 0; i < this.counter; i++) {
            data[i] = this.arrayData[i];
        }
        this.arrayData = data;
        this.capacity = capacity;
    }

    public void atIndex(int index, T data) throws IndexOutOfRange {
        if(index >= this.counter) throw new IndexOutOfRange("Index out of Range", this.capacity);
        this.arrayData[index] = data;
    }

    public T atIndex(int index) throws IndexOutOfRange {
        if(index >= this.counter) throw new IndexOutOfRange("Index Out Of Range", this.counter);
        return this.arrayData[index];
    }

    public Iterator iterator() {
        return new VectorIterator(this.counter);
    }

    private class VectorIterator implements Iterator<T> {

        private int lastIndex;
        private int counter;
        private VectorIterator(int lastIndex) {
            this.lastIndex = lastIndex;
            this.counter = 0;
        }

        public boolean hasNext() {
            return this.counter != this.lastIndex;
        }

        public T next() {
            try {
                return atIndex(this.counter++);
            } catch (IndexOutOfRange indexOutOfRange) {
                indexOutOfRange.printStackTrace();
            }
            return null;
        }
    }

    public static void main(String arg[]) {
        try {
            VectorOrArrayList<Integer> vectorOrArrayList = new VectorOrArrayList<>(10);
            Iterator iterator;

            for (int i = 0; i < 30; i++) vectorOrArrayList.insert(i * i);

            System.out.println(vectorOrArrayList.atIndex(10));
            vectorOrArrayList.atIndex(10, 0);
            System.out.println(vectorOrArrayList.atIndex(10));
            System.out.println(vectorOrArrayList.atIndex(29));

            iterator = vectorOrArrayList.iterator();
            while(iterator.hasNext()) {
                System.out.printf("%d\t", iterator.next());
            }

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.printf("%s & capacity: %d", dataStructuresExceptions.getMessage(), dataStructuresExceptions.getCapacity());
        }
    }
}
