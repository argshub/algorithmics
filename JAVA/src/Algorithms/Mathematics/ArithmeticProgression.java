package Algorithms.Mathematics;

/**
 * Created by xenonus on 8/1/2010.
 */
public class ArithmeticProgression {

    public static int seriesValue(int first, int position, int difference) {
        return first + (position - 1) * difference;
    }

    public static int sumOfSeries(int first, int total, int difference) {
        return total * (seriesValue(first, 1, difference) + seriesValue(first, total, difference)) / 2;
    }

    public static void main(String arg[]) {
        System.out.println(seriesValue(2, 4, 3));
        System.out.println(sumOfSeries(2, 4, 3));
    }
}
