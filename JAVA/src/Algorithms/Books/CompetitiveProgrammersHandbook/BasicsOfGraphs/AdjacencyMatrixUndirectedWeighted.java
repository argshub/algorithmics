package Algorithms.Books.CompetitiveProgrammersHandbook.BasicsOfGraphs;

/**
 * Created by argshub on 5/29/2018.
 */
public class AdjacencyMatrixUndirectedWeighted {

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

        int adjacent[][] = new int[5][5];

        adjacent[1][2] = 5;
        adjacent[2][1] = 5;

        adjacent[2][3] = 7;
        adjacent[3][2] = 7;

        adjacent[2][4] = 6;
        adjacent[4][2] = 6;

        adjacent[3][4] = 5;
        adjacent[4][3] = 5;

        adjacent[4][1] = 2;
        adjacent[1][4] = 2;

        for (int i = 0; i < adjacent.length; i++) {
            for (int j = 0; j < adjacent[i].length; j++) {
                if(adjacent[i][j] != 0) {
                    System.out.printf("%c - %c & weight: %d\n", vertex[i].symbol, vertex[j].symbol, adjacent[i][j]);
                }
            }
        }
    }
}
