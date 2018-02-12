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
public class SelectionSort {
    
    
    public static int[] sort(int arrayOfData[]) {
        for(int i = 0; i < arrayOfData.length; i++) {
            int minimumIndex = i;
            for(int j = i + 1; j < arrayOfData.length; j++) {
                if(arrayOfData[j] < arrayOfData[minimumIndex]) minimumIndex = j;
            }
            int swap = arrayOfData[i];
            arrayOfData[i] = arrayOfData[minimumIndex];
            arrayOfData[minimumIndex] = swap;
        }
        
        return arrayOfData;
    }
    
    
    public static void main(String arg[]) {
        int integerData[] = {5, 2, 9, 1, 8, 3, 7, 4, 6};
        SelectionSort.sort(integerData);
        
        for (int i = 0; i < integerData.length; i++) System.out.printf("%d\t", integerData[i]);
    }

 
}
