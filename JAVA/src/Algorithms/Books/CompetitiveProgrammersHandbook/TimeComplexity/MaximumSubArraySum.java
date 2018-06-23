/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Books.CompetitiveProgrammersHandbook.TimeComplexity;

/**
 *
 * @author argshub
 */
public class MaximumSubArraySum {
    
    
    public static int sum(int data[]) {
        int sum = 0, best = 0;
        for(int i = 0; i < data.length; i++) {
            sum = max(data[i], sum + data[i]);
            best = max(best, sum);
        }
        return best;
    }
    
    public static int max(int x, int  y) {
        return x > y ? x : y;
    }
    
    public static void main(String arg[]) {
        int data[] = {-1, 2, 4, -3, 5, 2, -5, 2};
        System.out.println(sum(data));
    }
}
