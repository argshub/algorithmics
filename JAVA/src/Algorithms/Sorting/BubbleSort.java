/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Sorting;

/**
 *
 * @author argshub
 */
public class BubbleSort {
    
    public static void sort(int arrayOfData[]) {
        for(int i = 0; i  < arrayOfData.length; i++)
            for(int j = 0; j < arrayOfData.length - i - 1; j++)
                if(arrayOfData[j] > arrayOfData[j+1]) {
                    int swap = arrayOfData[j];
                    arrayOfData[j] = arrayOfData[j+1];
                    arrayOfData[j+1] = swap;
                }
                
    }
    
    public static void main(String arg[]) {
        
        int arrayOfData[] = {5, 2, 9, 1, 8, 5, 7, 4, 6};
        BubbleSort.sort(arrayOfData);
        
        for(int x : arrayOfData) System.out.printf("%d\t", x);
        
    }
    
}
