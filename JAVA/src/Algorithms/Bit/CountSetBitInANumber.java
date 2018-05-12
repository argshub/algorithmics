package Algorithms.Bit;

/**
 * Created by xenonus on 7/25/2010.
 */
public class CountSetBitInANumber {

    public static int countSetBitOfNTimeAlgorithm(int n) {
        int counter = 0;
        for(int i = 0; i <= 31; i++) {
            if((n & (n << i)) != 0) counter++;
        }
        return counter;
    }

    public static int countSetBit(int n) {
        int counter  = 0;
        while(n != 0) {
            n &= (n - 1);
            counter++;
        }
        return counter;
    }

    public static void main(String arg[]) {
        System.out.println(countSetBitOfNTimeAlgorithm(127));
        System.out.println(countSetBitOfNTimeAlgorithm(-1));
        System.out.println(countSetBit(127));
        System.out.println(countSetBit(-1));
    }
}
