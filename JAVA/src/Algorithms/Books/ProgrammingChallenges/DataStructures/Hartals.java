package Algorithms.Books.ProgrammingChallenges.DataStructures;

import java.util.Scanner;

/**
 * Created by argshub on 6/2/2018.
 */
public class Hartals {


    public static void main(String arg[]) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int totalDay = scanner.nextInt();
            if(totalDay == 0) break;
            boolean total[] = new boolean[totalDay+1];
            int totalParty = scanner.nextInt();
            int param[] = new int[totalParty];
            for (int i = 0; i < totalParty; i++) param[i] = scanner.nextInt();

            for (int i = 0; i < param.length; i++)
                if(param[i] != 0)
                    for (int j = param[i]; j < total.length; j += param[i]) total[j] = true;

            int counter = 0;

            for (int i = 1; i < total.length; i++)
                if(total[i])
                    if((i % 7) != 6 && (i % 7) != 0) counter++;

            System.out.println(counter);
        }
    }
}
