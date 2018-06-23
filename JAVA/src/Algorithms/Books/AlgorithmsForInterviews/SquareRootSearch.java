package Algorithms.Books.AlgorithmsForInterviews;

/**
 * Created by argshub on 6/1/2018.
 */
public class SquareRootSearch {


    public static int search(int number) {
        int begin = 0, end = 10000, square = 0, mid = 0;
        while (begin <= end) {
            mid = begin + (end - begin) / 2;
            square = mid * mid;
            if(square == number || (square < number && ((mid+ 1) * (mid + 1)) > number)) return mid;
            else if(square > number) end = mid;
            else begin = mid;
        }
        return -1;
    }

    public static void main(String arg[]) {
        System.out.println(search(25));
        System.out.println(search(27));
        System.out.println(search(36));
        System.out.println(search(46));
        System.out.println(search(122));
        System.out.println(search(200));
    }
}
