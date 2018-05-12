package DataStructures.Lists;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.ListIsEmpty;
import DataStructures.Iter.Iterable;
import DataStructures.Iter.Iterator;
/**
 * Created by xenonus on 7/26/2010.
 */
public class DoublyLinkedList<T> implements Iterable {

    private Node header, trailer;

    public DoublyLinkedList() {
        this.header = new Node();
        this.trailer = new Node();
        this.header.next = this.trailer;
        this.trailer.previous = this.header;
    }


    public void insertFront(final T element) {
        this.insert(this.header.next, element);
    }

    public void insertBack(final T element) {
        this.insert(this.trailer, element);
    }

    public T front() throws ListIsEmpty {
        if(this.header.next == this.trailer) throw new ListIsEmpty("List is empty");
        return this.header.next.element;
    }

    public T back() throws ListIsEmpty {
        if(this.header.next == this.trailer) throw new ListIsEmpty("List Is Empty");
        return this.trailer.previous.element;
    }

    public void removeFront() throws ListIsEmpty {
        if(this.header.next == this.trailer) throw new ListIsEmpty("List Is Empty");
        this.remove(this.header.next);
    }

    public void removeBack() throws ListIsEmpty {
        if(this.header.next == this.trailer) throw new ListIsEmpty("List Is Empty");
        this.remove(this.trailer.previous);
    }


    public void remove(Iterator iterator) {
        DoublyLinkedListIterator doublyLinkedListIterator = (DoublyLinkedListIterator) iterator;
        this.remove(doublyLinkedListIterator.header.previous);
    }

    private void remove(Node nodeToRemove) {
        Node next = nodeToRemove.next;
        Node previous = nodeToRemove.previous;
        next.previous = previous;
        previous.next = next;
    }

    private void insert(Node nodeToInsertBefore, final T element) {
        Node node = new Node();
        node.element = element;
        node.next = nodeToInsertBefore;
        node.previous = nodeToInsertBefore.previous;
        nodeToInsertBefore.previous = nodeToInsertBefore.previous.next = node;
    }


    public Iterator iterator() {
        return new DoublyLinkedListIterator(this.header.next, this.trailer);
    }

    private class Node {
        private Node next, previous;
        private T element;
        private Node() {
            this.element = null;
            this.next = this.previous = null;
        }
    }

    private class DoublyLinkedListIterator implements Iterator<T> {

        private Node header, trailer;
        private DoublyLinkedListIterator(Node header, Node trailer) {
            this.header = header;
            this.trailer = trailer;
        }

        public boolean hasNext() {
            return this.header != this.trailer;
        }

        public T next() {
            T element = this.header.element;
            this.header = this.header.next;
            return element;
        }
    }

    public static void main(String arg[]) {
        try {

            DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
            Iterator iterator;
            doublyLinkedList.insertFront(300);
            doublyLinkedList.insertFront(200);
            doublyLinkedList.insertFront(100);
            doublyLinkedList.insertBack(400);
            doublyLinkedList.insertBack(500);
            doublyLinkedList.insertBack(600);



            doublyLinkedList.removeFront();
            doublyLinkedList.removeBack();
            System.out.println();

            System.out.println();
            System.out.println(doublyLinkedList.front());
            System.out.println(doublyLinkedList.back());


            iterator = doublyLinkedList.iterator();
            while(iterator.hasNext()) {
                System.out.printf("%d\t", iterator.next());
            }

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}
