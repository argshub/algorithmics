package Algorithms.Books.CompetitiveProgrammersHandbook.CompleteSearch;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.ListIsEmpty;
import DataStructures.ListAndSequence.List;
import DataStructures.Iter.Iterator;

/**
 * Created by argshub on 5/29/2018.
 */
public class GeneratingSubset {

    private static List<Integer> list = new List<>();

    public static void bitAlgorithm(int n) {
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> list = new List<>();
            Iterator iterator;
            for (int j = 0; j < n; j++) {
                if((i & (1 << j)) != 0) list.insertBack(j);
            }
            iterator = list.iterator();
            System.out.print("{ ");
            while (iterator.hasNext()) {
                System.out.printf("%d, ", iterator.next());
            }
            System.out.print(" }");
        }

    }

    public static void iterative(int n, int length) throws ListIsEmpty{
        if(n == length) {
            System.out.print("{ ");
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) System.out.printf("%d, ", iterator.next());
            System.out.print(" }");
        } else {
            iterative(n + 1, length);
            list.insertBack(n);
            iterative(n + 1, length);
            list.removeBack();
        }
    }

    public static void main(String arg[]) {
        try {

            bitAlgorithm(4);
            System.out.println();
            iterative(0, 4);
        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }

}
