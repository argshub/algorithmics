package Algorithms.Bit;

/**
 * Created by xenonus on 5/22/2018.
 */
public class HammingDistance {


    public static int distance(int x, int y) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if(((1 << i) & x) != ((1 << i) & y)) count++;
        }
        return count;
    }

    public static int dis(int x, int y) {
        return CountSetBitInANumber.countSetBit(x ^ y);
    }



    public static void main(String arg[]) {

        System.out.println(distance(12, 33));
        System.out.println(distance(12, 33));
    }
}
