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
public class BitAddition {
    
    public static int addition(int a, int b) {
        if(b == 0) return a;
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return addition(sum, carry);
    }
    
    public static void main(String arg[]) {
        System.out.println(addition(12, 4));
        System.out.println(addition(17, 4));
    }
    
}
