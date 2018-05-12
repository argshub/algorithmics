package DataStructures.RangeQueries;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.IndexOutOfRange;

/**
 * Created by xenonus on 7/28/2010.
 */
public class SegmentTreeForSumOfRange {
    private int data[];
    private int length;

    public SegmentTreeForSumOfRange(int data[]) {
        this.data = data;
        this.length = this.data.length;
        this.buildSegmentTree();
    }


    private void buildSegmentTree() {
        int data[] = new int[this.length * 2];
        for (int i = 0; i < this.length; i++) data[(this.length + i)] = this.data[i];
        for (int i = this.length - 1; i >= 0; i--) data[i] = data[i * 2] + data[i * 2 + 1];
        this.data = data;
    }

    public int maximumInRange(int first, int last) throws IndexOutOfRange {
        if(last >= this.length) throw new IndexOutOfRange("Index Out Of Range", this.length - 1);
        first = first + this.length;
        last = last + this.length + 1;
        int sum = 0;
        while (first < last) {
            if((first & 1) != 0) {
            sum += this.data[first];
            first = first + 1;
        }
        if((last & 1) != 0) {
            last = last - 1;
            sum += this.data[last];
        }
        first /= 2;
        last /= 2;
    }
        return sum;
    }

    public void update(int index, int val) {
        index = index + this.length;
        this.data[index] = val;
        while (index > 1) {
            index /= 2;
            this.data[index] = this.data[index * 2] + this.data[index * 2 + 1];
        }
    }


    public static void main(String arg[]) {

        try {
            int data[] = {1, 5, 3, 7, 2, 6, 5, 8};
            SegmentTreeForSumOfRange segmentTreeForSumOfRange = new SegmentTreeForSumOfRange(data);

            System.out.println(segmentTreeForSumOfRange.maximumInRange(0, 7));

            System.out.println(segmentTreeForSumOfRange.maximumInRange(3, 5));

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }

    }
}
