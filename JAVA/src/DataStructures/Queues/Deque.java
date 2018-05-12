package DataStructures.Queues;
import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Iter.Iterator;
import DataStructures.Lists.DoublyLinkedList;

/**
 * Created by xenonus on 7/26/2010.
 */
public class Deque extends DoublyLinkedList {

    public static void main(String arg[]) {
        try {

            DoublyLinkedList<Integer> deque = new Deque();
            Iterator iterator;

            deque.insertFront(300);
            deque.insertFront(200);
            deque.insertFront(100);
            deque.insertBack(400);
            deque.insertBack(500);
            deque.insertBack(600);


            deque.removeFront();
            deque.removeBack();
            System.out.println();


            System.out.println();
            System.out.println(deque.front());
            System.out.println(deque.back());

            iterator = deque.iterator();
            while(iterator.hasNext()) {
                System.out.printf("%d\t", iterator.next());
            }
        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}
