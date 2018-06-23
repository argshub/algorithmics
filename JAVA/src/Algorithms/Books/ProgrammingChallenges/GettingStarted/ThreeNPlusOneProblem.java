package Algorithms.Books.ProgrammingChallenges.GettingStarted;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by argshub on 5/31/2018.
 */
public class ThreeNPlusOneProblem {


    public static void main(String arg[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int max = 0;
        for (int i = x; i <= y; i++) {
            int j = i, count = 1;
            while (j != 1) {
                j = ((j & 1) != 0) ? j * 3 + 1 : j / 2;
                count++;
            }
            max = max > count ? max : count;
        }
        System.out.printf("%d %d %d\n", x, y, max);
    }
}
