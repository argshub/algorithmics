package Algorithms.Books.CompetitiveProgrammersHandbook.BasicsOfGraphs;

/**
 * Created by argshub on 5/29/2018.
 */
public class EdgeListDirectedWeighted {
    private int capacity;
    private Vertex start[], end[];
    private int counter;
    private int weight[];

    public EdgeListDirectedWeighted(int capacity) {
        this.capacity = capacity;
        this.counter = 0;
        this.start = new Vertex[this.capacity];
        this.end = new Vertex[this.capacity];
        this.weight = new int[this.capacity];
    }

    public void addEdge(Vertex start, Vertex end, int weight) {
        this.start[this.counter] = start;
        this.end[this.counter] = end;
        this.weight[this.counter++] = weight;
    }

    private void printGraph() {
        for (int i = 0; i < this.counter; i++) {
            System.out.printf("%c -> %c & weight: %d\n", this.start[i].symbol, this.end[i].symbol, this.weight[i]);
        }
    }

    private static class Vertex {
        private char symbol;
        private Vertex(char symbol) {
            this.symbol = symbol;
        }

    }



    public static void main(String arg[]) {

        Vertex vertex[] = new Vertex[5];
        vertex[1]  = new Vertex('A');
        vertex[2] = new Vertex('B');
        vertex[3] = new Vertex('C');
        vertex[4] = new Vertex('D');

        EdgeListDirectedWeighted edgeListDirectedWeighted = new EdgeListDirectedWeighted(10);
        edgeListDirectedWeighted.addEdge(vertex[1], vertex[2], 5);
        edgeListDirectedWeighted.addEdge(vertex[2], vertex[3], 7);
        edgeListDirectedWeighted.addEdge(vertex[2], vertex[4], 6);
        edgeListDirectedWeighted.addEdge(vertex[3], vertex[4], 5);
        edgeListDirectedWeighted.addEdge(vertex[4], vertex[1], 2);

        edgeListDirectedWeighted.printGraph();


    }

}
