package DataStructures.Arrays;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.QueueIsEmpty;
import DataStructures.Exceptions.QueueOverflow;

import java.util.Queue;

/**
 * Created by xenonus on 8/9/2010.
 */
public class CircularBufferOrCircularArrayOrCircularQueue<T> {

    private int capacity;

    private int count;

    private int pointer;

    private T arrayData[];

    public CircularBufferOrCircularArrayOrCircularQueue(int capacity) {
        this.capacity = capacity;
        this.count = this.pointer = 0;
        this.arrayData = (T[]) new Object[this.capacity];
    }

    public void insert(final T element) throws QueueOverflow {
        if (this.count >= this.capacity) throw new QueueOverflow("Queue is Overflow", this.capacity);
        this.arrayData[((this.pointer + this.count++) % this.capacity)] = element;
    }

    public T first() throws QueueIsEmpty {
        if (this.count == 0) throw new QueueIsEmpty("Queue is Empty");
        return this.arrayData[this.pointer];
    }

    public void remove() throws QueueIsEmpty {
        if (this.count == 0) throw new QueueIsEmpty("Queue is Empty");
        this.pointer = ++this.pointer == this.capacity ? 0 : this.pointer;
        this.count--;
    }

    public static void main(String arg[]) {
        try {

            CircularBufferOrCircularArrayOrCircularQueue<Integer> circularBufferOrCircularArrayOrCircularQueue = new CircularBufferOrCircularArrayOrCircularQueue<>(13);

            circularBufferOrCircularArrayOrCircularQueue.insert(100);
            circularBufferOrCircularArrayOrCircularQueue.insert(200);
            circularBufferOrCircularArrayOrCircularQueue.insert(300);
            circularBufferOrCircularArrayOrCircularQueue.insert(400);
            circularBufferOrCircularArrayOrCircularQueue.insert(500);
            circularBufferOrCircularArrayOrCircularQueue.insert(600);
            circularBufferOrCircularArrayOrCircularQueue.insert(700);
            circularBufferOrCircularArrayOrCircularQueue.insert(800);
            circularBufferOrCircularArrayOrCircularQueue.insert(1000);
            circularBufferOrCircularArrayOrCircularQueue.insert(1100);
            circularBufferOrCircularArrayOrCircularQueue.insert(1200);
            circularBufferOrCircularArrayOrCircularQueue.insert(1300);
            circularBufferOrCircularArrayOrCircularQueue.insert(1400);

            System.out.println(circularBufferOrCircularArrayOrCircularQueue.first());
            circularBufferOrCircularArrayOrCircularQueue.remove();
            System.out.println(circularBufferOrCircularArrayOrCircularQueue.first());
            circularBufferOrCircularArrayOrCircularQueue.remove();
            System.out.println(circularBufferOrCircularArrayOrCircularQueue.first());
            circularBufferOrCircularArrayOrCircularQueue.remove();
            circularBufferOrCircularArrayOrCircularQueue.remove();
            circularBufferOrCircularArrayOrCircularQueue.remove();
            circularBufferOrCircularArrayOrCircularQueue.remove();
            circularBufferOrCircularArrayOrCircularQueue.remove();
            circularBufferOrCircularArrayOrCircularQueue.remove();
            circularBufferOrCircularArrayOrCircularQueue.remove();
            circularBufferOrCircularArrayOrCircularQueue.remove();
            circularBufferOrCircularArrayOrCircularQueue.remove();
            circularBufferOrCircularArrayOrCircularQueue.insert(1500);
            circularBufferOrCircularArrayOrCircularQueue.insert(1600);
            circularBufferOrCircularArrayOrCircularQueue.remove();
            circularBufferOrCircularArrayOrCircularQueue.remove();
            circularBufferOrCircularArrayOrCircularQueue.remove();
            System.out.println(circularBufferOrCircularArrayOrCircularQueue.first());


        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}
