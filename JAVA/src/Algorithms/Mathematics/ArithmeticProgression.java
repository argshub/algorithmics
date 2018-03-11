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
public class ArithmeticProgression {
    
    public static int progression(int first, int difference, int position) {
        return first + (position - 1) * difference;
    }
    
    public static int sumOfArithmeticProgression(int first, int difference, int total) {
        return total * (progression(first, difference, 1) + progression(first, difference, total)) / 2;
    }
    
    public static void main(String arg[]) {
        System.out.println(progression(2, 2, 5));
        System.out.println(sumOfArithmeticProgression(2, 2, 5));
    }
}
