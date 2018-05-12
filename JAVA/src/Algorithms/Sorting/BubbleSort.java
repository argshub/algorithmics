package Algorithms.Sorting;

/**
 * Created by xenonus on 7/31/2010.
 */
public class BubbleSort {

    public static int[] sort(int data[]) {
        int temp;
        for (int i = 0; i < data.length; i++) {
            for(int j = 0; j < (data.length - i - 1); j++) {
                if(data[j] > data[j+1]) {
                    temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }

    public static void main(String arg[]) {
        int data[] = {10, 8, 7, 5, 2, 1, 6, 3, 5, 1};
        data = sort(data);

        for (int i = 0; i < data.length; i++) System.out.printf("%d\t", data[i]);
    }
}
