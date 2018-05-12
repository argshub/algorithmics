package Algorithms.Mathematics;

/**
 * Created by xenonus on 8/1/2010.
 */
public class GeometricProgression {

    public static int seriesValue(int first, int ratio, int position) {
        return first * BinaryExponentation.exponent(ratio, position - 1);
    }

    public static int sumOfSeries(int first, int ratio, int total) {
        return first *  (1 - BinaryExponentation.exponent(ratio, total)) / (1 - ratio);
    }

    public static void main(String arg[]) {
        System.out.println(seriesValue(2, 3, 5));
        System.out.println(sumOfSeries(2, 3, 5));
    }
}
