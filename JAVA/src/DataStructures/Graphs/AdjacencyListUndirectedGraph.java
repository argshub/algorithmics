package DataStructures.Graphs;

/**
 * Created by argshub on 5/29/2018.
 */
public class AdjacencyListUndirectedGraph {


    public static class Vertex {

        private char symbol;
        private Vertex vertex[];
        private int counter;
        private Vertex(char symbol) {
            this.symbol = symbol;
            this.vertex = new Vertex[5];
            this.counter = 0;
        }

        public void adjacent(Vertex vertex) {
            this.vertex[this.counter++] = vertex;
        }
    }


    public static void main(String arg[]) {
        Vertex vertex[] =  new Vertex[5];
        vertex[1] = new Vertex('A');
        vertex[2] = new Vertex('B');
        vertex[3] = new Vertex('C');
        vertex[4] = new Vertex('D');

        vertex[1].adjacent(vertex[2]);
        vertex[2].adjacent(vertex[1]);

        vertex[2].adjacent(vertex[3]);
        vertex[3].adjacent(vertex[2]);

        vertex[1].adjacent(vertex[4]);
        vertex[4].adjacent(vertex[1]);

        vertex[2].adjacent(vertex[4]);
        vertex[4].adjacent(vertex[2]);

        vertex[3].adjacent(vertex[4]);
        vertex[4].adjacent(vertex[3]);


        for (int i = 0; i < vertex.length; i++) {
            if(vertex[i] != null) {
                for (int j = 0; j < vertex[i].vertex.length; j++) {
                    if(vertex[i].vertex[j] != null) {
                        System.out.printf("%c - %c\n", vertex[i].symbol, vertex[i].vertex[j].symbol);
                    }
                }
            }
        }

    }
}
