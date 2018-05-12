package Algorithms.Statistics;

import Algorithms.Sorting.CountingSort;

/**
 * Created by xenonus on 7/31/2010.
 */
public class ModeAlgorithm {


    public static int mode(int data[]) {
        CountingSort.sort(data);
        int frequency = 0, value = 0, runLength = 0, runValue = 0;
        for (int i = 0; i < data.length; i++) {
            runLength = 1; runValue  = data[i];
            while (i + runLength < data.length && data[i + runLength] == runValue) runLength++;
            if(runLength > frequency) {
                frequency = runLength;
                value = runValue;
            }
            i += runLength;
        }
        return value;
    }

    public static void main(String arg[]) {
        int data[] = {10, 1, 8, 0, 7, 2, 3, 5, 2, 1, 6, 2, 3, 10,  8, 5, 1};
        System.out.printf("%d\t", mode(data));
    }
}
