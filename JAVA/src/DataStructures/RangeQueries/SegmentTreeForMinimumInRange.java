package DataStructures.RangeQueries;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.IndexOutOfRange;

/**
 * Created by xenonus on 7/28/2010.
 */
public class SegmentTreeForMinimumInRange {

    private int data[];
    private int length;

    public SegmentTreeForMinimumInRange(int data[]) {
        this.data = data;
        this.length = this.data.length;
        this.buildSegmentTree();
    }

    private int min(int a, int b) {
        return a > b ? b : a;
    }

    private void buildSegmentTree() {
        int data[] = new int[this.length * 2];
        for (int i = 0; i < this.length; i++) data[(this.length + i)] = this.data[i];
        for (int i = this.length - 1; i >= 0; i--) data[i] = this.min(data[i * 2], data[i * 2 + 1]);
        this.data = data;
    }

    public int minimumInRange(int first, int last) throws IndexOutOfRange {
        if(last > this.length) throw new IndexOutOfRange("Index Out Of Range", this.length - 1);
        first = first + this.length;
        last = last + this.length;
        int minimum = Integer.MAX_VALUE;
        while (first < last) {
            if((first & 1) != 0) {
                minimum = this.min(minimum, this.data[first]);
                first = first + 1;
            }
            if((last & 1) != 0) {
                last = last - 1;
                minimum = this.min(minimum, this.data[last]);
            }
            first /= 2;
            last /= 2;
        }
        return minimum;
    }

    public void update(int index, int val) {
        index = index + this.length;
        this.data[index] = val;
        while (index > 1) {
            index /= 2;
            this.data[index] = min(this.data[index * 2], this.data[index * 2 + 1]);
        }
    }


    public static void main(String arg[]) {

        try {
            int data[] = {1, 5, 3, 7, 2, 6, 5, 0, 8};
            SegmentTreeForMinimumInRange segmentTreeForMinimumInRange = new SegmentTreeForMinimumInRange(data);

            System.out.println(segmentTreeForMinimumInRange.minimumInRange(0, 9));
            segmentTreeForMinimumInRange.update(7, 77);
            System.out.println(segmentTreeForMinimumInRange.minimumInRange(0, 9));

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }

    }

}
