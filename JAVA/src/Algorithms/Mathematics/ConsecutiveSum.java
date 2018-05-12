package Algorithms.Mathematics;

/**
 * Created by xenonus on 8/1/2010.
 */
public class ConsecutiveSum {

    public static int sum(int n) {
        return n * (n + 1) / 2;
    }

    public static int sumOfRange(int first, int last) {
        return sum(last) - sum(first - 1);
    }

    public static void main(String arg[]) {
        System.out.println(sum(100));
        System.out.println(sumOfRange(50, 100));

    }
}
