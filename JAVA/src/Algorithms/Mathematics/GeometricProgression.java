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
public class GeometricProgression {
    
    public static int progression(int first, int ratio, int position) {
        return first * BinaryExponentation.exponent(ratio, position - 1);
    }
    public static int sumOfProgression(int first, int ratio, int total) {
        return first * (1 - BinaryExponentation.exponent(ratio, total)) / (1 - ratio);
    }
    
    public static void main(String arg[]) {
        System.out.println(progression(2, 2, 5));
        System.out.println(sumOfProgression(2, 2, 5));
    }
}
