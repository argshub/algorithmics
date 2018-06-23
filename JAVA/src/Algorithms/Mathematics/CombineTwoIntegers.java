package Algorithms.Mathematics;

/**
 * Created by argshub on 6/5/2018.
 */
public class CombineTwoIntegers {


    public static int combine(int first, int second) {
        if((second / 10) == 0) return first * 10 + second % 10;
        return combine(first, second / 10) * 10 + second % 10;
    }


    public static void main(String arg[]) {
        System.out.println(combine(12345, 67890));
    }
}
