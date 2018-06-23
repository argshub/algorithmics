/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Books.CompetitiveProgrammersHandbook.Introduction;
import Algorithms.Bit.DecimalToBinary;
/**
 *
 * @author argshub
 */
public class Set {
    
    
    public static void main(String arg[]) {
        int set1 = 1 | (1 << 1) | (1 << 2) | (1 << 3);
        int set2 = (1 << 1) | (1 << 2) | (1 << 4);
       
       DecimalToBinary.decimalToBinary(set1);
       System.out.println();
       
       DecimalToBinary.decimalToBinary(set2);
       System.out.println();
       
       // Set Union
       DecimalToBinary.decimalToBinary(set1 | set2);
       System.out.println();
       
       // Set Intersection
       DecimalToBinary.decimalToBinary(set1 & set2);
       System.out.println();
       
       // Set Difference
       DecimalToBinary.decimalToBinary(set1 & (~set2));
       System.out.println();
       
       // Set Complement
       DecimalToBinary.decimalToBinary(~set1);
       System.out.println();
    }
}
