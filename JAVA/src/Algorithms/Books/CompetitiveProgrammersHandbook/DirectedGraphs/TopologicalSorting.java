package Algorithms.Books.CompetitiveProgrammersHandbook.DirectedGraphs;

/**
 * Created by argshub on 6/4/2018.
 */
public class TopologicalSorting {

    public enum State {NOT_VISITED, PROCESSING, VISITED};

    public static class VTX {
        private int symbol, counter;
        private VTX adj[];
        private State state;

        public VTX(int symbol) {
            this.symbol = symbol;
            this.adj = new VTX[5];
            this.counter = 0;
            state = State.NOT_VISITED;
        }

        public void adjacent(VTX vtx) {
            this.adj[this.counter] = vtx;
        }
    }
    public static int counter = 0;

    public static void sort(VTX vtx, VTX order[]) {
        if(vtx.state == State.PROCESSING) {
            System.out.println("Cycle Exists");
            return;
        } else if(vtx.state == State.VISITED) return;
        vtx.state = State.PROCESSING;
        for (int  i = 0; i < vtx.adj.length; i++) {
            if(vtx.adj[i] != null) {
                sort(vtx.adj[i], order);
            }
        }
        vtx.state = State.VISITED;
        order[counter++] = vtx;
    }



    public static void main(String arg[]) {

        VTX vtx[] = new VTX[6];
        VTX order[] = new VTX[6];


        vtx[0] = new VTX(1);
        vtx[1] = new VTX(2);
        vtx[2] = new VTX(3);
        vtx[3] = new VTX(4);
        vtx[4] = new VTX(5);
        vtx[5] = new VTX(6);

        vtx[0].adjacent(vtx[1]);
        vtx[1].adjacent(vtx[2]);
        vtx[2].adjacent(vtx[5]);
        //vtx[2].adjacent(vtx[4]);
        vtx[3].adjacent(vtx[0]);
        vtx[3].adjacent(vtx[4]);
        vtx[4].adjacent(vtx[1]);
        vtx[4].adjacent(vtx[2]);

        for (int i = 0; i < vtx.length; i++) {
            sort(vtx[i], order);
        }


            int i = 0, j = order.length -1;
            while (i < j) {
                VTX temp = order[i];
                order[i] = order[j];
                order[j] = temp;
                i++;
                j--;
            }
            for (int k = 0; k < order.length; k++) System.out.printf("%d\t", order[k].symbol);


    }
}
