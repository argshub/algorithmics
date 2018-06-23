package Algorithms.Books.CompetitiveProgrammersHandbook.CompleteSearch;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.ListIsEmpty;
import DataStructures.Iter.Iterator;
import DataStructures.ListAndSequence.List;

/**
 * Created by argshub on 5/29/2018.
 */
public class GeneratingPermutation {

    private static List<Integer> list = new List<>();
    private static boolean choose[] = new boolean[9];

    public static void generate(int total) throws ListIsEmpty {
        if(list.count() == total) {
            Iterator iterator = list.iterator();
            System.out.print("[ ");
            while (iterator.hasNext()) {
                System.out.printf("%d, ", iterator.next());
            }
            System.out.print(" ]\n");
        } else {
            for(int i = 0; i < total; i++) {
                if(choose[i]) continue;
                list.insertBack(i);
                choose[i] = true;
                generate(total);
                choose[i] = false;
                list.removeBack();
            }
        }
    }

    public static void main(String arg[]) {
        try {
            generate(3);

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}
