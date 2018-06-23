package DataStructures.ListAndSequence;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.ListIsEmpty;
import DataStructures.Iter.Iterable;
import DataStructures.Iter.Iterator;


/**
 * Created by xenonus on 5/19/2018.
 */
public class List<T> implements Iterable {

    protected Node header, trailer;
    private int counter;

    public List() {
        this.header = new Node(null);
        this.trailer = new Node(null);
        this.header.next = this.trailer;
        this.trailer.previous = this.header;
        this.counter = 0;
    }

    public void insertFront(final T element) {
        this.insert(this.header.next, element);
    }

    public void insertBack(final  T element) {
        this.insert(this.trailer, element);
    }

    public T front() throws ListIsEmpty {
        if(this.header.next == this.trailer) throw new ListIsEmpty("List is Empty");
        return this.header.next.element;
    }

    public T back() throws ListIsEmpty {
        if(this.header.next == this.trailer) throw new ListIsEmpty("List Is empty");
        return this.trailer.previous.element;
    }

    public void removeFront() throws ListIsEmpty{
        if(this.header.next == this.trailer) throw new ListIsEmpty("List is empty");
        this.remove(this.header.next);
    }

    public void removeBack() throws ListIsEmpty {
        if(this.header.next == this.trailer) throw new ListIsEmpty("List is Empty");
        this.remove(this.trailer.previous);
    }

    protected void remove(Node node) {
        Node next = node.next;
        Node previous = node.previous;
        previous.next = next;
        next.previous = previous;
        this.counter--;
    }

    public void insertAfter(Iterator iterator, final T element) {
        ListIterator listIterator = (ListIterator) iterator;
        this.insert(listIterator.header, element);
    }

    public void insertBefore(Iterator iterator, final T element) {
        ListIterator listIterator = (ListIterator) iterator;
        this.insert(listIterator.header.previous, element);
    }

    public boolean isExistInPath(T element, T element2) {
        Node point = this.header.next, previous = null;
        while (point != null) {
            if(point.element == element2) {
               if(previous != null) {
                   if(previous.element != element) return true;
               }

            }
            previous = point;
            point = point.next;
        }
        return false;
    }

    protected void insert(Node node, final T element) {
        Node node1 = new Node(element);
        node1.next = node;
        node1.previous = node.previous;
        node.previous = node.previous.next = node1;
        this.counter++;
    }

    public int count() {
        return this.counter;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator(this.header.next, this.trailer);
    }

    protected class Node {
        protected T element;
        protected Node previous, next;
        private Node(final T element) {
            this.element = element;
            this.previous = this.next = null;
        }
    }

    private  class ListIterator implements Iterator<T> {
        private Node header, trailer;
        private ListIterator(Node header, Node trailer) {
            this.header = header;
            this.trailer = trailer;
        }

        @Override
        public boolean hasNext() {
            return this.header != this.trailer;
        }

        @Override
        public T next() {
            T element = this.header.element;
            this.header = this.header.next;
            return element;
        }
    }



    public static void main(String arg[]) {
        try {

            List<Integer> list = new List<>();
            Iterator iterator;
            list.insertFront(300);
            list.insertFront(200);
            list.insertFront(100);

            list.insertBack(400);
            list.insertBack(500);
            list.insertBack(600);


            iterator = list.iterator();
            while (iterator.hasNext()) {
                Integer integer = (Integer) iterator.next();
                list.insertBefore(iterator, integer * integer);
                list.insertAfter(iterator, integer * integer);
            }

            iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.printf("%d\t", iterator.next());
            }

            System.out.println();
            System.out.println(list.front());
            System.out.println(list.back());
        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}
