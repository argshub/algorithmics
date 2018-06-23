package DisceteStructures.NumberTheory;

/**
 * Created by argshub on 5/31/2018.
 */
public class PalindromicNumber {

    public static boolean isPalindrome(int number) {
        int result = 0, digit, num = number;
        while (num != 0) {
            digit = num % 10;
            result = (result * 10 + digit);
            num /= 10;
        }
        return result == number;
    }

    public static void palindromeInRange(int n) {
        int result1, result2 = 0, digit;
        for (int i = 1; i <= n; i++) {
            result1 = i;
            while (result1 !=0) {
                digit = result1 % 10;
                result2 = (result2 * 10 + digit);
                result1 /= 10;
            }
            if(result2 == i) System.out.printf("%d\t", i);
            result2 = 0;
        }
    }

    public static void main(String arg[]) {

        System.out.println(isPalindrome(1001));
        palindromeInRange(10000000);
    }
}
