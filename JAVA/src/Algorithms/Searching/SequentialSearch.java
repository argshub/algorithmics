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
public class SequentialSearch {
    
    public static int search(int data[], int key) throws Exception {
        for(int i = 0; i < data.length; i++) {
            if(data[i] == key) return data[i];
        }
        throw new Exception("Data not Exists on the key: " + key);
    }
    
    public static void main(String arg[]) {
        try {
            int data[] = {8, 2, 9, 6, 5, 4, 7, 3, 1};
            System.out.println(search(data, 4));
            System.out.println(search(data, 12));
            
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
    
}
