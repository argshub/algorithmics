package DataStructures.Lists;
import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.ListIsEmpty;
import DataStructures.Iter.Iterator;
import DataStructures.Iter.Iterable;

/**
 * Created by xenonus on 7/26/2010.
 */
public class SinglyLinkedList<T> implements Iterable {

    private int counter;

    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void addFront(final T element) {
        Node node = new Node(element);
        if(this.head == null) this.head = node;
        else {
            node.next = this.head;
            this.head = node;
        }
    }

    public T front() throws ListIsEmpty {
        if(this.head == null) throw new ListIsEmpty("List is Empty");
        return this.head.element;
    }

    public void removeFront() throws ListIsEmpty {
        if(this.head == null) throw new ListIsEmpty("List is Empty");
        this.head = this.head.next;
    }

    public void reverse() {
        Node previous = null, current = this.head, next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.head = previous;
    }

    public Iterator iterator() {
        return new SinglyLinkedListIterator(this.head);
    }

    private class Node {
        private T element;
        private Node next;
        private Node(final T element) {
            this.element = element;
            this.next = null;
        }
    }



    private class SinglyLinkedListIterator implements Iterator<T> {
        private Node cursor;
        private SinglyLinkedListIterator(Node cursor) {
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
            SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
            Iterator iterator;
            singlyLinkedList.addFront(100);
            singlyLinkedList.addFront(200);
            singlyLinkedList.addFront(300);


            iterator = singlyLinkedList.iterator();
            while (iterator.hasNext()) {
                System.out.printf("%d\t", iterator.next());
            }

            singlyLinkedList.reverse();
            System.out.println();
            iterator = singlyLinkedList.iterator();
            while (iterator.hasNext()) {
                System.out.printf("%d\t", iterator.next());
            }
            System.out.println();
            System.out.println(singlyLinkedList.front());
            singlyLinkedList.removeFront();
            System.out.println(singlyLinkedList.front());
        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}
