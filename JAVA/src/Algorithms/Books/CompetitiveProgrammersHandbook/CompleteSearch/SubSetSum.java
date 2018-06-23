package Algorithms.Books.CompetitiveProgrammersHandbook.CompleteSearch;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.ListIsEmpty;
import DataStructures.Iter.Iterator;
import DataStructures.ListAndSequence.List;

/**
 * Created by argshub on 6/4/2018.
 */
public class SubSetSum {

    public static List<Integer> list = new List<>();

    public static void search(int data[], int sum, int n, int size) throws ListIsEmpty {
        if(n == size) {
            Iterator iterator = list.iterator();
            int total = 0;
            while (iterator.hasNext()) {
                int next = (int) iterator.next();
                total += data[next];
            }
            if(total == sum) System.out.printf("Sum Found: %d\n", total);
        } else {
            search(data, sum, n+ 1, size);
            list.insertBack(n);
            search(data, sum, n+1, size);
            list.removeBack();
        }
    }


    public static void main(String arg[]) {
        try {

            int data[] = {3, 5, 6, 7};
            search(data, 18, 0, 4);

        } catch (DataStructuresExceptions dataStructuresExceptions) {

        }
    }
}
