package Algorithms.Searching;

import DataStructures.Exceptions.ValueNotExistsOnThatKey;
import DataStructures.Exceptions.DataStructuresExceptions;

/**
 * Created by xenonus on 7/31/2010.
 */
public class BinarySearch {

    public static int search(int data[], int key) throws ValueNotExistsOnThatKey {
        int low = 0, high = data.length - 1;
        int mid = (low + high) / 2;
        while (low < high) {
            if(data[mid] == key) return  data[mid];
            if(key > data[mid]) low = mid + 1;
            else high = mid - 1;
            mid = (low + high) / 2;
        }
        throw new ValueNotExistsOnThatKey("Value not exists on key: " + key);
    }


    public static void main(String arg[]) {

       try {
           int data[] = {1, 2, 4, 5, 6, 7,8, 9, 10};
           System.out.printf("%d\t", search(data, 4));
           System.out.printf("%d\t", search(data, 9));
           System.out.printf("%d\t", search(data, 3));

       } catch (DataStructuresExceptions dataStructuresExceptions) {
           System.out.println(dataStructuresExceptions.getMessage());
       }
    }
}
