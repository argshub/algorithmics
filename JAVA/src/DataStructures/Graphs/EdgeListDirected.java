package DataStructures.Graphs;

/**
 * Created by argshub on 5/29/2018.
 */
public class EdgeListDirected {

    private int capacity;
    private Vertex start[], end[];
    private int counter;

    public EdgeListDirected(int capacity) {
        this.capacity = capacity;
        this.counter = 0;
        this.start = new Vertex[this.capacity];
        this.end = new Vertex[this.capacity];
    }

    public void addEdge(Vertex start, Vertex end) {
        this.start[this.counter] = start;
        this.end[this.counter++] = end;
    }

    private void printGraph() {
        for (int i = 0; i < this.counter; i++) {
            System.out.printf("%c -> %c\n", this.start[i].symbol, this.end[i].symbol);
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

        EdgeListDirected edgeListDirected = new EdgeListDirected(10);
        edgeListDirected.addEdge(vertex[1], vertex[2]);
        edgeListDirected.addEdge(vertex[2], vertex[3]);
        edgeListDirected.addEdge(vertex[2], vertex[4]);
        edgeListDirected.addEdge(vertex[3], vertex[4]);
        edgeListDirected.addEdge(vertex[4], vertex[1]);

        edgeListDirected.printGraph();


    }


}
