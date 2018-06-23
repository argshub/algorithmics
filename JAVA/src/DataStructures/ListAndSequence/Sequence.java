package DataStructures.ListAndSequence;


import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.IndexOutOfRange;
import DataStructures.Iter.Iterator;

/**
 * Created by xenonus on 5/19/2018.
 */
public class Sequence<T> extends List<T> {

    public Sequence() {

    }

    public T atIndex(int index) throws IndexOutOfRange {
        if(index >= super.count()) throw new IndexOutOfRange("Index Out Of range", super.count());
        int count = 0;
        Node head = this.header.next;
        while (count != index) {
            count++;
            head = head.next;
        }
        return head.element;
    }

    public void removeAtIndex(int index) throws IndexOutOfRange {
        if(index >= super.count()) throw new IndexOutOfRange("Index out of range", super.count());
        int count = 0;
        Node head = this.header.next;
        while (count != index) {
            count++;
            head = head.next;
        }
        this.remove(head);
    }

    public static void main(String arg[]) {
        try {

            Sequence<Integer> sequence = new Sequence<>();
            Iterator iterator;
            sequence.insertFront(300);
            sequence.insertFront(200);
            sequence.insertFront(100);

            sequence.insertBack(400);
            sequence.insertBack(500);
            sequence.insertBack(600);


            iterator = sequence.iterator();
            while (iterator.hasNext()) {
                Integer number = (Integer) iterator.next();
                sequence.insertBefore(iterator, number * number);
                sequence.insertAfter(iterator, number * number);

            }

            iterator = sequence.iterator();
            while (iterator.hasNext()) {
                System.out.printf("%d\t", iterator.next());
            }

            System.out.println();
            System.out.println(sequence.atIndex(15));
            sequence.removeAtIndex(0);
            sequence.removeAtIndex(14);

            iterator = sequence.iterator();
            while (iterator.hasNext()) {
                System.out.printf("%d\t", iterator.next());
            }

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }

}
