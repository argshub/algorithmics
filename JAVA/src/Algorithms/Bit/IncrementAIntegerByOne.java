package Algorithms.Bit;

/**
 * Created by xenonus on 7/25/2010.
 */
public class IncrementAIntegerByOne {

    public static int increment(int n) {
        int setBit = 1;
        while((n & setBit) != 0) {
            n ^= setBit;
            setBit <<= 1;
        }
        n |= setBit;
        return n;
    }

    public static void main(String arg[]) {
        System.out.println(increment(0));
        System.out.println(increment(100));
        System.out.println(increment(-1));
    }
}
