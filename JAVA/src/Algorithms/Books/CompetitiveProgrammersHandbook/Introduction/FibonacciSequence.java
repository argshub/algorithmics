/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Books.CompetitiveProgrammersHandbook.Introduction;

/**
 *
 * @author argshub
 */
public class FibonacciSequence {
    
    public static int fibonacciOfKthPositionRecursive(int last) {
        if(last <= 1) return last;
        else return fibonacciOfKthPositionRecursive(last - 1) + fibonacciOfKthPositionRecursive(last - 2);
    }
    
    public static int fibonacciOfKthPositionIterative(int last) {
        int i = 1, first = 0, fib = 0, la = 1;
        while(i < last) {
            fib = first + la;
            first = la;
            la = fib;
            i++;
        }
        return la;
    }
    
    public static void fibonacciGenerator(int n) {
        int data[] = new int[n];
        data[0] = 0; data[1] = 1;
        int i = 2;
        while(i < n) {
            data[i] = data[i - 1] + data[i - 2];
            i++;
        }
        for(int j = 0; j < data.length; j++) System.out.printf("%d\t", data[j]);
        System.out.println();
    }
    
    public static int fibKth(int data[], int n) {
        if(data[n] != 0) return data[n];
        data[n] = (fibKth(data, n - 1) + fibKth(data, n - 2));
        return data[n];
    }
   
    
    public static void main(String arg[]) {
        
        
        System.out.println(fibonacciOfKthPositionRecursive(6));
        System.out.println(fibonacciOfKthPositionIterative(6));
        fibonacciGenerator(20);
        
        int data[] = new int[20];
        data[0] = 1;
        data[1] = 1;
        System.out.println();
        System.out.println();
        System.out.println(fibKth(data, data.length - 1));
        System.out.println();
        for(int i = 0; i < data.length; i++) System.out.printf("%d\t", data[i]);
        
    }
    
}
