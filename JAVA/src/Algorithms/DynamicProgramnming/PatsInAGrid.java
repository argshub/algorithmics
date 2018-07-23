/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.DynamicProgramnming;

/**
 *
 * @author argshub
 */
public class PatsInAGrid {
    
    
    public static int grid(int data[][]) {
        int sum[][] = new int[data.length][data[0].length];
        for(int i = 1; i < data.length; i++) {
            for(int j = 1; j < data.length; j++) {
                sum[i][j] = (sum[i][j-1] > sum[j][i-1] ? sum[i][j-1] : sum[j][i-1]) + data[i][j];
            }
        }
        return sum[data.length - 1][data[0].length-1];
    }
    
    public static void main(String ar[]) {
        int data[][] = {
            {0, 0, 0, 0, 0, 0},
            {0, 3, 7, 9,2, 7},
            {0, 9, 8, 3, 5, 5},
            {0, 1, 7, 9, 8, 5},
            {0, 3, 8, 6, 4, 10},
            {0, 6, 3, 9, 7, 8}
        };
        System.out.println(grid(data));
    }
}
