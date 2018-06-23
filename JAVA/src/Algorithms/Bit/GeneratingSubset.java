package Algorithms.Bit;
import Algorithms.Mathematics.BinaryExponentation;
import DataStructures.Arrays.VectorOrArrayList;
import DataStructures.Iter.Iterator;

/**
 * Created by xenonus on 5/22/2018.
 */
public class GeneratingSubset {


    public static void generate(int data[]) {
        for (int i = 0; i < BinaryExponentation.exponent(2, data.length); i++) {
            VectorOrArrayList vectorOrArrayList = new VectorOrArrayList();
            for (int j = 0; j < data.length; j++) {
                if((i & (1 << j)) != 0) vectorOrArrayList.insert(data[j]);
            }
            System.out.print("[");
            Iterator iterator = vectorOrArrayList.iterator();
            while (iterator.hasNext()) {
                System.out.printf("%d, ", iterator.next());
            }
            System.out.print("],\n");
        }
    }


    public static void main(String arg[]) {

        int data[] = {1, 2, 3, 4, 5};
        generate(data);

    }
}
