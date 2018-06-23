/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Books.CompetitiveProgrammersHandbook.AmortizedAnalysis;

/**
 *
 * @author argshub
 */
public class SubArraySum {
    
    public static boolean sum(int data[], int target) {
        int i = 0, j = 0, sum = 0;
        while((j <= data.length && i < data.length)) {
            if(sum == target) return true;
            else if(sum > target) {
                sum -= data[i++];
            } else {
                if(j == data.length) {
                    j++;
                    continue;
                }
                else sum += data[j++];
            }
            System.out.printf("%d %d %d\t\t", sum, i, j);
        }
        return false;
    }
    
    public static void main(String arg[]) {
        int data[] = {9, 2, 7, 1, 6, 4, 9, 3};
        System.out.println(sum(data, 2));
        System.out.println(sum(data, 13));
        System.out.println(sum(data, 12));
    }
}
