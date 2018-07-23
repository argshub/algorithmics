/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Books.PSDA.Searching;
import Algorithms.Sorting.InsertionSort;
/**
 *
 * @author argshub
 */
public class MaximumAppearingElementInAArray {
     
    public static int algorithmOne(int data[]) {
        InsertionSort.sort(data);
        int counter, j, maxElement = -1, maxCounter = 0;
        for(int i = 0; i < data.length - 1;) {
            counter =  1; j = i + 1;
            while(j < data.length && data[i] == data[j]) {
                j++;
                counter++;
            }
            if(counter > maxCounter){
                maxCounter = counter;
                maxElement = data[i];
            }
            i = j;
        }
        return maxElement;
    }
    
    
    public static int algorithmTwo(int data[]) {
        int maxElement = data[0], maxCounter = 1, counter = 1, cur = data[0];
        for(int i = 1; i < data.length; i++) {
           if(data[i] == data[i - 1]) {
               counter++;
           } else {
               counter = 1;
               cur = data[i];
           }
           if(counter > maxCounter) {
               maxCounter = counter;
               maxElement = cur;
           } 
       }
        return maxElement;
    }
    
    
    public static void main(String rag[]) {
        int data[] =  {1, 2, 3, 1, 3, 6, 3, 6, 6, 3};
        
        System.out.println(algorithmOne(data));
        System.out.println(algorithmTwo(data));
     }
    
}
