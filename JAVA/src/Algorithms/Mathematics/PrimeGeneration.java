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
public class PrimeGeneration {
    
    
    public static void primeOfRange(int n) {
        boolean prime[] = new boolean[n+1];
        for(int i = 2; i * i <= n; i++) {
            if(!prime[i]) {
                int j = i + i;
                while(j <= n) {
                    prime[j] = true;
                    j += i;
                }
            }
        }
        for(int i = 2; i <= n; i++) {
            if(!prime[i]) System.out.printf("%d ", i);
        }
    }
    
    public static void main(String arg[]) {
        primeOfRange(100);
    }
}
