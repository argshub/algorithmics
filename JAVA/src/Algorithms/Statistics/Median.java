package Algorithms.Statistics;

/**
 * Created by xenonus on 8/10/2010.
 */
public class Median {

    public static float median(int data[]) {
        if((data.length & 1) != 0) return (float) data[data.length/ 2];
        else return (float) (data[data.length/ 2] + data[data.length / 2 - 1]) / 2;
    }


    public static void main(String arg[]) {
        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(median(data));
    }
}
