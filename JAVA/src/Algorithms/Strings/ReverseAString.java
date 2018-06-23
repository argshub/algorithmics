package Algorithms.Strings;

/**
 * Created by xenonus on 5/22/2018.
 */
public class ReverseAString {


    public static String reverse(String data) {
        char character[] = data.toCharArray();
        int i = 0, j = character.length - 1;
        while (i < j) {
            char temp = character[i];
            character[i++] = character[j];
            character[j--] = temp;
        }
        return new String(character);
    }


    public static void main(String arg[]) {
        System.out.println(reverse("Hellos"));
    }
}
