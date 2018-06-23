package Algorithms.Books.CompetitiveProgrammersHandbook.GraphTraversal;

import Algorithms.Books.CompetitiveProgrammersHandbook.BasicsOfGraphs.AdjacencyListDirectedGraph;
import DataStructures.Arrays.VectorOrArrayList;

/**
 * Created by argshub on 6/4/2018.
 */
public class DepthFirstSearch {

    public static class Vertex {
        private char symbol;
        private boolean visited;
        private Vertex adj[];
        private int counter;
        public Vertex(char symbol) {
            this.visited = false;
            this.symbol = symbol;
            this.adj = new Vertex[5];
            this.counter = 0;
        }

        public void adjacent(Vertex vertex) {
            this.adj[this.counter++] = vertex;
        }
    }

    public static void dfs(Vertex vertex) {
        if(vertex.visited) return;
        vertex.visited = true;
        for (int i = 0; i < vertex.adj.length; i++) {
            if(vertex.adj[i] != null) {
                dfs(vertex.adj[i]);
            }
        }
        System.out.printf("%c\t", vertex.symbol);
    }

    public static void main(String arg[]) {

        Vertex vertex[] = new Vertex[5];
        vertex[0] = new Vertex('1');
        vertex[1] = new Vertex('2');
        vertex[2] = new Vertex('3');
        vertex[3] = new Vertex('4');
        vertex[4] = new Vertex('5');

        vertex[0].adjacent(vertex[1]);
        vertex[0].adjacent(vertex[3]);
        vertex[1].adjacent(vertex[2]);
        vertex[1].adjacent(vertex[4]);
        vertex[2].adjacent(vertex[1]);
        vertex[2].adjacent(vertex[4]);
        vertex[3].adjacent(vertex[0]);
        vertex[4].adjacent(vertex[1]);
        vertex[4].adjacent(vertex[2]);

        dfs(vertex[0]);

    }
}
