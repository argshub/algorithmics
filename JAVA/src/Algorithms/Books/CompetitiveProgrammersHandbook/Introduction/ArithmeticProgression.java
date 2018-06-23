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
public class ArithmeticProgression {
    
    
    public static int position(int first, int difference, int position) {
        return first + (position - 1) * difference;
    }
    
    public static int sum(int first, int difference, int total) {
        return (total * (first + position(first, difference, total))) / 2;
    }
    
    
    public static int sumOfRange(int first, int difference, int search1, int search2) {
        return sum(first, difference, search2) - sum(first, difference, search1 - 1);
    }
    
    public static void main(String arg[]) {
        
        System.out.println(position(2, 2, 4));
        System.out.println(sum(2, 2, 4));
        System.out.println(sumOfRange(2, 2, 4, 8));
    }
}
