package Algorithms.Mathematics;

/**
 * Created by xenonus on 8/1/2010.
 */
public class SumOfConsecutiveSquare {

    public static int sum(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    public static int sumOfRange(int first, int last) {
        return sum(last) - sum(first - 1);
    }

    public static void main(String arg[]) {

        System.out.println(sum(5));
        System.out.println(sum(10));
        System.out.println(sumOfRange(6, 10));
        System.out.println(sumOfRange(1, 5));

    }
}
