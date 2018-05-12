package Algorithms.Mathematics;

/**
 * Created by xenonus on 8/1/2010.
 */
public class Logarithm {

    public static int log(int number, int base) {
        int result = 0;
        while (number > 1) {
            number /= base;
            result++;
        }
        return result;
    }

    public static int log(int number) {
        return log(number, 10);
    }

    public static void main(String arg[]) {
        System.out.println(log(100));
        System.out.println(log(32, 2));
        System.out.println(log(64, 2));
        System.out.println(log(128, 2));
        System.out.println(log(125, 2));
    }
}
