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
public class BinaryExponentation {
    
    public static int exponent(int number, int power) {
        if(power == 0) return 1;
        if((power & 1) != 0) return number * exponent(number * number, power / 2);
        else return exponent(number * number, power / 2);
    }
    
    
    
    public static void main(String arg[]) {
        System.out.println(exponent(2, 7));
        System.out.println(exponent(2, 8));
        System.out.println(exponent(10, 3));
        
    }
}
