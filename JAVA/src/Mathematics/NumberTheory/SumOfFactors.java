package Mathematics.NumberTheory;
import java.util.Scanner;
/**
 * Created by argshub on 7/22/2018.
 */
public class SumOfFactors {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        long x;
        while ((x = scanner.nextLong()) != 0) {
            long sum = 1;
            for (int i = 2; i * i <= x; i++) {
                int counter = 0;
                while (x % i == 0) {
                    counter++;
                    x /= i;
                }
                if (counter > 0) sum *= (long) ((Math.pow(i, counter + 1) - 1) / (i - 1));
            }
            if (x > 1) sum *= (long) ((Math.pow(x, 2) - 1) / (x - 1));
            System.out.println(sum);
        }
    }
}
