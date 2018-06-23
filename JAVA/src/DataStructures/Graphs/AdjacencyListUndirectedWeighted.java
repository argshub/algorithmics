package DataStructures.Graphs;

/**
 * Created by argshub on 5/29/2018.
 */
public class AdjacencyListUndirectedWeighted {
    public static class Vertex {

        private int weight[];
        private char symbol;
        private Vertex vertex[];
        private int counter;
        private Vertex(char symbol) {
            this.symbol = symbol;
            this.vertex = new Vertex[5];
            this.counter = 0;
            this.weight = new int[5];
        }

        public void adjacent(Vertex vertex, int weight) {
            this.vertex[this.counter] = vertex;
            this.weight[this.counter++] = weight;
        }
    }


    public static void main(String arg[]) {
        Vertex vertex[] =  new Vertex[5];
        vertex[1] = new Vertex('A');
        vertex[2] = new Vertex('B');
        vertex[3] = new Vertex('C');
        vertex[4] = new Vertex('D');

        vertex[1].adjacent(vertex[2], 5);
        vertex[2].adjacent(vertex[1], 5);

        vertex[2].adjacent(vertex[3], 7);
        vertex[3].adjacent(vertex[2], 7);

        vertex[1].adjacent(vertex[4], 2);
        vertex[4].adjacent(vertex[1], 2);

        vertex[2].adjacent(vertex[4], 6);
        vertex[4].adjacent(vertex[2], 6);

        vertex[3].adjacent(vertex[4], 5);
        vertex[4].adjacent(vertex[3], 5);


        for (int i = 0; i < vertex.length; i++) {
            if(vertex[i] != null) {
                for (int j = 0; j < vertex[i].vertex.length; j++) {
                    if(vertex[i].vertex[j] != null) {
                        System.out.printf("%c - %c & weight: %d\n", vertex[i].symbol, vertex[i].vertex[j].symbol, vertex[i].weight[j]);
                    }
                }
            }
        }

    }
}
