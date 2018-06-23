package Algorithms.Strings;

/**
 * Created by xenonus on 8/9/2010.
 */
public class StringContainUniqueCharacters {

    public static boolean isUniqueString(String message) {
        char character[] = message.toCharArray();
        int bitMask1 = 0, bitMask2 = 0;
        for (int i = 0; i < character.length; i++) {
            int value = (int) character[i];
            if(value >= 65 && value <= 90) {
                value -= 65;
                if((bitMask1 & (1 << value)) != 0) return false;
                bitMask1 |= (1 << value);
            } else if(value >= 97 && value <= 122) {
                value -= 97;
                if((bitMask2 & (1 << value)) != 0) return false;
                bitMask2 |= (1 << value);
            }

        }
        return true;
    }

    public static void main(String arg[]) {
        System.out.println(isUniqueString("ZaShzAd"));
    }
}
