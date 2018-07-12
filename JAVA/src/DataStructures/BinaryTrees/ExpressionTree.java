package DataStructures.BinaryTrees;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Stacks.Stack;

/**
 * Created by argshub on 6/7/2018.
 */
public class ExpressionTree {

    private Node head;

    public ExpressionTree(String postfix) throws DataStructuresExceptions {
        this.head = null;
        this.buildTree(postfix);
    }

    private void buildTree(String postfix) throws DataStructuresExceptions{
        char characters[] = postfix.toCharArray();
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < characters.length; i++) {
            char symbol = characters[i];
            if(isOperator(symbol)) {
                Node node = new Node(symbol);
                node.left = stack.top();
                stack.pop();
                node.right = stack.top();
                stack.pop();
                stack.push(node);
            } else stack.push(new Node(symbol));
        }
        this.head = stack.top();
    }

    private boolean isOperator(char symbol) {
        return symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/';
    }

    public void inOrderTraversal() {
        this.inOrderTraversal(this.head);
    }

    public void inOrderTraversal(Node node) {
        if(node == null) return;
        inOrderTraversal(node.left);
        System.out.printf("%c\t", node.symbol);
        inOrderTraversal(node.right);
    }

    public int evaluate() {
        return evaluate(this.head);
    }

    private int evaluate(Node node) {
        if(!isOperator(node.symbol)) return (int) node.symbol;
        int left = evaluate(node.left);
        int right = evaluate(node.right);
        return expression(left, right, node.symbol);
    }

    private int expression(int left, int right, char symbol) {
        if(symbol == '+') return left + right;
        else if(symbol == '-') return left - right;
        else if(symbol == '*') return left * right;
        else return left / right;
    }

    private class Node {
        private Node left, right;
        private char symbol;
        private Node(char symbol) {
            this.left = this.right = null;
            this.symbol = symbol;
        }
    }

    public static void main(String arg[]) {
        try {

            ExpressionTree expressionTree = new ExpressionTree("12+37-9*/");
            expressionTree.inOrderTraversal();

            System.out.println(expressionTree.evaluate());
        } catch (DataStructuresExceptions dataStructuresExceptions) {

        }
    }
}
