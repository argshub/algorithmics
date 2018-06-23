package DisceteStructures.NumberTheory;
import Algorithms.Mathematics.BinaryExponentation;
/**
 * Created by argshub on 5/31/2018.
 */
public class AppendTwoInteger {


    public static int append(int first, int last) {
        int result = last, counter = 0, digit = 0;
        while (last != 0) {
            counter++;
            last /= 10;
        }
        while (first != 0) {
            digit = first % 10;
            result += (digit * (BinaryExponentation.exponent(10, counter++)));
            first /= 10;
        }
        return result;
    }

    public static int append2(int first, int last) {
        int result = 0, digit;
        while (last != 0) {
            digit = last % 10;
            result = (result * 10 + digit);
            last /= 10;
        }
        while (result != 0) {
            digit = result % 10;
            first = (first * 10 + digit);
            result /= 10;
        }
        return first;
    }

    public static void main(String arg[]) {

        System.out.println(append(12345, 6789));
        System.out.println(append2(12345, 6789));
    }
}
