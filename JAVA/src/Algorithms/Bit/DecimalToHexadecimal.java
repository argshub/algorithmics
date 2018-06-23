package Algorithms.Bit;

/**
 * Created by xenonus on 5/22/2018.
 */
public class DecimalToHexadecimal {

    public static String convert(int x) {
        int shift = 0;
        char table[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char str[] = new char[8];
        int count = 7;
        while (x != 0) {
            int data = (15 & x);
            str[count--] = table[data];
            x >>= 4;
        }
        return new String(str);
    }


    public static void main(String arg[]) {

        System.out.println(convert(124555522));
    }

}
