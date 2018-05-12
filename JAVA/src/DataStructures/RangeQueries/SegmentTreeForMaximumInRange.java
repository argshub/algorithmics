package DataStructures.RangeQueries;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.IndexOutOfRange;

/**
 * Created by xenonus on 7/28/2010.
 */
public class SegmentTreeForMaximumInRange {
    private int data[];
    private int length;

    public SegmentTreeForMaximumInRange(int data[]) {
        this.data = data;
        this.length = this.data.length;
        this.buildSegmentTree();
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }

    private void buildSegmentTree() {
        int data[] = new int[this.length * 2];
        for (int i = 0; i < this.length; i++) data[(this.length + i)] = this.data[i];
        for (int i = this.length - 1; i >= 0; i--) data[i] = this.max(data[i * 2], data[i * 2 + 1]);
        this.data = data;
    }

    public int maximumInRange(int first, int last) throws IndexOutOfRange {
        if(last > this.length) throw new IndexOutOfRange("Index Out Of Range", this.length - 1);
        first = first + this.length;
        last = last + this.length;
        int maximum = Integer.MIN_VALUE;
        while (first < last) {
            if((first & 1) != 0) {
                maximum = this.max(maximum, this.data[first]);
                first = first + 1;
            }
            if((last & 1) != 0) {
                last = last - 1;
                maximum = this.max(maximum, this.data[last]);
            }
            first /= 2;
            last /= 2;
        }
        return maximum;
    }

    public void update(int index, int val) {
        index = index + this.length;
        this.data[index] = val;
        while (index > 1) {
            index /= 2;
            this.data[index] = this.max(this.data[index * 2], this.data[index * 2 + 1]);
        }
    }


    public static void main(String arg[]) {

        try {
            int data[] = {1, 5, 3, 7, 2, 6, 5, 0, 8};
            SegmentTreeForMaximumInRange segmentTreeForMinimumInRange = new SegmentTreeForMaximumInRange(data);

            System.out.println(segmentTreeForMinimumInRange.maximumInRange(0, 9));
            segmentTreeForMinimumInRange.update(7, 77);
            System.out.println(segmentTreeForMinimumInRange.maximumInRange(0, 9));

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }

    }
}
