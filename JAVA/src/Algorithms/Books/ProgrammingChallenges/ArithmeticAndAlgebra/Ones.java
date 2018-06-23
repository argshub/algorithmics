package Algorithms.Books.ProgrammingChallenges.ArithmeticAndAlgebra;

import java.util.Scanner;

/**
 * Created by argshub on 6/1/2018.
 */
public class Ones {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean isSequence = false;
        int multiple = 1, digitCounter = 0;
        long result;
        while (true) {
            result = (long) x * multiple++;
            System.out.println(result);
            while (result != 0) {
                if((result % 10) != 1) {
                    isSequence = false;
                    break;
                }
                result /= 10;
                isSequence = true;
                digitCounter++;
            }
            if(isSequence) break;
            digitCounter = 0;
        }
        System.out.println(digitCounter);
    }
}
