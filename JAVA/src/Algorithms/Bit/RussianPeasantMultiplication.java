package Algorithms.Bit;

/**
 * Created by xenonus on 7/27/2010.
 */
public class RussianPeasantMultiplication {


    public static int multiply(int a, int b) {
        int result = 0;
        while(b != 0) {
            if((b & 1) != 0) result += a;
            a <<= 1;
            b >>= 1;
        }
        return result;
    }

    public static void main(String arg[]) {
        System.out.println(multiply(12, 2));
        System.out.println(multiply(2, 12));
    }
}
