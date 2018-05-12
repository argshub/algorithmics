package Algorithms.Bit;

/**
 * Created by xenonus on 7/26/2010.
 */
public class CountNumberOfBitInANumber {

    public static int count(int n) {
        int counter = 0;
        while(n != 0) {
            n >>= 1;
            counter++;
        }
        return counter;
    }

    public static void main(String arg[]) {
        System.out.println(count(17));
    }
}
