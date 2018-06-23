package Algorithms.Strings;

/**
 * Created by xenonus on 8/9/2010.
 */
public class ToUpperCase {

    public static String toUpperCase(String message) {
        char character[] = message.toCharArray();
        for (int i = 0; i < character.length; i++) {
            int value = (int) character[i];
            if(value >= 97 && value <= 122) value -= 32;
            character[i] = (char) value;
        }
        return new String(character);
    }

    public static void main(String arg[]) {
        System.out.println(toUpperCase("HEllo World: shazzad"));
    }
}
