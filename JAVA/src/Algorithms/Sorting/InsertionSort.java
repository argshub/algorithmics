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
public class InsertionSort {
    
    public static void sort(int arrayOfData[]) {
        int leftIndex = 0, currentElement = 0;
        for(int i = 1; i < arrayOfData.length; i++) {
            currentElement = arrayOfData[i]; leftIndex = i - 1;
            while(leftIndex >= 0 && currentElement < arrayOfData[leftIndex]) arrayOfData[leftIndex+1] = arrayOfData[leftIndex--];
            arrayOfData[++leftIndex] = currentElement;
        }
    }
    
    public static void main(String arg[]) {
        int integerData[] = {5, 2, 9, 1, 8, 3, 7, 4, 6};
        InsertionSort.sort(integerData);
        
        for (int i = 0; i < integerData.length; i++) System.out.printf("%d\t", integerData[i]);
    }
    
}
