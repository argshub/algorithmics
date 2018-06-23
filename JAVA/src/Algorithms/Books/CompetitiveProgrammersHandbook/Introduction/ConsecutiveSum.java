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
public class ConsecutiveSum {
    
    public static int sum(int last) {
        return last * (last + 1) / 2;
    }
    
    
    public static int sumOfRange(int first, int last) {
        return sum(last) - sum(first - 1);
    }
    
    public static void main(String arg[]) {
        
        System.out.println(sum(10));
        System.out.println(sumOfRange(5, 10));
    }
}
