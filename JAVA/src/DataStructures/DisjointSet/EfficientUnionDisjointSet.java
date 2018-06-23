package DataStructures.DisjointSet;

/**
 * Created by xenonus on 5/20/2018.
 */
public class EfficientUnionDisjointSet {

    private int data[];

    public EfficientUnionDisjointSet(int data[]) {
        this.data = data;
        for (int i = 0; i < data.length; i++) this.data[i]  = i;
    }

    public int find(int index) {
        while (index != this.data[index]) index = this.data[index];
        return index;
    }

    public void union(int first, int second) {
        int pid = this.find(first);
        int qid = this.find(second);
        this.data[pid] = qid;
        for (int i = 0; i < this.data.length; i++) System.out.printf("%d\t", this.data[i]);
        System.out.println();
    }

    public boolean connected(int i, int i1) {
        return find(i) == find(i1);
    }

    public static void main(String arg[]) {
        int data[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        EfficientUnionDisjointSet efficientUnionDisjointSet = new EfficientUnionDisjointSet(data);

        efficientUnionDisjointSet.union(0, 5);
        efficientUnionDisjointSet.union(5, 6);
        efficientUnionDisjointSet.union(1, 2);
        efficientUnionDisjointSet.union(2, 7);
        efficientUnionDisjointSet.union(6, 7);

        efficientUnionDisjointSet.union(3, 9);
        efficientUnionDisjointSet.union(4, 9);
        efficientUnionDisjointSet.union(4, 7);



        System.out.println(efficientUnionDisjointSet.connected(0, 2));
        System.out.println(efficientUnionDisjointSet.connected(3, 7));
        System.out.println(efficientUnionDisjointSet.connected(5, 2));
    }


}
