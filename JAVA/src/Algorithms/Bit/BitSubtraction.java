/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Bit;

/**
 *
 * @author argshub
 */
public class BitSubtraction {
    
    
    public static int subtraction(int a, int b) {
        return BitAddition.addition(a, BitAddition.addition(~b, 1));
    }
    
    public static void main(String arg[]) {
        System.out.println(subtraction(12, 4));
        System.out.println(subtraction(0, 12));
    }
}
