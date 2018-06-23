package DataStructures.DisjointSet;

/**
 * Created by xenonus on 5/20/2018.
 */
public class EfficientFindDisjointSet {

    private int data[];

    public EfficientFindDisjointSet(int data[]) {
        this.data = data;
        for (int i = 0; i < data.length; i++) this.data[i]  = i;
    }

    public int find(int index) {
        return this.data[index];
    }

    public boolean connected(int first, int second) {
        return find(first) == find(second);
    }

    public void union(int first, int second) {
        int pid = this.data[first];
        int qid = this.data[second];
        for (int i = 0; i < this.data.length; i++) {
            if(this.data[i] == pid) this.data[i] = qid;
        }
        for (int i = 0; i < this.data.length; i++) System.out.printf("%d\t", this.data[i]);
        System.out.println();
    }

    public static void main(String arg[]) {
        int data[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        EfficientFindDisjointSet efficientFindDisjointSet = new EfficientFindDisjointSet(data);

        efficientFindDisjointSet.union(0, 5);
        efficientFindDisjointSet.union(5, 6);
        efficientFindDisjointSet.union(1, 2);
        efficientFindDisjointSet.union(2, 7);
        efficientFindDisjointSet.union(6, 7);

        efficientFindDisjointSet.union(3, 4);
        efficientFindDisjointSet.union(3, 8);
        efficientFindDisjointSet.union(4, 9);



        System.out.println(efficientFindDisjointSet.connected(0, 2));
        System.out.println(efficientFindDisjointSet.connected(3, 9));
        System.out.println(efficientFindDisjointSet.connected(4, 9));
    }

}
