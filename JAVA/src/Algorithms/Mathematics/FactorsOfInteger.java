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
public class FactorsOfInteger {
    
    public static void factors(int n) {
        for (int i = 1; i <= n / 2; i++) {
            if(n % i == 0) System.out.printf("%d ", i);
        }
        System.out.printf("%d", n);
    }
    
    public static void main(String arg[]) {
        factors(99);
    }
}
