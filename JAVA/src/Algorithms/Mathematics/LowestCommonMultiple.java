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
public class LowestCommonMultiple {
    
    public static int LCM(int x, int y) {
        if(x > y) return (x / GreatestCommonDivisor.GCD(x, y)) * y;
        else return (y / GreatestCommonDivisor.GCD(x, y)) * x;
    }
    
    public static void main(String arg[]) {
        System.out.println(LCM(4, 17));
        System.out.println(LCM(20, 5));
    }
}
