package Algorithms.Bit;

/**
 * Created by xenonus on 7/25/2010.
 */
public class CountSetBitInARange {

    public static int countSetBit(int range) {
        int counter = 0;
        for(int i = 1; i <= range; i++) {
            int j = i;
            while(j != 0) {
                j &= (j - 1);
                counter++;
            }
        }
        return counter;
    }

    public static void main(String arg[]) {
        System.out.println(countSetBit(100));
        System.out.println(countSetBit(5));
    }
}
