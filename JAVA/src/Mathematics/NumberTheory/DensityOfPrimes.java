package Mathematics.NumberTheory;

/**
 * Created by argshub on 7/23/2018.
 */
public class DensityOfPrimes {

    public static long density(long x) {
        return (long) (x / Math.log(x));
    }

    public static void main(String rag[]) {
        System.out.println(density(1000000));
    }
}
