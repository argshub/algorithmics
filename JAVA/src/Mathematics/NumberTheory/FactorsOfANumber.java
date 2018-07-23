package Mathematics.NumberTheory;

import java.util.Scanner;
/**
 * Created by argshub on 7/22/2018.
 */
public class FactorsOfANumber {

    public static void main(String rag[]) {
        Scanner scanner = new Scanner(System.in);
        long x= scanner.nextLong();

        for(int i = 1; i * i <= x; i++)
            if(x % i == 0)
                System.out.printf("%d %d ", i, x / i);

    }
}
