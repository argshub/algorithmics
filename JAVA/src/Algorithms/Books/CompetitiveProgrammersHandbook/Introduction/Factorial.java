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
public class Factorial {
    
    public static int facRecursive(int n) {
        if(n <= 1) return n;
        else return n * facRecursive(n - 1);
    }
    
    public static int facIterative(int n) {
        int fact = 1;
        while(n > 0) fact *= n--;
        return fact;
    }
    
    public static void main(String arg[]) {
        
        
        System.out.println(facRecursive(5));
        System.out.println(facIterative(5));
    }
}
