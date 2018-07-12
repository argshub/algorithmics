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
public class NextSmallerElement {
    public static int search(int data[], int key) {
        int low = 0, high = data.length - 1, mid = 0;
        while(low <= high) {
            mid = low + (high - low) / 2;
            if(data[mid] == key) {
                --mid;
                while(mid >=  0) {
                    if(data[mid] < key) return data[mid];
                    mid--;
                }
                return -1;
            } else if(data[mid] > key) high = mid - 1;
            else low = mid + 1;
        }
        return data[high];
    }
    
   
    public static void main(String arg[]) {
        int data[] = {1, 2, 3, 4, 6, 7 ,8, 9};
        System.out.println(search(data, 5));
        System.out.println(search(data, 1));
       System.out.println(search(data, 9));
    }
}
