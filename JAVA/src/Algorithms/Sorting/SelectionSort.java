package Algorithms.Sorting;

/**
 * Created by xenonus on 7/31/2010.
 */
public class SelectionSort {

    public static int[] sort(int data[]) {
        int minimumAddress, temp;
        for (int i = 0; i < data.length; i++) {
            minimumAddress = i;
            for (int j = i + 1; j  < data.length; j++) {
                if(data[j] < data[minimumAddress]) minimumAddress = j;
            }
            temp = data[minimumAddress];
            data[minimumAddress] = data[i];
            data[i] = temp;
        }

        return data;
    }

    public static void main(String arg[]) {
        int data[] = {10, 8, 7, 5, 2, 1, 6, 3, 5, 1};
        data = sort(data);

        for (int i = 0; i < data.length; i++) System.out.printf("%d\t", data[i]);
    }
}
