package Mathematics.NumberTheory;

import java.util.Scanner;
/**
 * Created by argshub on 7/23/2018.
 */
public class ProductOfFactors {


    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        long x;
        while ((x = scanner.nextLong()) != 0)  {
            long y = x;
            int sum = 1;
            for(int i = 2; i * i <= x; i++) {
                int counter = 0;
                while (x % i == 0) {
                    counter++;
                    x /= i;
                }
                if(counter > 0) sum *= (counter + 1);
            }
            if(x > 1) sum *= 2;
            long answer = (long) Math.pow(y, sum / 2);
            System.out.println(answer);
        }
    }
}
