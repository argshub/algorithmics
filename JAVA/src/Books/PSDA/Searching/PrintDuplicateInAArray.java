/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Books.PSDA.Searching;
import Algorithms.Sorting.InsertionSort;
import java.util.HashSet;
/**
 *
 * @author argshub
 */
public class PrintDuplicateInAArray {
    
    public static void algorithmOne(int data[]) {
        int x;
        for(int i = 0; i < data.length; i++) {
           x = data[i] < 0 ? data[i] * -1 : data[i];
           if(data[x] < 0) {
               System.out.printf("%d\t", x);
               data[x] = data[x] * -1;
           }
           else data[x] = data[x] * -1;
       }
    }
    
    public static void algorithmTwo(int data[]) {
        for(int i = 0; i < data.length - 1; i++) 
            for(int j = i + 1; j < data.length; j++)
                if(data[i] == data[j]) System.out.printf("%d\t", data[i]);
    }
    
    public static void algorithmThree(int data[]) {
        InsertionSort.sort(data);
        int counter, j;
        for(int i = 0; i < data.length - 1;) {
            counter =  1; j = i + 1;
            while(j < data.length && data[i] == data[j]) {
                j++;
                counter++;
            }
            if(counter > 1) System.out.printf("%d\t", data[i]);
            i = j;
        }
    }
    
    public static void algorithmFour(int data[]) {
        HashSet<Integer> hashSet = new HashSet();
        for(int i = 0; i < data.length; i++) {
            if(hashSet.contains(data[i])) System.out.printf("%d\t", data[i]);
            else hashSet.add(data[i]);
        }
    }
    
    public static void algorithmFive(int data[]) {
        int d[] = new int[data.length];
        for(int i = 0; i < data.length; i++) d[data[i]]++;
        for(int i = 0; i < d.length; i++)
            if(d[i] > 1) System.out.printf("%d\t", i); 
    }
    
    public static void main(String rag[]) {
        int data[] =  {1, 2, 3, 1, 3, 6, 6};
        
        //algorithmOne(data);
        //algorithmThree(data);
        //algorithmTwo(data);
       //algorithmFour(data);
       algorithmFive(data);
        
        
     }
    
}
