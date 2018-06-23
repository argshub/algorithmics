package Algorithms.Bit;

/**
 * Created by xenonus on 8/10/2010.
 */
public class DecimalToBinary {

    public static void decimalToBinary(int number) {
        for (int i = 31; i >= 0; i--) {
            if((number & (1 << i)) != 0) System.out.print(1);
            else System.out.print(0);
        }
    }

    public static void main(String arg[]) {

        decimalToBinary(1001);
    }
}
