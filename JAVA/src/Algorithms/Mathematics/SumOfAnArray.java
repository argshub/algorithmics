package Algorithms.Mathematics;

/**
 * Created by xenonus on 5/22/2018.
 */
public class SumOfAnArray {


    public static int sum(int data[]) {
        int sum = 0;
        int i = 0, length = data.length - 1;
        if((data.length & 1) != 0) sum += data[length--];
        while (i < length) {
            sum += data[i++];
            sum += data[length--];
        }
        return sum;
    }


    public static void main(String arg[]) {
        int data[] = {1, 2, 3, 4, 5};
        System.out.println(sum(data));

    }
}
