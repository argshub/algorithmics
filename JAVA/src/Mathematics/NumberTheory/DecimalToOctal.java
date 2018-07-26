/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics.NumberTheory;

/**
 *
 * @author argshub
 */
public class DecimalToOctal {
    
    public static int octal(int decimal) {
       if(decimal / 8 == 0) return decimal % 8;
       else return octal(decimal / 8) * 10 + decimal % 8;
    }
    
    
    public static int decimal(int octal) {
        int decimal = 0, count = 0;
        while(octal > 0) {
            decimal += (octal % 10) * ((int) Math.pow(8, count++));
            octal /= 10;
        }
        return decimal;
    }
    
    public static void main(String arg[]) {
        System.out.println(octal(144));
        System.out.println(decimal(220));
    }
}
