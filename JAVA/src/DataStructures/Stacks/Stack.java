package DataStructures.Stacks;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.StackIsEmpty;
import DataStructures.Exceptions.StackOverflow;
import DataStructures.Iter.Iterable;
import DataStructures.Iter.Iterator;

/**
 * Created by xenonus on 7/26/2010.
 */
public class Stack<T> implements Iterable{

    private Node front;

    private int capacity;

    private int counter;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.front = null;
        this.counter = 0;
    }

    public Stack() {
        this(20);
    }

    public void push(final T element) throws StackOverflow {
        if(this.counter >= this.capacity) throw new StackOverflow("Stack is Overflow", this.capacity);
        Node node = new Node(element);
        if(this.front == null) this.front = node;
        else {
            node.next = this.front;
            this.front = node;
        }
        this.counter++;
    }

    public T top() throws StackIsEmpty {
        if(this.front == null) throw new StackIsEmpty("Stack is Empty");
        return this.front.element;
    }

    public void pop() throws StackIsEmpty {
        if(this.front == null) throw new StackIsEmpty("Stack is Empty");
        this.front = this.front.next;
        this.counter--;
    }

    public Iterator iterator() {
        return new StackIterator(this.front);
    }

    private class Node {
        private T element;
        private Node next;
        private Node(final T element) {
            this.element = element;
            this.next = null;
        }
    }

    private class StackIterator implements Iterator {

        private Node cursor;
        private StackIterator(Node cursor) {
            this.cursor = cursor;
        }

        public boolean hasNext() {
            return this.cursor != null;
        }

        public T next() {
            T element = this.cursor.element;
            this.cursor = this.cursor.next;
            return element;
        }
    }

    public static void main(String arg[]) {
        try {
            Stack<Integer> stack = new Stack<>(10);
            Iterator iterator;
            stack.push(500);
            stack.push(400);
            stack.push(300);
            stack.push(200);
            stack.push(100);
            stack.push(90);
            stack.push(80);
            stack.push(70);
            stack.push(60);
            stack.push(50);

            iterator = stack.iterator();
            while(iterator.hasNext()) {
                System.out.printf("%d\t", iterator.next());
            }

            System.out.println(stack.top());
            stack.pop();

            System.out.println(stack.top());

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.printf("%s & capacity: ", dataStructuresExceptions.getMessage(), dataStructuresExceptions.getCapacity());
        }
    }
}
