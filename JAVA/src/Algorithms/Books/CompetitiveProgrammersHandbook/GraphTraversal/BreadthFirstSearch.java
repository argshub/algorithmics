package Algorithms.Books.CompetitiveProgrammersHandbook.GraphTraversal;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Queues.Queue;

/**
 * Created by argshub on 6/4/2018.
 */
public class BreadthFirstSearch {

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

    public static void bfs(Vertex vertex)  throws DataStructuresExceptions{
        Queue<Vertex> queue = new Queue<>();
        queue.enqueue(vertex);
        vertex.visited = true;
        while (!queue.empty()) {
            Vertex vertex1 = queue.front();
            queue.dequeue();
            System.out.printf("%c\t", vertex1.symbol);
            for (int i = 0; i < vertex1.adj.length; i++) {
                if(vertex1.adj[i] != null) {
                    if(!vertex1.adj[i].visited) {
                        queue.enqueue(vertex1.adj[i]);
                        vertex1.adj[i].visited = true;
                    }
                }
            }
        }
    }

    public static void main(String arg[]) {

        try {

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

            bfs(vertex[0]);

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }

    }
}
