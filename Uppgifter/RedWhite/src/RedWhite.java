import edu.princeton.cs.algs4.Graph;

public class RedWhite {
    public static int count(Graph G, int[] rednodes) {
        int rw_count = 0;
        boolean[] markedRed = new boolean[G.V()];
        for (int i : rednodes){
            markedRed[i] = true;
        }


        for (int i : rednodes){
            for (int j : G.adj(i)){
                if (!markedRed[j]){
                    rw_count++;
                }
            }
        }
        // Count how many of the edges in G connect a white node (one that
        // isn't in rednodes) with a red node (one that is in rednodes).

        return rw_count;
    }
}