package DataStructures.Lists;

/**
 * Created by argshub on 5/31/2018.
 */
public class UnrolledLinkedList {

    private Node head;


    public UnrolledLinkedList() {
        this.head = null;
    }

    public void insert(final int element) {
        if(this.head == null) {
            Node newNode = new Node();
            newNode.element[newNode.counter++] = element;
            this.head = newNode;
        } else {
            Node point = this.head, previous = this.head;
            while (point != null) {
                if(point.counter != 4) {
                    point.element[point.counter++] = element;
                    return;
                }
                previous = point;
                point = point.next;
            }
            Node newNode = new Node();
            newNode.element[newNode.counter++] = element;
            previous.next = newNode;
        }
    }

    public int search(int key) {
        Node point = this.head;
        while (point != null) {
            int i = 0;
            while (i < point.counter) {
                if(point.element[i] == key) return point.element[i];
                i++;
            }
            point = point.next;
        }
        return 0;
    }

    public void delete(int key) {
        Node point = this.head, previous = this.head;
        while (point != null) {
            int i = point.counter - 1;
            while (i >= 0) {
                if(point.element[i] == key) {
                    int j = i;
                    while (j < point.counter - 1) {
                        point.element[j] = point.element[j+1];
                        j++;
                    }
                    point.counter--;
                    if(point.counter == 0) {
                        if(this.head == point) this.head = point.next;
                        else previous.next = point.next;
                    }
                }
                i--;
            }
            previous = point;
            point = point.next;
        }
    }

    public void printList() {
        Node point = this.head;
        int j = 0;
        while (point != null) {
            int i = 0;
            while (i < point.counter) {
                System.out.printf("Node: %d & element: %d\n", j, point.element[i]);
                i++;
            }
            System.out.printf("Node: %d\n", j);
            j++;
            point = point.next;
        }
    }

    private class Node {
        private Node next;
        private int element[];
        private int counter;
        private Node() {
            this.element = new int[4];
            this.next = null;
            this.counter = 0;
        }
    }


    public static void main(String arg[]) {
        UnrolledLinkedList unrolledLinkedList = new UnrolledLinkedList();
        unrolledLinkedList.insert(100);
        unrolledLinkedList.insert(200);
        unrolledLinkedList.insert(300);
        unrolledLinkedList.insert(400);
        unrolledLinkedList.insert(500);
        unrolledLinkedList.insert(600);
        unrolledLinkedList.insert(700);
        unrolledLinkedList.insert(800);
        unrolledLinkedList.insert(900);
        unrolledLinkedList.insert(1000);
        unrolledLinkedList.insert(1100);

        unrolledLinkedList.printList();

        unrolledLinkedList.delete(700);
        unrolledLinkedList.delete(400);
        unrolledLinkedList.delete(900);
        unrolledLinkedList.delete(600);
        unrolledLinkedList.delete(500);
        unrolledLinkedList.delete(800);

        unrolledLinkedList.printList();


        unrolledLinkedList.insert(1500);
        unrolledLinkedList.insert(1600);
        unrolledLinkedList.insert(1700);
        unrolledLinkedList.insert(1800);
        unrolledLinkedList.insert(1900);
        unrolledLinkedList.insert(2000);
        unrolledLinkedList.insert(2100);

        System.out.println(unrolledLinkedList.search(150));
        System.out.println(unrolledLinkedList.search(700));


        unrolledLinkedList.printList();
    }
}
