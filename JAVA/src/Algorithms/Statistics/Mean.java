package Algorithms.Statistics;

/**
 * Created by xenonus on 8/10/2010.
 */
public class Mean {

    public static float mean(int data[]) {
        int total = 0;
        for(int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return (float) total / data.length;
    }

    public static void main(String arg[]) {
        int data[] = {1, 2,3 , 4, 5, 6, 7, 8, 9};
        System.out.println(mean(data));
    }
}
