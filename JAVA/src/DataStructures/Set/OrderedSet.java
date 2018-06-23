package DataStructures.Set;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.SetIsEmpty;

/**
 * Created by xenonus on 8/10/2010.
 */
public class OrderedSet {


    protected Node header, trailer;

    public OrderedSet() {
        this.header = new Node(0);
        this.trailer = new Node(Integer.MAX_VALUE);
        this.header.next = this.trailer;
        this.trailer.previous = this.header;
    }

    public void insert(final int element) {
        if(this.header.next == this.trailer) this.insert(this.header.next, element);
        else {
            Node head = this.header.next;
            while (head != this.trailer) {
                if(head.element == element) return;
                else if(element < head.element) break;;
                head = head.next;
            }
            this.insert(head, element);
        }
    }

    public int lowest() throws SetIsEmpty {
        if(this.header.next == this.trailer) throw new SetIsEmpty("Set Is Empty");
        return this.header.next.element;
    }

    public void removeLowest() throws SetIsEmpty {
        if(this.header.next == this.trailer) throw new SetIsEmpty("Set Is Empty");
        this.remove(this.header.next);
    }

    protected void remove(Node node) {
        Node next = node.next;
        Node previous = node.previous;
        previous.next = next;
        next.previous = previous;
    }

    public boolean empty() {
        return this.header.next == this.trailer;
    }

    public void makeSetEmpty() throws SetIsEmpty {
       this.header.next = this.trailer;
       this.trailer.previous = this.header;
    }

    public boolean isElementExists(int element) {

        Node header = this.header.next;
        while (header != this.trailer) {
            if(header.element == element) return true;
            header = header.next;
        }

        return false;
    }

    protected void insert(Node node, final int element) {
        Node newNode = new Node(element);
        newNode.next = node;
        newNode.previous = node.previous;
        node.previous = node.previous.next = newNode;
    }

    public void traverse() {
        Node head = this.header.next;
        while (head != this.trailer) {
            System.out.printf("%d\t", head.element);
            head = head.next;
        }
    }

    protected class Node {
        protected int element;
        protected Node next, previous;
        private Node(final int element) {
            this.element = element;
            this.next = this.previous = null;
        }
    }


    public static void main(String arg[]) {

        try {

            OrderedSet orderedSet = new OrderedSet();
            orderedSet.insert(10);
            orderedSet.insert(5);
            orderedSet.insert(100);
            orderedSet.insert(110);
            orderedSet.insert(20);
            orderedSet.insert(10);
            orderedSet.insert(5);
            orderedSet.insert(15);

            orderedSet.traverse();
            System.out.println();
            System.out.println(orderedSet.lowest());

            System.out.println(orderedSet.isElementExists(5));
            orderedSet.removeLowest();
            System.out.println(orderedSet.isElementExists(5));
            orderedSet.traverse();


        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}
