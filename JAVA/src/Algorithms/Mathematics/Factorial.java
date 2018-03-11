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
public class Factorial {
    
    public static int factorial(int n) {
        if(n <= 1) return 1;
        else return n * factorial(n - 1);
    }
    
    public static int iterativeFactorial(int n) {
        int x = 1;
        while(n > 1) {
            x *= n--;
        }
        return x;
    }
    
    public static void main(String arg[]) {
        System.out.println(factorial(6));
        System.out.println(factorial(5));
        
        System.out.println(iterativeFactorial(6));
        System.out.println(iterativeFactorial(5));
    }
}
