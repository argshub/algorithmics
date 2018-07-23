package Mathematics.NumberTheory;
import java.util.Scanner;
/**
 * Created by argshub on 7/22/2018.
 */
public class AllFactorsOfARange {


    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        byte data[] = new byte[range + 1];
        for (int i = 2; i <= range; i++) {
            int j = i;
            while (j <= range) {
                data[j]++;
                j += i;
            }
        }

        for(int i = 1; i <= range; i++) System.out.printf("%d -> %d\n", i, data[i] + 1);
    }
}
