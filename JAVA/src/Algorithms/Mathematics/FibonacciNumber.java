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
public class FibonacciNumber {
    
    public static int fibonacciOfNthPosition(int n) {
        if(n <= 1) return n;
        else return fibonacciOfNthPosition(n - 1) + fibonacciOfNthPosition(n - 2);
    }
    
    public static int[] fibonacciSeries(int total) {
        int data[] = new int[total];
        data[0] = 0;
        data[1] = 1;
        for(int i = 2; i < total; i++) {
            data[i] = data[i- 1] + data[i-2];
        }
        return data;
    }
    
    public static void main(String arg[]) {
        for(int i = 0; i < 20; i++) System.out.printf("%d\t", fibonacciOfNthPosition(i));
        System.out.println();
        int data[] = fibonacciSeries(40);
        for(int i = 0; i < data.length; i++) System.out.printf("%d\t", data[i]);
    }
}
