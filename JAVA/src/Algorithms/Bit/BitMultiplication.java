/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Bit;

/**
 *
 * @author argshub
 */
public class BitMultiplication {
    
    public static int multiplication(int a, int b) {
        int result = 0;
        while(b > 0) {
            if((b & 1) != 0) result += a;
            a = a << 1;
            b = b >> 1;
        }
        return result;
    }
    
    
    public static void main(String arg[]) {
        System.out.println(multiplication(12, 12));
    }
}
