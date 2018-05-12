package DataStructures.Lists;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.ListIsEmpty;
import DataStructures.Iter.Iterable;
import DataStructures.Iter.Iterator;

/**
 * Created by xenonus on 7/26/2010.
 */
public class CircularLinkedList<T> implements Iterable {

    private Node head;

    private int counter;

    public CircularLinkedList() {
        this.head = null;
        this.counter = 0;
    }

    public void insert(final T element) {
        Node node = new Node(element);
        if(this.head == null) {
            this.head = node;
            this.head.next = this.head;
        }
        else {
            node.next = this.head.next;
            this.head.next = node;
        }
        this.counter++;
    }

    public T current() throws ListIsEmpty {
        if(this.head == null) throw new ListIsEmpty("List Is Empty");
        return this.head.element;
    }

    public void remove() throws ListIsEmpty {
        if(this.head == null) throw new ListIsEmpty("List IS Empty");
        if(this.head.next == this.head) this.head = null;
        else this.head.next = this.head.next.next;
        this.counter--;
    }

    public int length() {
        return this.counter;
    }

    public void advance() throws ListIsEmpty {
        if(this.head == null) throw new ListIsEmpty("List Is Empty");
        this.head = this.head.next;
    }

    public Iterator iterator() {
        return new CircularLinkedListIterator(this.head);
    }

    private class Node {
        private Node next;
        private T element;
        private Node(final T element) {
            this.element = element;
            this.next = null;
        }
    }

    private class CircularLinkedListIterator implements Iterator  {

        private Node cursor;

        private int counter;

        private CircularLinkedListIterator(Node cursor) {
            this.cursor = cursor;
        }

        public boolean hasNext() {
            return this.counter != length();
        }

        public T next() {
            T element = this.cursor.element;
            this.cursor = this.cursor.next;
            this.counter++;
            return element;
        }

    }

    public static void main(String arg[]) {
        try {
            CircularLinkedList<Integer> circularLinkedList =  new CircularLinkedList<>();
            Iterator iterator;
            circularLinkedList.insert(100);
            circularLinkedList.insert(200);
            circularLinkedList.insert(300);
            circularLinkedList.insert(400);



            iterator = circularLinkedList.iterator();
            while(iterator.hasNext()) {
                System.out.printf("%d\t", iterator.next());
            }
            System.out.println();
            circularLinkedList.advance();

            System.out.println();
            circularLinkedList.advance();
            System.out.println();

            System.out.println();
            circularLinkedList.remove();
            System.out.println();


        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}
