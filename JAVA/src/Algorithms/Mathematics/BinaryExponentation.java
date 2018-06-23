package Algorithms.Mathematics;

/**
 * Created by xenonus on 8/1/2010.
 */
public class BinaryExponentation {

    public static int exponent(int number, int power) {
        if(power == 0) return 1;
        else if((power & 1) != 0) return number * exponent(number * number, power / 2);
        else return exponent(number * number, power / 2);
    }

    public static int exponentIterative(int number, int power) {
        int result = 1;
        while (power > 0) {
            if((power & 1) != 0) result *= number;
            number *= number;
            power /= 2;
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
