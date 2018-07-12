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
public class MaximumAppearingElementOrMode {

    public static int[] sort(int data[]) {
        int minIndex;
        for(int i = 0; i < data.length; i++) {
            minIndex = i;
            for(int j = i + 1; j < data.length; j++) {
                if(data[j] < data[minIndex]) minIndex = j;
            }
            int temp  = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
        return data;
    }
        
    
    public static int mode(int data[]) {
        data = sort(data);
        int maxElement = -1, maxAppear = 0;
        int counter, element, j;
        for(int i = 0; i < data.length;) {
           
            counter = 1; element = data[i]; j = i + 1;
            while(j < data.length && data[j] == element) {
                counter++;
                j++;
            }
            if(counter > maxAppear) {
                maxElement = element;
                maxAppear = counter;
            }
            i = j;
        }
        return maxElement;
    }
    
    public static void main(String arg[]) {
        int data[] = {4, 2, 3, 1, 1, 2, 1, 2, 2};
        System.out.println(mode(data));
        
    }
}
