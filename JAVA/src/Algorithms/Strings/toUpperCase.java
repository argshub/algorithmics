/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Strings;


/**
 *
 * @author argshub
 */
public class toUpperCase {
   
    public static String toUpperCase(String data) {
        char characters[] = data.toCharArray();
        for(int i = 0; i < characters.length; i++) {
            int characterCode = (int) characters[i];
            if(characterCode >= 97 && characterCode <= 122) characters[i] = (char) (characterCode - 32);
        }
        return data.valueOf(characters);
    }
    
    public static void main(String arg[]) {
        System.out.println(toUpperCase("abcdeiifghijklmnopqrstwxyz"));
    }
}
