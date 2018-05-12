package Algorithms.Mathematics;

/**
 * Created by xenonus on 8/1/2010.
 */
public class Exponent {

    public static int exponent(int number, int power) {
        if(power <= 1) return number;
        else return number * exponent(number, power - 1);
    }
    private static int exponentIterative(int number, int power) {
        int result  = 1;
        while (power > 0) {
            result *= number;
            power--;
        }
        return result;
    }

    public static void main(String arg[]) {
        System.out.println(exponent(2, 8));
        System.out.println(exponent(2, 7));
        System.out.println(exponent(10, 2));
        System.out.println(exponent(10, 3));
        System.out.println(exponentIterative(2, 8));
        System.out.println(exponentIterative(2, 7));
        System.out.println(exponentIterative(10, 2));
        System.out.println(exponentIterative(10, 3));
    }


}
