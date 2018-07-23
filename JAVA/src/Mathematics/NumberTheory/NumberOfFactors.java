package Mathematics.NumberTheory;
import java.util.Scanner;
/**
 * Created by argshub on 7/22/2018.
 */
public class NumberOfFactors {



    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        long x;
        while ((x = scanner.nextLong()) != 0) {
            int product = 1, counter;
            for(int i = 2; i * i <= x; i++) {
                counter = 0;
                while (x % i == 0) {
                    counter++;
                    x /= i;
                }
                if(counter > 0) product *= counter + 1;
            }
            if(x > 1) product *= 2;
            System.out.println(product);
        }

    }
}
