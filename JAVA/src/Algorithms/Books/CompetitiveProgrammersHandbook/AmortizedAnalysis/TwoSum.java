/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Books.CompetitiveProgrammersHandbook.AmortizedAnalysis;
import Algorithms.Sorting.InsertionSort;
/**
 *
 * @author argshub
 */
public class TwoSum {
    
    
    public static boolean sum(int data[], int target) {
        data = InsertionSort.sort(data);
        int i = 0, j = data.length - 1, sum = 0;
        boolean check = false;
        while(i < j) {
            sum = data[i] + data[j];
            if(sum == target) {
                System.out.printf("Sum 1 -> index: %d & index: %d\n", i++, j--);
                check = true;
            }
            else if(sum > target) j--;
            else i++;
            System.out.printf("%d\t", sum);
        }
        return check;
    }
    
    public static void main(String arg[]) {
        int data[] = {1, 4, 5, 6, 7, 9, 9, 10};
        System.out.println(sum(data, 13));
    }
}
