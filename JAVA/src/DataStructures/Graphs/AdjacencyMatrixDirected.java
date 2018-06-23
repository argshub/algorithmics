package DataStructures.Graphs;

/**
 * Created by argshub on 5/29/2018.
 */
public class AdjacencyMatrixDirected {

    public static class Vertex {
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

        boolean adjacent[][] = new boolean[5][5];

        adjacent[1][2] = true;
        adjacent[2][3] = true;
        adjacent[2][4] = true;
        adjacent[3][4] = true;
        adjacent[4][1] = true;

        for (int i = 0; i < adjacent.length; i++) {
            for (int j = 0; j < adjacent[i].length; j++) {
                if(adjacent[i][j]) {
                    System.out.printf("%c -> %c\n", vertex[i].symbol, vertex[j].symbol);
                }
            }
        }
    }


}
