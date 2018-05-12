package Algorithms.Searching;

import DataStructures.Exceptions.ValueNotExistsOnThatKey;
import DataStructures.Exceptions.DataStructuresExceptions;

/**
 * Created by xenonus on 7/31/2010.
 */
public class SequentialSearch {


    public static int search(int data[], int key) throws ValueNotExistsOnThatKey {
        for (int i = 0; i < data.length; i++) {
            if(data[i] == key) return data[i];
        }
        throw new ValueNotExistsOnThatKey("Value not Exists on Key: " + key);
    }

    public static void main(String arg[]) {
        try {

            int data[] = {10, 8, 7, 5, 2, 1, 6, 3, 5, 1};
            System.out.printf("%d\n", search(data, 2));
            System.out.printf("%d\n", search(data, 11));
            for (int i = 0; i < data.length; i++) System.out.printf("%d\t", data[i]);
        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}
