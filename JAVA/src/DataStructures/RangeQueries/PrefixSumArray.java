package DataStructures.RangeQueries;

/**
 * Created by xenonus on 7/28/2010.
 */
public class PrefixSumArray {

    private int length;
    private int data[];

    public PrefixSumArray(int data[]) {
        this.length = data.length;
        for (int i = 1; i < data.length; i++) {
            data[i] += data[i - 1];
        }
        this.data = data;
        for (int i = 0; i < this.data.length; i++) System.out.printf("%d\t", this.data[i]);
        System.out.println();
    }

    public int sumOfRange(int first, int last) {
        return this.data[last] - (first > 0 ? this.data[first - 1] : 0);
    }


    public static void main(String arg[]) {
        int data[] = {1, 5, 3, 7, 3, 6, 5, 0, 8};
        PrefixSumArray prefixSumArray = new PrefixSumArray(data);
        System.out.println(prefixSumArray.sumOfRange(0, 8));
        System.out.println(prefixSumArray.sumOfRange(5, 5));
    }
}
