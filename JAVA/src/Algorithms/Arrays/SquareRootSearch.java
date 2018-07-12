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
public class SquareRootSearch {
    
    public static int search(int key) {
        int low = 0, high = key / 2, mid = 0;
        long sqr = 0;
        while(true) {
            mid = low + (high - low) / 2;
            sqr = mid * mid;
            if(sqr <= key && (mid + 1) * (mid + 1) > key) break;
            else if(sqr > key) high = mid - 1;
            else low = mid + 1;
        }
        return mid;
    }
    
    public static void main(String arg[]) {
        System.out.println(search(121));
    }
}
