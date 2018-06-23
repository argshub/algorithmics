package Algorithms.Books.AlgorithmsForInterviews;

/**
 * Created by argshub on 6/1/2018.
 */
public class SmallestElementOfAGivenKey {

    public static int search(int data[], int key) {
        int begin = 0, end = data.length - 1, mid;
        while (begin <= end) {
            mid = begin + (end - begin) / 2;
            if(data[mid]  == key) {
                while (mid >= 0) {
                    if(data[mid] < key) return data[mid];
                    mid--;
                }
                return -1;
            }
            else if(data[mid] < key) begin = mid + 1;
            else end = mid - 1;
        }
        return data[end];
    }


    public static void main(String arg[]) {

        int data[] = {1, 2, 3, 4, 6, 7, 8 , 9};
        System.out.println(search(data, 5));
    }
}
