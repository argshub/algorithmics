/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Mathematics;

/**
 *
 * @author argshub
 */
public class GreatestCommonDivisor {
    
    public static int GCD(int x, int y) {
        int gcd = 0;
        while(y != 0) {
            gcd = x % y;
            x = y;
            y = gcd;
        }
        return x;
    }
    
    public static void main(String arg[]) {
        System.out.println(GCD(100, 35));
    }
}
