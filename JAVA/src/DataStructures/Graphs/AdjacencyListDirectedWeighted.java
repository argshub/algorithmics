package DataStructures.Graphs;

/**
 * Created by argshub on 5/29/2018.
 */
public class AdjacencyListDirectedWeighted {
    public static class Vertex {
        private Vertex vtx[];
        private int weight[];
        private char symbol;
        private int counter;
        private Vertex(char symbol) {
            this.symbol = symbol;
            this.vtx = new Vertex[5];
            this.counter = 0;
            this.weight = new int[5];
        }

        public void adjacent(Vertex vertex, int weight) {
            this.vtx[this.counter] = vertex;
            this.weight[this.counter++] = weight;
        }
    }

    public static void main(String arg[]) {

        Vertex vertex[] = new Vertex[5];
        vertex[1]  = new Vertex('A');
        vertex[2] = new Vertex('B');
        vertex[3] = new Vertex('C');
        vertex[4] = new Vertex('D');

        vertex[1].adjacent(vertex[2], 5);
        vertex[2].adjacent(vertex[3], 7);
        vertex[2].adjacent(vertex[4], 6);
        vertex[3].adjacent(vertex[4], 5);
        vertex[4].adjacent(vertex[1], 2);


        for (int i = 0; i < vertex.length; i++) {
            if(vertex[i] != null) {
                for (int j = 0; j < vertex[i].vtx.length; j++) {
                    if(vertex[i].vtx[j] != null) {
                        System.out.printf("%c -> %c & weight: %d\n", vertex[i].symbol, vertex[i].vtx[j].symbol, vertex[i].weight[j]);
                    }
                }
            }
        }

    }
}
