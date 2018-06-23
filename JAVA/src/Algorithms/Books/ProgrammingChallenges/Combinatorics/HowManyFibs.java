package Algorithms.Books.ProgrammingChallenges.Combinatorics;

import java.util.Scanner;

/**
 * Created by argshub on 6/1/2018.
 */
public class HowManyFibs {


    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        long i = 0, j = 1, fib;
        int count = 0;
        while (true) {
            fib = i + j;
            i = j;
            j = fib;
            System.out.println(fib);
            if(fib >= x && fib <= y) count++;
            else if(fib > y) break;
        }
        System.out.println(count);
    }
}
