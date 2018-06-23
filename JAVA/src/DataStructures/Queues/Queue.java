package DataStructures.Queues;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.QueueIsEmpty;
import DataStructures.Exceptions.QueueOverflow;
import DataStructures.Iter.Iterator;
import DataStructures.Iter.Iterable;

/**
 * Created by xenonus on 7/26/2010.
 */
public class Queue<T> implements Iterable {

    private int capacity;

    private Node front, back;
    private int counter;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.counter = 0;
        this.front = this.back = null;
    }

    public Queue() {
        this(20);
    }

    public void enqueue(final T element) throws QueueOverflow {
        if(this.counter >= this.capacity) throw new QueueOverflow("Queue is Overflow", this.capacity);
        Node node = new Node(element);
        if(this.front == null) this.front = this.back = node;
        else this.back = this.back.next = node;
        this.counter++;
    }

    public void dequeue() throws QueueIsEmpty {
        if(this.front == null) throw new QueueIsEmpty("Queue Is Empty");
        if(this.front == this.back) this.front = this.back = null;
        else this.front = this.front.next;
        this.counter--;
    }

    public T front() throws QueueIsEmpty {
        if(this.front == null) throw new QueueIsEmpty("Queue is empty");
        return this.front.element;
    }

    public boolean empty() {
        return this.front == null;
    }

    public Iterator iterator() {
        return new QueueIterator(this.front);
    }

    private class Node {
        private T element;
        private Node next;
        private Node(final T element) {
            this.element = element;
            this.next = null;
        }
    }

    private class QueueIterator implements Iterator<T> {

        private Node cursor;

        private QueueIterator(Node cursor) {
            this.cursor = cursor;
        }
        public boolean hasNext() {
            return this.cursor != null;
        }
        public T next() {
            T element= this.cursor.element;
            this.cursor = this.cursor.next;
            return element;
        }
    }

    public static void main(String arg[]) {
        try {
            Queue<Integer> queue = new Queue<>(10);
            Iterator iterator;
            queue.enqueue(100);
            queue.enqueue(200);
            queue.enqueue(300);
            queue.enqueue(400);
            queue.enqueue(500);
            queue.enqueue(600);
            queue.enqueue(700);
            queue.enqueue(800);
            queue.enqueue(900);
            queue.enqueue(1000);

            iterator = queue.iterator();
            while(iterator.hasNext()) {
                System.out.printf("%d\t", iterator.next());
            }
            System.out.println(queue.front());

            queue.dequeue();
            queue.dequeue();

            System.out.println(queue.front());

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}
