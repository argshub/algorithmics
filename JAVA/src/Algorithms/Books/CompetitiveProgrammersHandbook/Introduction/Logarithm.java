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
public class Logarithm {
    
    
    public static int log(int number, int base) {
        int count = 0;
        while((number / base) != 0) {
            number /= base;
            count++;
        }
        return count;
    }
    
    public static void main(String arg[]) {
        System.out.println(log(32, 2));
        System.out.println(log(100, 10));
        System.out.println(log(128, 2));
    }
}
