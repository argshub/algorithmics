package Mathematics.DynamicProgramming;

/**
 * Created by argshub on 7/22/2018.
 */
public class FibonacciSequence {

    public static void generateSequence(int position) {
        long fib[] = new long[position+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i <= position; i++) fib[i] = fib[i-1] + fib[i-2];
        for(int i =0; i <= position; i++) System.out.printf("%d\t", fib[i]);
    }

    public static void main(String arg[]) {

        generateSequence(50);
    }

}
