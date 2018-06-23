package DataStructures.PriorityQueues;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.QueueIsEmpty;

/**
 * Created by xenonus on 5/19/2018.
 */
public class MinimumPriorityQueue {

    private Node head;

    public MinimumPriorityQueue() {
        this.head = null;
    }

    public void insert(final int element) {
        Node node = new Node(element);
        if(this.head == null) this.head = node;
        else {
            Node head = this.head;
            Node trailer = null;
            while (head != null) {
                if(head.element > element) break;
                trailer = head;
                head = head.next;
            }
            if(trailer == null) {
                node.next = this.head;
                this.head = node;
            } else {
                node.next = head;
                trailer.next = node;

            }
        }
    }

    public int minimum() throws QueueIsEmpty {
        if(this.head == null) throw  new QueueIsEmpty("Queue Is empty");
        return this.head.element;
    }

    public void removeMinimum() throws QueueIsEmpty {
        if(this.head == null) throw new QueueIsEmpty("Queue is empty");
        this.head = this.head.next;
    }

    public void traverse() {
        Node head = this.head;
        while (head != null) {
            System.out.printf("%d\t", head.element);
            head = head.next;
        }
    }

    private class Node {
        private int element;
        private Node next;
        private Node(final int element) {
            this.element = element;
            this.next = null;
        }
    }

    public static void main(String arg[]) {
        try {

            MinimumPriorityQueue minimumPriorityQueue = new MinimumPriorityQueue();
            minimumPriorityQueue.insert(20);
            minimumPriorityQueue.insert(10);
            minimumPriorityQueue.insert(100);
            minimumPriorityQueue.insert(50);
            minimumPriorityQueue.insert(200);

            minimumPriorityQueue.traverse();
            System.out.println(minimumPriorityQueue.minimum());
            minimumPriorityQueue.removeMinimum();
            System.out.println(minimumPriorityQueue.minimum());

            minimumPriorityQueue.traverse();
        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }

    }
}
