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
public class SumOfConsecutiveNumbers {
    
    public static int sum(int n) {
        return n * (n + 1) / 2;
    }
    
    public static int sumOfRange(int x, int y) {
        return sum(y) - sum(x - 1);
    }
    
    public static void main(String arg[]) {
        System.out.println(sum(10));
        System.out.println(sumOfRange(5, 10));
    }
}
