package Books.AFI;

/**
 * Created by argshub on 7/20/2018.
 */
public class ComputingSquareRoots {


    public static int sqrt(int number) {
        int low = 1, high = number / 2, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if((mid * mid == number || (mid * mid) < number) && (mid + 1) * (mid + 1) > number) return mid;
            else if(mid * mid > number) high = mid - 1;
            else low = mid + 1;
        }
        return 0;
    }

    public static void main(String arg[]) {
        System.out.println(sqrt(1));
        System.out.println(sqrt(2));
        System.out.println(sqrt(3));
        System.out.println(sqrt(4));
        System.out.println(sqrt(5));
        System.out.println(sqrt(6));
        System.out.println(sqrt(33));
        System.out.println(sqrt(37));
        System.out.println(sqrt(100));
        System.out.println(sqrt(144));
        System.out.println(sqrt(169));
    }
}
