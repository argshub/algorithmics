package Algorithms.GeeksForGeeks.Arrays;

/**
 * Created by argshub on 6/5/2018.
 */
public class CountNumberOfOccurrenceInASortedArray {


    public static int occur(int data[], int k) {
        int begin = 0, end = data.length - 1, mid;
        while (begin <= end) {
            mid = begin + (end - begin) / 2;
            if(data[mid] == k) {
                int i = mid - 1, j = mid + 1, counter = 1;
                while (i >= 0 || j < data.length) {
                    System.out.printf("%d -> %d\n", i, j);
                    if(i >= 0)
                        if(data[i--] == k) counter++;
                        else i = -1;
                    if(j < data.length)
                        if(data[j++] == k) counter++;
                        else j = data.length;


                }
                return counter;
            } else if(data[mid] > k) end = mid - 1;
            else begin = mid + 1;
        }
        return -1;
    }

    public static void main(String arg[]) {
        int data[] = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(occur(data, 2));
        System.out.println(occur(data, 3));
        System.out.println(occur(data, 1));
        System.out.println(occur(data, 4));
    }
}
