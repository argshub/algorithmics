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
public class ToLowerCase {
    
    
    public static String toLowerCase(String data) {
        char characters[] = data.toCharArray();
        for(int i = 0; i < characters.length; i++) {
            int characterCode = (int) characters[i];
            if(characterCode >= 65 && characterCode <= 90) characters[i] = (char) (characterCode + 32);
        }
        return data.valueOf(characters);
    }
    
    public static void main(String arg[]) {
        System.out.println(toLowerCase("ABCDEiiFGHIJKLMNOPQRSTWXYZ"));
    }
}
