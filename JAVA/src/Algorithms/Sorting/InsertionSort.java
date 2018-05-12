package Algorithms.Sorting;

/**
 * Created by xenonus on 7/31/2010.
 */
public class InsertionSort {


    public static int[] sort(int data[]) {
        int currentValue, j;
        for(int i = 1; i < data.length; i++) {
            currentValue = data[i];
            j = i - 1;
            while (j >= 0 && currentValue < data[j]) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = currentValue;
        }

        return data;
    }


    public static void main(String arg[]) {
        int data[] = {10, 8, 7, 5, 2, 1, 6, 3, 5, 1};
        data = sort(data);

        for (int i = 0; i < data.length; i++) System.out.printf("%d\t", data[i]);
    }
}
