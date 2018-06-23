package DataStructures.PriorityQueues;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.QueueIsEmpty;
import DataStructures.Queues.Queue;

/**
 * Created by xenonus on 5/19/2018.
 */
public class MaximumPriorityQueue {

    private Node head;

    public MaximumPriorityQueue() {
        this.head = null;
    }

    public void insert(final int element) {
        Node node = new Node(element);
        if(this.head == null) this.head = node;
        else {
            Node head = this.head;
            Node trailer = null;
            while (head != null) {
                if(head.element < element) break;
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

    public int maximum() throws QueueIsEmpty {
        if(this.head == null) throw  new QueueIsEmpty("Queue Is empty");
        return this.head.element;
    }

    public void removeMaximum() throws QueueIsEmpty {
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

            MaximumPriorityQueue maximumPriorityQueue = new MaximumPriorityQueue();
            maximumPriorityQueue.insert(20);
            maximumPriorityQueue.insert(10);
            maximumPriorityQueue.insert(100);
            maximumPriorityQueue.insert(50);
            maximumPriorityQueue.insert(200);


            System.out.println(maximumPriorityQueue.maximum());
            maximumPriorityQueue.removeMaximum();
            System.out.println(maximumPriorityQueue.maximum());

            maximumPriorityQueue.traverse();
        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }

    }
}
