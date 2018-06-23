package Algorithms.Books.ProgrammingChallenges.GettingStarted;

import java.util.Scanner;

/**
 * Created by argshub on 6/2/2018.
 */
public class TheTrip {


    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int test;
        while ((test = scanner.nextInt()) != 0) {
            float data[] = new float[test];
            float total = 0f;
            for (int i = 0; i < data.length; i++) {
                data[i] = scanner.nextFloat();
                total += data[i];
            }
            float average = (float) (int) total / test;
            System.out.println(average);
            float exchange = 0f;
            for (int i = 0; i < data.length; i++) {
                if(data[i] < average) {
                    float difference = average - data[i];
                    exchange += difference;
                }
            }
            System.out.printf("$%.2f", exchange);
        }
    }
}
