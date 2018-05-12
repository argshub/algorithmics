package Algorithms.Sorting;

/**
 * Created by xenonus on 7/31/2010.
 */
public class CountingSort {


    public static int[] sort(int data[]) {
        int maximum = 0;
        for (int i = 0; i< data.length; i++) maximum = max(maximum, data[i]);
        int newData[] = new int[maximum + 1];
        for (int i = 0; i < data.length; i++) newData[data[i]]++;
        int j = 0;
        for (int i = 0; i < newData.length; i++) {
            while (newData[i] != 0) {
                newData[i]--;
                data[j++]  = i;
            }
        }
        return data;
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static void main(String arg[]) {
        int data[] = {10, 1, 8, 0, 7, 2, 3, 5, 2, 1, 6, 3, 10, 8, 5, 1};
        data = sort(data);

        for (int i = 0; i < data.length; i++) System.out.printf("%d\t", data[i]);
    }
}
