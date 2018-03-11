/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Searching;

/**
 *
 * @author argshub
 */
public class BinarySearch {
    
    
    public static int search(int data[], int key) throws Exception {
        int low = 0;
        int high = data.length - 1;
        int mid = 0;
        while(low <= high) {
            mid = (low + high) / 2;
            if(data[mid] == key) return data[mid];
            else if(data[mid] > key) high = mid - 1;
            else low = mid + 1;
        }
        throw new Exception("Data Not Exists on Key: " + key);
    }
    
    public static void main(String arg[]) {
        try {
            int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(search(data, 9));
            System.out.println(search(data, 2));
            System.out.println(search(data, 5));
            System.out.println(search(data, 1));
            System.out.println(search(data, 0));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
