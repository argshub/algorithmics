package Algorithms.Strings;

/**
 * Created by xenonus on 8/10/2010.
 */
public class StringContainUniqueCharacterIgnoreCase {


    public static boolean isUnique(String message) {
        char character[] = message.toCharArray();
        int bitMask = 0;
        for (int i = 0; i < character.length; i++) {
            int value = (int) character[i];
            if(value >= 65 && value <= 90) {
                value -= value;
                if((bitMask & (1 << value)) != 0) return false;
                bitMask |= (1 << value);
            } else if(value >= 97 && value <= 122) {
                value -= 97;
                if((bitMask & (1 << value)) != 0) return false;
                bitMask |= (1 << value);
            }
        }
        return true;
    }

    public static void main(String arg[]) {
        System.out.println(isUnique("shzad"));
        System.out.println(isUnique("dD"));
    }
}
