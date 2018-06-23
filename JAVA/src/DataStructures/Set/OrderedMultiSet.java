package DataStructures.Set;

import DataStructures.Exceptions.DataStructuresExceptions;

/**
 * Created by xenonus on 5/19/2018.
 */
public class OrderedMultiSet extends OrderedSet {

    public void insert(final int element) {
        if(this.header.next == this.trailer) this.insert(this.header.next, element);
        else {
            Node head = this.header.next;
            while (head != this.trailer) {
                if(element < head.element) break;
                head = head.next;
            }
            this.insert(head, element);
        }

    }


    public static void main(String arg[]) {
        try {

            OrderedMultiSet orderedMultiSet = new OrderedMultiSet();


            orderedMultiSet.insert(10);
            orderedMultiSet.insert(5);
            orderedMultiSet.insert(100);
            orderedMultiSet.insert(110);
            orderedMultiSet.insert(20);
            orderedMultiSet.insert(10);
            orderedMultiSet.insert(5);
            orderedMultiSet.insert(15);

            orderedMultiSet.traverse();
            System.out.println();
            System.out.println(orderedMultiSet.lowest());

            System.out.println(orderedMultiSet.isElementExists(5));
            orderedMultiSet.removeLowest();
            System.out.println(orderedMultiSet.isElementExists(5));
            orderedMultiSet.traverse();
        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }

    }
}
