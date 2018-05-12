package DataStructures.Trees;
import DataStructures.Arrays.VectorOrArrayList;
import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.IndexOutOfRange;

/**
 * Created by xenonus on 7/27/2010.
 */
public class BinaryTree<T> {

    private VectorOrArrayList<T> vectorOrArrayList;

    private int counter;

    public BinaryTree() {
        this.vectorOrArrayList = new VectorOrArrayList<T>(10);
        this.vectorOrArrayList.insert(null);
        this.counter = 1;
    }

    public void insert(T data) {
        this.vectorOrArrayList.insert(data);
        this.counter++;
    }

    public void preOrderTraversal(int root) throws IndexOutOfRange {
        if(root >= this.counter) return;
        System.out.printf("data: %d & index: %d\n", this.vectorOrArrayList.atIndex(root), root);
        this.preOrderTraversal(root * 2);
        this.preOrderTraversal(root * 2 + 1);
    }

    public void postOrderTraversal(int root) throws IndexOutOfRange {
        if(root >= this.counter) return;
        this.postOrderTraversal(root * 2);
        this.postOrderTraversal(root * 2 + 1);
        System.out.printf("data: %d & index: %d\n", this.vectorOrArrayList.atIndex(root), root);
    }

    public void inOrderTraversal(int root) throws IndexOutOfRange {
        if(root >= this.counter) return;
        this.inOrderTraversal(root * 2);
        System.out.printf("data: %d & index: %d\n", this.vectorOrArrayList.atIndex(root), root);
        this.inOrderTraversal(root * 2 + 1);
    }

    public static void main(String arg[]) {
        try {
            BinaryTree<Integer> binaryTree = new BinaryTree<>();

            binaryTree.insert(5);
            binaryTree.insert(6);
            binaryTree.insert(7);
            binaryTree.insert(8);
            binaryTree.insert(9);
            binaryTree.insert(5);
            binaryTree.insert(2);
            binaryTree.insert(1);
            binaryTree.insert(0);

            System.out.println("PreOrder Traversal");
            binaryTree.preOrderTraversal(1);
            System.out.println("Post Order Traversal");
            binaryTree.postOrderTraversal(1);
            System.out.println("InOrder Traversal");
            binaryTree.inOrderTraversal(1);

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }

    }
}
