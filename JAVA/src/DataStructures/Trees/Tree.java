package DataStructures.Trees;

import DataStructures.Iter.Iterator;
import DataStructures.Lists.DoublyLinkedList;

/**
 * Created by xenonus on 7/27/2010.
 */
public class Tree {

    private String element;

    private DoublyLinkedList<Tree> doublyLinkedList;


    public Tree(String element) {
        this.element = element;
        this.doublyLinkedList = new DoublyLinkedList<>();
    }

    public void addChild(Tree tree) {
        this.doublyLinkedList.insertBack(tree);
    }

    public void preOrderTraversal(Tree root) {
        System.out.println(root.element);
        Iterator iterator = root.doublyLinkedList.iterator();
        while (iterator.hasNext()) {
            this.preOrderTraversal((Tree) iterator.next());
        }
    }

    public void postOrderTraversal(Tree root) {
        Iterator iterator = root.doublyLinkedList.iterator();
        while (iterator.hasNext()) {
            postOrderTraversal((Tree) iterator.next());
        }
        System.out.println(root.element);
    }


    public static void main(String arg[]) {

        Tree root = new Tree("Algorithm");
        Tree chapter1 = new Tree("Fundamentals");
        chapter1.addChild(new Tree("Algorithm Analysis"));
        chapter1.addChild(new Tree("Algorithm Complexity"));

        Tree chapter2 = new Tree("Sorting");
        chapter2.addChild(new Tree("Bubble sort"));
        chapter2.addChild(new Tree("Insertion sort"));
        chapter2.addChild(new Tree("Selection sort"));

        Tree chapter3 = new Tree("Searching");
        chapter3.addChild(new Tree("Sequential Search"));
        chapter3.addChild(new Tree("Binary Search"));
        chapter3.addChild(new Tree("Ternary Search"));

        Tree chapter4 = new Tree("Graph");
        chapter4.addChild(new Tree("Adjacency Matrix"));
        chapter4.addChild(new Tree("Adjacency List"));
        chapter4.addChild(new Tree("Edge List"));

        Tree chapter5 = new Tree("String");
        chapter5.addChild(new Tree("Trie"));
        chapter5.addChild(new Tree("Suffix Tree"));

        root.addChild(chapter1);
        root.addChild(chapter2);
        root.addChild(chapter3);
        root.addChild(chapter4);
        root.addChild(chapter5);

        root.postOrderTraversal(root);
        root.preOrderTraversal(root);
    }

}
