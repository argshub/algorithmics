package DataStructures.BinarySearchTree;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.ValueNotExistsOnThatKey;

/**
 * Created by xenonus on 8/9/2010.
 */
public class BinarySearchTree {

    private int count;
    private Node root;

    public BinarySearchTree() {

    }

    public void insert(final int element) {
        root = this.insert(root, element);
    }

    private Node insert(Node root, final int element) {
        if(root == null) root = new Node(element);
        else if(root.element < element) root.right = this.insert(root.right, element);
        else if(element < root.element) root.left = this.insert(root.left, element);
        return root;
    }

    public int search(int key) throws ValueNotExistsOnThatKey {
        if(search(root, key) == null) throw new ValueNotExistsOnThatKey("Value not exists on key " + key);
        return search(root, key).element;
    }

    private Node search(Node root, int key) {
        if(root == null) return null;
        if(root.element == key) return root;
        else if(root.element < key) return search(root.right, key);
        else return search(root.left, key);
    }

    public void delete(int key) throws ValueNotExistsOnThatKey {
        Node searchNode = search(root, key);
        if(searchNode == null) throw new ValueNotExistsOnThatKey("Value not Exists on key  " + key);
        if(searchNode.left == null && root.right == null) {

        } else if(searchNode.left == null) {
            searchNode.element = searchNode.right.element;
            searchNode.left = searchNode.right.left;
            searchNode.right = searchNode.right.right;
        } else if(searchNode.right == null) {
            searchNode.element = searchNode.left.element;
            searchNode.right = searchNode.left.right;
            searchNode.left = searchNode.left.left;
        } else {
            Node current = searchNode.left;
            Node trail = null;

            while (current.right != null) {
                trail = current;
                current = current.right;
            }
            searchNode.element = current.element;
            if(trail == null) {
                searchNode.left = current.left;
            } else trail.right = current.left;
        }
    }

    public void preOrderTraversal() {
        this.preOrderTraversal(root);
    }

    private void preOrderTraversal(Node root) {
        if(root == null) return;
        System.out.printf("%d\t", root.element);
        this.preOrderTraversal(root.left);
        this.preOrderTraversal(root.right);
    }

    private class Node {
        private int element;
        private Node left, right;
        private Node(final int element) {
            this.element = element;
            this.left = this.right = null;
        }
    }


    public static void main(String arg[]) {

        try {

            BinarySearchTree binarySearchTree = new BinarySearchTree();

            binarySearchTree.insert(100);
            binarySearchTree.insert(90);
            binarySearchTree.insert(107);
            binarySearchTree.insert(105);

            binarySearchTree.insert(120);
            binarySearchTree.insert(118);
            binarySearchTree.insert(104);
            binarySearchTree.insert(103);
            binarySearchTree.insert(124);
            binarySearchTree.insert(127);
            binarySearchTree.insert(125);
            binarySearchTree.insert(126);
           binarySearchTree.insert(106);

            binarySearchTree.preOrderTraversal();

            binarySearchTree.delete(107);
            System.out.println();
            binarySearchTree.preOrderTraversal();
            System.out.println();
            binarySearchTree.delete(124);
            binarySearchTree.preOrderTraversal();
            System.out.println();
            binarySearchTree.delete(127);

            binarySearchTree.preOrderTraversal();
            System.out.println();
        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }

}
