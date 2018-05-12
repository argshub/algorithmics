package Algorithms.Mathematics;


/**
 * Created by xenonus on 8/1/2010.
 */
public class SumOfConsecutiveCube {

    public static int sum(int n) {
        return BinaryExponentation.exponent(n, 2) * BinaryExponentation.exponent(n + 1, 2) / 4;
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
