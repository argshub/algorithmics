/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Others;

/**
 *
 * @author argshub
 */
public class PyramidDrawing {
    
    public static void draw(int n, int size) {
        int space = size - n;
        for(int i = 0; i < n; i++) System.out.printf("%c", '*');
        System.out.println();
    }
    
    
    public static void pyramid(int n, int size) {
        if(n > size) return;
        draw(n, size);
        pyramid(n+1, size);
    }
    
    
    public static void main(String arg[]) {
        pyramid(0, 5);
    }
}
