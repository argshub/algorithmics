package Algorithms.Books.ProgrammingChallenges.NumberTheory;

import java.util.Scanner;

/**
 * Created by argshub on 6/4/2018.
 */
public class LightMoreLight {


    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int totalBulb;
        while ((totalBulb = scanner.nextInt()) != 0) {
            boolean check[] = new boolean[totalBulb+1];
            for (int i = 1; i <= totalBulb; i++) {
                int j = 1;
                while (j < check.length) {
                    if((j % i) == 0) {
                        if(check[j]) check[j] = false;
                        else check[j] = true;
                    }
                    j++;
                }
            }
            if(check[totalBulb]) System.out.println("ON");
            else System.out.println("OFF");
        }
    }
}
