/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics.NumberTheory;

/**
 *
 * @author argshub
 */
public class FourDigitPalindrome {
    
    public static boolean palindrome(int number) {
        int result = 0, y = number;
        while(number > 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result == y;
    }
    
    public static void palindromeDivisible(int first, int last, int divisibility) {
        while(first <= last) {
            if(palindrome(first)) System.out.printf("%d -> %d\n", first, first % 11);
            first++;
        }
    }
    
    public static void main(String arg[]) {
        palindromeDivisible(1000, 9999, 11);
    }
}
