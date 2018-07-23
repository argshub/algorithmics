package Algorithms.Strings;

/**
 * Created by xenonus on 8/9/2010.
 */
public class ToLowerCase {



    public static String toLower(String message) {
        char character[] = message.toCharArray();
        for (int i = 0; i < character.length; i++) {
            int value = (int) character[i];
            if(value >= 65 && value <= 90) value += 32;
            character[i] = (char) value;
        }
        return new String(character);
    }

    public static void main(String arg[]) {
        System.out.println(toLower("Hello World: SHAZZAD"));
    }
}
