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
public class SearchASortedArrayWhereIndexEqualToElement {
    
    public static int search(int data[]) {
        int low = 0, high = data.length - 1, mid = 0;
        while(low <= high) {
            mid = low + (high - low) / 2;
            if(data[mid] == mid) return data[mid];
            else if(data[mid] > mid) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
    
    public static void main(String arg[]) {
        int data[] = {-10, -5, 0, 3, 7};
        System.out.println(search(data));
        
        
    }
}
