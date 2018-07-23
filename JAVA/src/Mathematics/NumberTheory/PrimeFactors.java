package Mathematics.NumberTheory;

import java.util.Scanner;

/**
 * Created by argshub on 7/22/2018.
 */
public class PrimeFactors {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        for(int i =2; i * i <= x; i++) {
            int counter = 0;
            while (x % i == 0) {
                counter++;
                x /= i;
            }
            if(counter > 0) System.out.printf("%d -> %d\n", i, counter);
        }
        if(x > 1) System.out.printf("%d\n", x);
    }
}
