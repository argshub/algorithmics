/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Books.CompetitiveProgrammersHandbook.Introduction;
import Algorithms.Mathematics.BinaryExponentation;
/**
 *
 * @author argshub
 */
public class GeometricProgression {
    
    public static int position(int first, int ratio, int  last) {
        return first * BinaryExponentation.exponent(ratio, last - 1);
    }
    
    public static int sum(int first, int ratio, int last) {
        return first * (1 - BinaryExponentation.exponent(ratio, last)) / (1 - ratio); 
    }
    
    public static int sumOfRange(int first, int ratio, int search1, int search2) {
        return sum(first, ratio, search2) - sum(first, ratio, search1 - 1);
    }
    
    public static void main(String arg[]) {
        
        System.out.println(position(2, 2, 4));
        System.out.println(sum(2, 2, 8));
        System.out.println(sumOfRange(2, 2, 5, 8));
    }
}
