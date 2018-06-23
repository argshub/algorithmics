package Algorithms.Books.ProgrammingChallenges.ArithmeticAndAlgebra;

import java.util.Scanner;

/**
 * Created by argshub on 6/1/2018.
 */
public class ReverseAndAdd {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        int counter = 0, resultOne = data, resultTwo = data, palindrome1 = 0, palindrome2 = 0;
        while (true) {
            System.out.printf("Start: %d\n", resultOne);
            while (resultOne != 0) {
                palindrome1 = (palindrome1 * 10) + resultOne % 10;
                resultOne /= 10;
            }
            resultTwo = resultTwo + palindrome1;
            resultOne = resultTwo;
            while (resultOne != 0) {
                palindrome2 = (palindrome2 * 10) + (resultOne % 10);
                resultOne /= 10;
            }
            counter++;
            if(palindrome2 == resultTwo) break;
            resultOne = resultTwo;
            palindrome1 = palindrome2 = 0;
        }
        System.out.printf("Iteration Count: %d & Number: %d\n", counter, palindrome2);

    }
}
