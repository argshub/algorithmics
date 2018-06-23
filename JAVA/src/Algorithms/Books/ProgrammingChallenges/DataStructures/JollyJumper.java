package Algorithms.Books.ProgrammingChallenges.DataStructures;

import java.util.Scanner;

/**
 * Created by argshub on 6/2/2018.
 */
public class JollyJumper {


    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int numbers[] = new int[total];
        boolean check[] = new boolean[total];

        for (int i = 0; i < total; i++) {
            numbers[i] = scanner.nextInt();
            if(i > 0) {
                int difference = numbers[i-1] - numbers[i];
                if(difference < 0) difference *= -1;
                if(difference >= total) break;
                check[difference] = true;
            }
        }

        for (int i = 1; i < check.length; i++) {
            if(!check[i]) {
                System.out.println("Not Jolly");
                return;
            }
        }
        System.out.println("Jolly");
    }
}
