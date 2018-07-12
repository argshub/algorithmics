/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Arrays;

/**
 *
 * @author argshub
 */
public class PrintDuplicateInAArray {
    
    
    public static void duplicate(int data[]) {
        int x;
        for(int i = 0; i < data.length; i++) {
            x = data[i] < 0 ? data[i] * -1 : data[i];
            if(data[x] < 0) System.out.printf("%d\t", x);
            else data[x] = data[x] * -1;
        }
    }
    
    
    public static void main(String arg[]) {
        int data[] = {4, 2, 3, 8, 6, 1, 2, 1, 3}; 
        duplicate(data);
    }
}
