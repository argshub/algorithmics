package Algorithms.Books.ProgrammingChallenges.ArithmeticAndAlgebra;

import Algorithms.Mathematics.BinaryExponentation;

import java.util.Scanner;

/**
 * Created by argshub on 5/31/2018.
 */
public class PrimaryArithmetic {


    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int last = scanner.nextInt();


        int total = 0, count = 0;
        boolean carry = false;
        int counter = 0;
        int result = 0;
        while (first > 0 || last > 0) {
            result = carry ? 1 : 0;
            result += ((first % 10) + (last % 10));
            total += (BinaryExponentation.exponent(10, count++) * (result % 10));
            carry = result >= 10;
            if(carry) counter++;
            first /= 10;
            last /= 10;
        }
        if(carry)total += BinaryExponentation.exponent(10, count) * (result % 10);
        if(counter > 0) System.out.printf("%d carry operation & total: %d", counter, total);
        else System.out.printf("No Carry Operation & Total: %d", total);
    }
}
