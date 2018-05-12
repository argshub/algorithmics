package DataStructures.RangeQueries;

/**
 * Created by xenonus on 7/28/2010.
 */
public class BinaryIndexedTreeOrFenwickTree {

    private int length;
    private int data[];

    public BinaryIndexedTreeOrFenwickTree(int data[]) {
        this.data = new int[data.length + 1];
        for (int i = 1; i <= data.length; i++) {
            this.buildTree(i, data[i - 1]);
        }
    }

    private void buildTree(int index, int value) {
        while (index < this.data.length) {
            this.data[index] += value;
            index += (index & (-index));
        }
        this.printTree();
    }

    private void printTree() {
        for (int i = 0; i < this.data.length; i++) System.out.printf("%d\t", this.data[i]);
        System.out.println();
    }

    public int rangeSum(int first, int last) {
        return rangeSum(last) - rangeSum(first - 1);
    }

    public int rangeSum(int last) {
        last++;
        int sum = 0;
        while (last > 0) {
            sum += this.data[last];
            last -= (last & (-last));
        }
        return sum;
    }

    public void add(int index, int value) {
        index++;
        while (index < this.data.length) {
            this.data[index] += value;
            index += (index & (-index));
        }
        this.printTree();
    }

    public static void main(String arg[]) {
        int data[] = {1, 5, 3, 7, 3, 6, 5, 0, 8};
        BinaryIndexedTreeOrFenwickTree binaryIndexedTreeOrFenwickTree = new BinaryIndexedTreeOrFenwickTree(data);
        System.out.println(binaryIndexedTreeOrFenwickTree.rangeSum(0, 8));
        binaryIndexedTreeOrFenwickTree.add(6, 10);
        System.out.println(binaryIndexedTreeOrFenwickTree.rangeSum(0, 8));
    }
}
